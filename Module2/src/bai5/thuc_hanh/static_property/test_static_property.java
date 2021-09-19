package bai5.thuc_hanh.static_property;

public class test_static_property
{
    public static void main(String[] args)
    {

        car car1 = new car("Mazda 3","Skyactiv 3");

        System.out.println(car.numberOfCars);

        car car2 = new car("Mazda 6","Skyactiv 6");

        System.out.println(car.numberOfCars);

    }
}
