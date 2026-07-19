package com.example.utils;

import com.example.geometry.Circle;
import com.example.geometry.Rectangle;

public class Calculator {
    public static void main(String[] args) {

        Rectangle rect = new Rectangle(10, 29);
        Circle cir = new Circle(25);

        double areaRect = rect.length * rect.breadth;
        double areaCir = Math.PI * Math.pow(cir.radius, 2);

        System.out.printf("---------------------------------------\n");
        System.out.printf("Area Of Rectangle: %f\n", areaRect);
        System.out.printf("Area Of Circle: %f\n", areaCir);
    }
}
