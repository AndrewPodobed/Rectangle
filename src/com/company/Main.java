package com.company;

public class Main {

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(10, 110);
        Rectangle rectangle2 = new Rectangle(10);
        Rectangle rectangle3 = new Rectangle(10);
        Rectangle rectangle4 = new Rectangle(11,10);
        Rectangle rectangle5 = new Rectangle(15,16);


        System.out.print("Площадь фигуры № 1 равна " + rectangle1.printArea() + " - и ");
        rectangle1.printRectagleKind();
        System.out.print("Площадь фигуры № 2 равна " + rectangle2.printArea() + " - и ");
        rectangle2.printRectagleKind();
        System.out.print("Площадь фигуры № 3 равна " + rectangle3.printArea() + " - и ");
        rectangle3.printRectagleKind();
        System.out.print("Площадь фигуры № 4 равна " + rectangle4.printArea() + " - и ");
        rectangle4.printRectagleKind();
        System.out.print("Площадь фигуры № 4 равна " + rectangle5.printArea() + " - и ");
        rectangle5.printRectagleKind();


        System.out.print("Фигуры №1 и № 2 ");
        rectangle1.isTheSameRectangle(rectangle2);
        System.out.print("Фигуры №1 и № 3 ");
        rectangle1.isTheSameRectangle(rectangle3);
        System.out.print("Фигуры №2 и № 3 ");
        rectangle2.isTheSameRectangle(rectangle3);
        Rectangle.printRectangleCount();
        Rectangle.printClassName(true);

    }
}
