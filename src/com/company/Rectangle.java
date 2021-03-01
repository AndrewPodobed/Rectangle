package com.company;

public class Rectangle {
    double x;
    double y;
    static private int createdRectangles;

        public Rectangle(double x, double y) {
        this.x = x;
        this.y = y;
        createdRectangles++;
    }

    public Rectangle(double x) {
        this.x = x;
        this.y = x;
        createdRectangles++;
    }

    double calculateArea() {
        return x * y;
    }

    public double printArea() {
        return this.calculateArea();
            }


    public void printRectagleKind() {

        if (x == 0 && y == 0) {
            System.out.println("Площадь равна 0");
        } else if (x != y) {
            System.out.println("Это прямоугольник");
        } else if (x == y) {
            System.out.println("Это квадрат");
        }

    }

    public boolean isTheSameRectangle(Rectangle rectangle) {
        if (this.x == rectangle.x && this.y == rectangle.y) {
            System.out.println("равны");
            return true;
        } else {
            System.out.println("не равны");
            return false;
        }

    }

    static void printRectangleCount() {
        System.out.println(("Всего было создано " + Rectangle.createdRectangles + " прямоугольников"));
    }

    private final static String RUSSIAN_CLASS_NAME = "Прямоугольник";
    private final static String ENGLISH_CLASS_NAME = "Rectangle";

    static boolean printClassName(boolean printlnRussian) {
        if (printlnRussian) {
            System.out.println(RUSSIAN_CLASS_NAME);
        }
        else {
            System.out.println(ENGLISH_CLASS_NAME);
        }

        return printlnRussian;
    }

}
