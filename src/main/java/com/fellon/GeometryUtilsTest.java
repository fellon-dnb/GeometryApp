package com.fellon;

import com.fellon.geometry.*;

import java.util.Scanner;

public class GeometryUtilsTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("конвертируем сантиметры");
        System.out.println("1 -  в метры, 2 - в милиметры");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("конвертируем в метры! введи сантиметры: ");
                double cm = scanner.nextDouble();
                System.out.println("результат: "+ GeometryUtils.centsToMeters(cm)+" м.");
                break;
            case 2:
                System.out.println("конвертируем в миллиметры! введи сантиметры: ");
                double cm2 = scanner.nextDouble();
                System.out.println("результат: " + GeometryUtils.centsToMilimetrs(cm2) + " мм.");
                break;
            default:
                System.out.println("неверный выбор");
                break;
        }
        scanner.close();
    }
}
