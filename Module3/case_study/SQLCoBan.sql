use QuanLyFurama;

select * from Employee where EmployeeName like 'H%' or EmployeeName like 'T%' or EmployeeName like 'K%' and length(EmployeeName)<=15;

select * from Customer where year(CustomerDateOfBirth) between 1971 and 2003 and CustomerAddress like '%Đà Nẵng%' or CustomerAddress like '%Quảng Trị%';

select Contract.CustomerID, Customer.CustomerName, count(Contract.ContractID) as NumberDetail
from Customer join Contract on Customer.CustomerID= Contract.CustomerID 
where Customer.CustomerTypeId= 1
group by Contract.CustomerID
order by NumberDetail;

select Customer.CustomerId, Customer.CustomerName, CustomerType.CustomerTypeName, Contract.ContractID, Service.ServiceName, Contract.ContractStartDate, Contract.ContractEndDate, 