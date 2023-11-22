package DSF;
import java.util.Scanner;

class Shape {
    public double area;
    public Shape() {
        this.area = 0.0;
    }
    public Shape(double area) {
        this.area = area;
    }
    public double calcarea() {
        return area;
    }
}

class Circle extends Shape {
    public double radius;

    public Circle(double r) {
        this.radius = r;
        this.area = 3.14 * r * r;
    }
}

class Square extends Shape {
    public double side;

    public Square(double s) {
        this.side = s;
        this.area = s * s;
    }
}

class Rectangle extends Shape {
    public double length;
    public double breadth;

    public Rectangle(double l, double b) {
        this.length = l;
        this.breadth = b;
        this.area = length * breadth;
    }
}

public class asdfg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius of circle: ");
        double r = sc.nextDouble();
        Circle circle = new Circle(r);
        System.out.println("Circle Area: " + circle.calcarea());

        System.out.print("Enter side of square: ");
        double s = sc.nextDouble();
        Square square = new Square(s);
        System.out.println("Square Area: " + square.calcarea());
        

        System.out.print("Enter length,breadth of rectangle: ");
        double l = sc.nextDouble();
        double b = sc.nextDouble();
        Rectangle rectangle = new Rectangle(l,b);
        System.out.println("Rectangle Area: " + rectangle.calcarea());
    }
}
