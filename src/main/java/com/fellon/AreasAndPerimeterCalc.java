package com.fellon;

public class AreasAndPerimeterCalc
{
public static String area = "\nплощадь ";
    public static String perimeter = "\nпериметр ";
    public static void main(String[] args) {
        Circle circle = new Circle(3.0);
        Rectangle rectangle = new Rectangle( 2.0,2.3);
        Triangle triangle = new Triangle(3.0,3.0,3.0);
        System.out.println("круг: " + area + circle.getArea() + perimeter + circle.getPerimeter()+"\n");
        System.out.println("прямоугольник: " + area + rectangle.getArea() + perimeter + rectangle.getPerimeter()+"\n");
        System.out.println("треугольник: " + area + triangle.getArea() + perimeter +  triangle.getPerimeter()+"\n");
    }

}
