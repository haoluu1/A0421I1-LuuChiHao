package model;

public class Product {
    private int id;
    private String Name;
    private double Price;
    private String Description;
    private String Producer;

    public Product() {
    }

    public Product(int id, String name, double price, String description, String producer) {
        this.id = id;
        Name = name;
        Price = price;
        Description = description;
        Producer = producer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getProducer() {
        return Producer;
    }

    public void setProducer(String producer) {
        Producer = producer;
    }
}
