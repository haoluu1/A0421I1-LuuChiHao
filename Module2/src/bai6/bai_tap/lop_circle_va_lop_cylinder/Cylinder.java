package bai6.bai_tap.lop_circle_va_lop_cylinder;

public class Cylinder extends Cricle
{
    private double heigh;

    public Cylinder()
    {
    }

    public Cylinder(double radius, String color, double heigh)
    {
        super(radius, color);
        this.heigh = heigh;
    }

    public double getHeigh()
    {
        return heigh;
    }

    public void setHeigh(double heigh)
    {
        this.heigh = heigh;
    }

    public double getArea()
    {
        return getRadius()*getRadius()*3.14*heigh;
    }

    @Override
    public String toString()
    {
        return "Cylinder{" +
                "heigh=" + heigh +
                '}';
    }
}
