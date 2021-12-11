use QuanLySinhVien;

select *
from Student
where StudentName like 'h%';

select *
from Class
where month(Class.StartDate)='12';

select *
from `Subject`
where Credit between 3 and 5;

SET SQL_SAFE_UPDATES = 0;
update Student
set ClassID= '2'
where StudentName= 'Hung';
SET SQL_SAFE_UPDATES = 1;

select StudentName, SubName, Mark
from Mark
join Student on Student.StudentID= Mark.StudentID
join `Subject` on `Subject`.SubID= Mark.SubID;