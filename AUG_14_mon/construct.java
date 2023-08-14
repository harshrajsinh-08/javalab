package AUG_14_mon;
import java.util.Scanner;

class Shape {
    double area;

    public Shape() {
        area = 0.0;
    }

    public Shape(double ar) {
        area = ar;
    }

    public void calculateArea() {
    }
}

class Circle extends Shape {
    double radius;

    public Circle(double rad) {
        radius = rad;
    }

    @Override
    public void calculateArea() {
        area = 3.14 * radius * radius;
    }
}

class Square extends Shape {
    double side;

    public Square(double s) {
        side = s;
    }

    @Override
    public void calculateArea() {
        area = side * side;
    }
}

class Rectangle extends Shape {
    double length;
    double width;

    public Rectangle(double l, double w) {
        length = l;
        width = w;
    }

    @Override
    public void calculateArea() {
        area = length * width;
    }
}

public class construct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        Circle circle = new Circle(radius);
        circle.calculateArea();
        System.out.println("Area of the Circle: " + circle.area);

        System.out.print("Enter the side of the square: ");
        double side = scanner.nextDouble();
        Square square = new Square(side);
        square.calculateArea();
        System.out.println("Area of the Square: " + square.area);

        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(length, width);
        rectangle.calculateArea();
        System.out.println("Area of the Rectangle: " + rectangle.area);

        scanner.close();
    }
}
