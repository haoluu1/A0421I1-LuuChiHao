use QuanLySinhVien;

select *
from `Subject`
group by SubName 
having Credit >= all (select Credit from `Subject`);

select *
from `Subject`
join Mark on `Subject`.SubID= Mark.SubID
group by SubName
having Mark.Mark >= all (select Mark from Mark);

select *, avg(Mark)
from Student join Mark on Student.StudentID= Mark.StudentID
group by Student.StudentID 
order by Mark.Mark desc;
