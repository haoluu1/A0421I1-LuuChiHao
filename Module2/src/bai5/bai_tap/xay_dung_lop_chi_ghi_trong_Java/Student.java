package bai5.bai_tap.xay_dung_lop_chi_ghi_trong_Java;

public class Student
{
    private String name="John";
    private String classes="CO2";

    public Student()
    {
    }

    public Student(String name, String classes)
    {
        this.name = name;
        this.classes = classes;
    }

    public Student(int i, String vũ_kiều_anh, String hà_nội) {
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setClasses(String classes)
    {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", classes='" + classes + '\'' +
                '}';
    }
}
