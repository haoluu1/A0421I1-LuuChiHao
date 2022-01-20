package model;

public class Customer {
    private String Name;
    private String DateOfBirth;
    private String Address;
    private String Photo;

    public Customer() {
    }

    public Customer(String name, String dateOfBirth, String address, String photo) {
        Name = name;
        DateOfBirth = dateOfBirth;
        Address = address;
        Photo = photo;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        DateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getPhoto() {
        return Photo;
    }

    public void setPhoto(String photo) {
        Photo = photo;
    }
}
