use demo_a07;
create table `tai_khoan` (
username varchar(15) primary key,
`password` varchar(100) not null -- là bắt buộc nhập thông tin khi thêm mới hoặc sửa 
);

create table lop_hoc(
ma_lop_hoc int primary key auto_increment,
ten_lop_hoc varchar(100)
);

create table giang_vien(
ma_giang_vien int primary key auto_increment,
ten_giang_vien varchar(100),
ngay_sinh date
);

create table hoc_vien (
-- auto_increment : tự động tăng, áp dụng cho số
ma_hoc_vien int primary key auto_increment,
ten_hoc_vien varchar(100),
ngay_sinh date,
email varchar(100),
-- unique : không trùng lặp
username varchar(15) unique,
ma_lop_hoc int,
foreign key(ma_lop_hoc) references lop_hoc(ma_lop_hoc),
foreign key(username) references tai_khoan(username)
);

create table dia_chi(
ma_dia_chi int primary key auto_increment,
dia_chi varchar (255),
ma_hoc_vien int,
foreign key(ma_hoc_vien) references hoc_vien(ma_hoc_vien)
);

create table giang_vien_day_lop_hoc(
ma_giang_vien int,
ma_lop_hoc int,
primary key(ma_giang_vien,ma_lop_hoc), -- khóa phức hợp
foreign key(ma_giang_vien) references giang_vien(ma_giang_vien),
foreign key(ma_lop_hoc) references  lop_hoc(ma_lop_hoc)
);

insert into tai_khoan(username, `password`) values
("baopham", "123"),
("khanhle", "234"),
("quantran", "345"),
("quynhle", "456"),
("thuyngo", "567"),
("tuanngo", "678"),
("haitran", "789");

insert into lop_hoc(ten_lop_hoc) values
("A1"),
("A2"),
("A3"),
("A4"),
("A5"),
("A6"),
("A7");

insert into giang_vien(ten_giang_vien, ngay_sinh) values
("Huỳnh Chí Vinh", "1976-07-12"),
("Phan Văn Linh", "1977-04-23"),
("Trần Hải Trúc", "1980-09-12"),
("Phan Hà Thu", "1997-05-12"),
("Phạm Huệ Sơn", "1967-11-22"),
("Ngô Hoa An", "1972-01-18"),
("Trần Viện Trai", "1977-04-16");

insert into hoc_vien(ten_hoc_vien, ngay_sinh, email, username, ma_lop_hoc) values
("Phạm Hà Bảo", "1994-03-08", "baopham94@gmail.com", "baopham", 1),
("Lê Bình Khánh", "1998-12-05", "khanhle98@gmail.com", "khanhle", 2),
("Trần Tiên Quân", "1990-04-21", "quantran90@gmail.com", "quantran", 3),
("Lê Xuân Quỳnh", "2001-03-27", "quynhle01@gmail.com", "quynhle", 4),
("Ngô Quý Thùy", "1990-11-06", "thuyngo90@gmail.com", "thuyngo", 5),
("Ngô Minh Tuân", "2002-07-15", "tuanngo02@gmail.com", "tuanngo", 6),
("Ngô Đức Hải", "2004-07-20", "haitran04@gmail.com", "haitran", 7);

insert into dia_chi(dia_chi, ma_hoc_vien) values
("An Giang", 1),
("Bến Tre", 2),
("Cà Mau", 3),
("Khánh Hòa", 4),
("Ninh Bình", 5),
("Đồng Nai", 6),
("Sơn La", 7);

insert into giang_vien_day_lop_hoc(ma_giang_vien, ma_lop_hoc) values
(1, 1),
(2, 2),
(3, 3),
(4, 4),
(5, 5),
(6, 6),
(7, 7);