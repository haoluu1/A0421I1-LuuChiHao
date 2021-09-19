package bai6.bai_tap.thiet_ke_va_trien_khai_lop_triangle;

import bai6.thuc_hanh.he_cac_doi_tuong_hinh_hoc.Shape;

public class Triangle extends Shape {
    private double side1 = 3.0f;
    private double side2 = 4.0f;
    private double side3 = 5.0f;

    public Triangle() {
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle(String color, boolean filled, double side1, double side2, double side3) {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getArea(){
        return (Math.sqrt((side1+side2+side3)*(side1+side2-side3)*(side2+side3-side1)*(side1+side3-side2)))/4;
    }

    public double getPerimeter(){
        return side1+side2+side3;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                ", Area=" + getArea() +
                ", Perimeter" + getPerimeter() +
                '}';
    }
}
