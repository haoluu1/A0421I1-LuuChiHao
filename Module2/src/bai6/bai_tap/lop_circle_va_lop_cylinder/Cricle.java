package bai6.bai_tap.lop_circle_va_lop_cylinder;

public class Cricle
{
    private double radius;
    private String color;

    public Cricle()
    {
    }

    public Cricle(double radius, String color)
    {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius()
    {
        return radius;
    }

    public void setRadius(double radius)
    {
        this.radius = radius;
    }

    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public double getArea()
    {
        return radius*radius*3.14;
    }

    @Override
    public String toString()
    {
        return "Cricle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
