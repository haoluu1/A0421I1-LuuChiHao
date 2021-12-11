use QuanLyBanHang;

insert into Customer
values (1, 'Minh Quan', 10);
insert into Customer
values (2, 'Ngoc Oanh', 20);
insert into Customer
values (3, 'Hong Ha', 50);

insert into `Order` (oID, cID, oDate)
values (1, 1, '2006-03-21');
insert into `Order` (oID, cID, oDate)
values (2, 2, '2006-03-23');
insert into `Order` (oID, cID, oDate)
values (3, 1, '2006-03-16');

insert into Product
values (1, 'May Giat', 3);
insert into Product
values (2, 'Tu Lanh', 5);
insert into Product
values (3, 'Dieu Hoa', 7);
insert into Product
values (4, 'Quat', 1);
insert into Product
values (5, 'Bep Dien', 2);

insert into OrderDetail
values (1, 1, 3);
insert into OrderDetail
values (1, 3, 7);
insert into OrderDetail 
values (1, 4, 2);
insert into OrderDetail 
values (2, 1, 1);
insert into OrderDetail 
values (3, 1, 8);
insert into OrderDetail 
values (2, 5, 4);
insert into OrderDetail 
values (2, 3, 3);

select oID, oDate, oTotalPrice
from `Order`;

select count(`Order`.cID) as 'NumberOrder', Customer.cName
from `Order` 
join Customer on `Order`.cID= Customer.cID
group by `Order`.cID having NumberOrder >=1;

select count(OrderDetail.pID) as 'NumberProduct', Product.pName
from OrderDetail
join Product on OrderDetail.pID= Product.pID
group by OrderDetail.pID having NumberProduct >=1;

select *
from Customer
where cID not in (select cID from `Order`);

select *, Product.pPrice * OrderDetail.odQYT as 'Price'
from OrderDetail
join Product on OrderDetail.pID= Product.pID;

select `Order`.oID, `Order`.oDate, sum(PriceProduct.Price) as oTotalPrice
from `Order`
join (select OrderDetail.*, Product.pPrice * OrderDetail.odQYT as 'Price'
      from OrderDetail
      join Product on OrderDetail.pID= Product.pID) PriceProduct
on `Order`.oID= PriceProduct.oID
group by `Order`.oID;
