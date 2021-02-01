package com.company;

public class Rectangle {
    double x;
    double y;

    public void Rectangle(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void Rectangle(double x) {
        this.x = x;
        this.y = x;
    }

    double calculateArea() {
        return x * y;
    }

    public double printArea() {
        return this.calculateArea();

    }

    public void printRectagleKind () {
        if (x == 0 && y == 0){
            System.out.println("Площадь равна 0");
        } else if(x != y){
            System.out.println("Это прямоугольник");
        } else if (x == y){
            System.out.println("Это квадрат");
        }
    }

    public boolean isTheSameRectangle (Rectangle rectangle) {
        if (this.x == rectangle.x && this.y == rectangle.y) {
            System.out.println("равны");
            return true;
        } else {
            System.out.println("не равны");
            return false;
        }

    }

}
