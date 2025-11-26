package com.fellon;

import com.fellon.geometry.*;

public class ThreeDimensionShapesExample {
    public static void main(String[] args) {
        ThreeDimensionalShape cube = new Cube(3);
        ThreeDimensionalShape sphere = new Sphere(2);
        System.out.println("куб: площадь - "+ cube.getSurfaceArea() + " объём - " + cube.getVolume());
        System.out.println("сфера: площадь - "+ sphere.getSurfaceArea() + " объём - " + sphere.getVolume());
    }
}
