package com.company;

public class Main {

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        rectangle1.x = 10;
        rectangle1.y = 110;

        Rectangle rectangle2 = new Rectangle();
        rectangle2.x = 10;
        rectangle2.y = rectangle2.x;

        Rectangle rectangle3 = new Rectangle();
        rectangle3.x = 10;
        rectangle3.y = 12;

//        Rectangle rectangle4 = new Rectangle();
//        rectangle4.x = 11;
//        rectangle4.y = 10;
//
//        Rectangle rectangle5 = new Rectangle();
//        rectangle5.x = 19;
//        rectangle5.y = 10;


        System.out.print("Площадь фигуры № 1 равна " + rectangle1.printArea() + " - и ");
        rectangle1.printRectagleKind();
        System.out.print("Площадь фигуры № 2 равна " + rectangle2.printArea() + " - и ");
        rectangle2.printRectagleKind();
        System.out.print("Площадь фигуры № 3 равна " + rectangle3.printArea() + " - и ");
        rectangle3.printRectagleKind();
//        System.out.print("Площадь фигуры № 4 равна " + rectangle4.printArea() + " - и ");
//        rectangle4.printRectagleKind();
//        System.out.print("Площадь фигуры № 4 равна " + rectangle5.printArea() + " - и ");
//        rectangle5.printRectagleKind();


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
