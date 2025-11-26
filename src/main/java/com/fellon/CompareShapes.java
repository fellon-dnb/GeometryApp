package com.fellon;

import com.fellon.geometry.GeometryUtils;

public class CompareShapes {
    public static void main(String[] args) {
        Shape shape1 = new Triangle(4,4,3);
       // Shape shape2 = new Triangle(2,4,3);
        Shape shape3 = new Circle(33);
        int resultArea = GeometryUtils.compareAreas(shape1,shape3);
        String print;
        if (resultArea == 0) {
            print = "площадь фигур равна";
        } else if (resultArea > 0) {
            print = "площадь 1й фигуры больше";
        } else  {
            print ="площадь 2й фигуры больше";
        }
        System.out.println(print);
    }
}
