use QuanLyFurama;

-- 2
select * from Employee where (EmployeeName like 'H%' or EmployeeName like 'T%' or EmployeeName like 'K%') and char_length(EmployeeName)<15;

-- 3
select * from Customer where (year(CustomerDateOfBirth) between 1971 and 2003) and (CustomerAddress like '%Đà Nẵng%' or CustomerAddress like '%Quảng Trị%');

-- 4 
select Contract.CustomerID, Customer.CustomerName, count(Contract.ContractID) as NumberDetail
from Customer join Contract on Customer.CustomerID= Contract.CustomerID 
where Customer.CustomerTypeId= 1
group by Contract.CustomerID
order by NumberDetail;

-- 5
select Customer.CustomerID, Customer.CustomerName, CustomerType.CustomerTypeName, Contract.ContractID, Service.ServiceName, Contract.ContractStartDate, Contract.ContractEndDate, sum(Service.CostRent + ContractDetail.Quantily * AccompaniedService.Price) as TotalMoney
from Customer 
left join CustomerType on Customer.CustomerTypeID= CustomerType.CustomerTypeID
left join Contract on Customer.CustomerID= Contract.CustomerID
left join Service on Contract.ServiceID= Service.ServiceID
left join ContractDetail on Contract.ContractID= ContractDetail.ContractID
left join AccompaniedService on ContractDetail.AccompaniedServiceID= AccompaniedService.AccompaniedServiceID
group by Contract.ContractID;

-- 6
select Service.ServiceID, Service.ServiceName, Service.Area, Service.CostRent, ServiceType.ServiceTypeName 
from Service 
join ServiceType on Service.ServiceTypeID= ServiceType.ServiceTypeID
where not exists(select Contract.ContractID from Contract where (Contract.ContractStartDate between '2021-01-01' and '2021-03-31') and Contract.ServiceID= Service.ServiceID);


-- 7
select Service.ServiceID, Service.ServiceName, Service.Area, Service.MaxPeople, Service.CostRent, ServiceType.ServiceTypeName
from Service
join ServiceType on Service.ServiceTypeID= ServiceType.ServiceTypeID
where exists(select Contract.ContractID from Contract where year(Contract.ContractStartDate)= '2020' and Contract.ServiceID= Service.ServiceID)
and not exists(select Contract.ContractID from Contract where year(Contract.ContractStartDate)= '2021' and Contract.ServiceID= Service.ServiceID);

-- 8
select distinct CustomerName from Customer;

select CustomerName from Customer group by CustomerName;

select CustomerName from Customer union select CustomerName from Customer;

-- 9
select Temp.Month, count(month(Contract.ContractStartDate)) as NumberCustomer
from (select 1 as Month
	  union select 2 as Month
      union select 3 as Month
      union select 4 as Month
      union select 5 as Month
      union select 6 as Month
      union select 7 as Month
      union select 8 as Month
      union select 9 as Month
      union select 10 as Month
      union select 11 as Month
      union select 12 as Month) as Temp
left join Contract on month(Contract.ContractStartDate)= Temp.Month
where year(Contract.ContractStartDate)= '2021'
group by Temp.Month
order by Temp.Month;

-- 10
select Contract.ContractID, Contract.ContractStartDate, Contract.ContractEndDate, Contract.Deposit, sum(ContractDetail.Quantily) as NumberAccompaniedService
from Contract
left join ContractDetail on Contract.ContractID= ContractDetail.ContractID
group by Contract.ContractID;