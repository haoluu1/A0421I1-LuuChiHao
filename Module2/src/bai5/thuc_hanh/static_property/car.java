package bai5.thuc_hanh.static_property;

public class car
{
    private String name;

    private String engine;

    public static int numberOfCars;

    public car(String name, String engine)
    {

        this.name = name;

        this.engine = engine;

        numberOfCars++;
    }
}
