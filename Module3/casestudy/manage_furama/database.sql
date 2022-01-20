create database FuramaManage;

use FuramaManage;

create table `Position`(
Position_ID int primary key,
Position_Name varchar(45)
);

create table Education_Degree(
Education_Degree_ID int primary key,
Education_Degree_Name varchar(45)
);

create table Division(
Division_ID int primary key,
Division_Name varchar(45)
);

create table `Role`(
Role_ID int primary key,
Role_Name varchar(255)
);

create table `User`(
Username varchar(255) primary key,
`Password` varchar(255)
);

create table User_Role(
Role_ID int,
foreign key(Role_ID) references `Role`(Role_ID),
Username varchar(255),
foreign key(Username) references `User`(Username)
);

create table Employee(
Employee_ID int primary key,
Employee_Name varchar(45),
Employee_Birthday date,
Employee_ID_Card varchar(45),
Employee_Salary double,
Employee_Phone varchar(45),
Employee_Email varchar(45),
Employee_Address varchar(45),
Position_ID int,
foreign key(Position_ID) references `Position`(Position_ID),
Education_Degree_ID int,
foreign key(Education_Degree_ID) references Education_Degree(Education_Degree_ID),
Division_ID int,
foreign key(Division_ID) references Division(Division_ID),
Username varchar(255)
);

create table Customer_Type(
Customer_Type_ID int primary key,
Customer_Type_Name varchar(45)
);

create table Customer(
Customer_ID int primary key,
Customer_Type_ID int,
foreign key(Customer_Type_ID) references Customer_Type(Customer_Type_ID),
Customer_Name varchar(45),
Customer_Birthday date,
Customer_Gender bit(1),
Customer_ID_Card varchar(45),
Customer_Phone varchar(45),
Customer_Email varchar(45),
Customer_Address varchar(45)
);

create table Rent_Type(
Rent_Type_ID int primary key,
Rent_Type_Name varchar(45),
Rent_Type_Cost double
);

create table Service_Type(
Service_Type_ID int primary key,
Service_Type_Name varchar(45)
);

create table Service(
Service_ID int primary key,
Service_Name varchar(45),
Service_Area int,
Service_Cost double,
Service_Max_People int,
Rent_Type_ID int,
foreign key(Rent_Type_ID) references Rent_Type(Rent_Type_ID),
Service_Type_ID int,
foreign key(Service_Type_ID) references Service_Type(Service_Type_ID),
Standard_Room varchar(45),
Description_Other_Convenence varchar(45),
Pool_Area double,
Numer_Of_Floors int
);

create table Contract(
Contract_ID int primary key,
Contract_Start_Date datetime,
Contract_End_Date datetime,
Contract_Deposit double,
Contract_Total_Money double,
Employee_ID int,
foreign key(Employee_ID) references Employee(Employee_ID),
Customer_ID int,
foreign key(Customer_ID) references Customer(Customer_ID),
Service_ID int,
foreign key(Service_ID) references Service(Service_ID)
);

create table Attach_Service(
Attach_Service_ID int primary key,
Attach_Service_Name varchar(45),
Attach_Service_Cost double,
Attach_Service_Unit int,
Attach_Service_Status varchar(45)
);

create table Contract_Detail(
Contract_Detail_ID int primary key,
Contract_ID int,
foreign key(Contract_ID) references Contract(Contract_ID),
Attach_Service_ID int,
foreign key(Attach_Service_ID) references Attach_Service(Attach_Service_ID),
Quantily int
);