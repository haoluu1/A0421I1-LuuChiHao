create database QuanLyVatTu;

use QuanLyVatTu;

create table VatTu(
MaVatTu int auto_increment primary key,
TenVatTu varchar(50)
);

create table PhieuXuat(
SoPhieuXuat int auto_increment primary key,
NgayXuat datetime
);

create table VatTuPhieuXuat(
ID int auto_increment primary key,
SoLuongXuat int,
DonGiaXuat int,
MaVatTu int,
SoPhieuXuat int,
foreign key(MaVatTu) references VatTu(MaVatTu),
foreign key(SoPhieuXuat) references PhieuXuat(SoPhieuXuat) 
);

create table PhieuNhap(
SoPhieuNhap int auto_increment primary key,
NgayNhap datetime
);

create table VatTuPhieuNhap(
ID int auto_increment primary key,
SoLuongNhap int,
DonGiaNhap int,
MaVatTu int,
SoPhieuNhap int,
foreign key(MaVatTu) references VatTu(MaVatTu),
foreign key(SoPhieuNhap) references PhieuNhap(SoPhieuNhap)
);

create table NhaCungCap(
MaNhaCungCap int auto_increment primary key,
TenNhaCungCap varchar(50),
DiaChi varchar(50),
SoDienThoai varchar(20)
);

create table DonDatHang(
SoDonHang int auto_increment primary key,
NgayDatHang datetime,
MaNhaCungCap int,
foreign key(MaNhaCungCap) references NhaCungCap(MaNhaCungCap)
);

create table VatTuDonDatHang(
ID int auto_increment primary key,
MaVatTu int,
SoDonHang int,
foreign key(MaVatTu) references VatTu(MaVatTu),
foreign key(SoDonHang) references DonDatHang(SoDonHang)
);




