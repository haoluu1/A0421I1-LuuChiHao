create database QuanLyBanHang;

use QuanLyBanHang;

create table Customer(
cID int auto_increment primary key,
cName varchar(50),
cAge int
);

create table `Order`(
oID int auto_increment primary key,
cID int,
oDate datetime,
oTotalPrice int,
foreign key(cID) references Customer(cID)
);

create table Product(
pID int auto_increment primary key,
pName varchar(50),
pPrice int
);

create table OrderDetail(
oID int,
pID int,
odQYT int,
foreign key(oID) references `Order`(oID),
foreign key(pID) references Product(pID)
);
