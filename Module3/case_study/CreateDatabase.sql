create database QuanLyFurama;

use QuanLyFurama;

create table `Position`(
PositionID int auto_increment primary key,
PositionName varchar(45)
);

create table Literacy(
LiteracyID int auto_increment primary key,
LteracyName varchar(45)
);

create table Department(
DepartmentID int auto_increment primary key,
DepartmentName varchar(45)
);

create table Employee(
EmployeeID int auto_increment primary key,
EmployeeName varchar(45),
EmployeeDateOfBirth date,
EmployeeIDNumber varchar(45),
EmployeeSalary double,
EmployeePhoneNumber varchar(45),
EmployeeEmail varchar(45),
EmployeeAddress varchar(45),
PositionID int,
foreign key(PositionID) references `Position`(PositionID),
LiteracyID int,
foreign key(LiteracyID) references Literacy(LiteracyID),
DepartmentID int,
foreign key(DepartmentID) references Department(DepartmentID)
);

create table CustomerType(
CustomerTypeID int auto_increment primary key,
CustomerTypeName varchar(45)
);

create table Customer(
CustomerID int auto_increment primary key,
CustomerTypeID int,
foreign key(CustomerTypeID) references CustomerType(CustomerTypeID),
CustomerName varchar(45),
CustomerDateOfBirth date,
CustomerGender bit(1),
CustomerIDNumer varchar(45),
CustomerPhoneNumber varchar(45),
CustomerEmail varchar(45),
CustomerAddress varchar(45)
);

create table RentType(
RentTypeID int auto_increment primary key,
RentTypeName varchar(45)
);

create table ServiceType(
ServiceTypeID int auto_increment primary key,
ServiceTypeName varchar(45)
);

create table Service(
ServiceID int auto_increment primary key,
ServiceName varchar(45),
Area int,
CostRent double,
MaxPeople int,
RentTypeID int,
foreign key(RentTypeID) references RentType(RentTypeID),
ServiceTypeID int,
foreign key(ServiceTypeID) references ServiceType(ServiceTypeID),
StandardRoom varchar(45),
DescriptionServiceOther varchar(45),
AreaPool double,
Floor int
);

create table Contract(
ContractID int auto_increment primary key,
ContractStartDate datetime,
ContractEndDate datetime,
Deposit double,
EmployeeID int,
foreign key(EmployeeID) references Employee(EmployeeID),
CustomerID int,
foreign key(CustomerID) references Customer(CustomerID),
ServiceID int,
foreign key(ServiceID) references Service(ServiceID)
);

create table AccompaniedService(
AccompaniedServiceID int auto_increment primary key,
AccompaniedServiceName varchar(45),
Price double,
Unit varchar(10),
`Status` varchar(45)
);

create table ContractDetail(
ContractDetailID int auto_increment primary key,
ContractID int,
foreign key(ContractID) references Contract(ContractID),
ServiceID int,
foreign key(ServiceID) references Service(ServiceID),
Quantily int
);
