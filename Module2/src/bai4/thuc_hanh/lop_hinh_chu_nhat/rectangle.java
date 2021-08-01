package bai4.thuc_hanh.lop_hinh_chu_nhat;

public class rectangle
{
    double width, height;

    public rectangle()
    {
    }

    public rectangle(double width, double height)
    {
        this.width = width;
        this.height = height;
    }

    public double getArea()
    {
        return this.width * this.height;
    }

    public double getPerimeter()
    {
        return (this.width + this.height) * 2;
    }

    public String display()
    {
        return "Rectangle{" + "width=" + width + ", height=" + height + "}";
    }
}
