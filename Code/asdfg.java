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
    private double side;

    public Square(double s) {
        this.side = s;
        this.area = s * s;
    }
}

class Rectangle extends Shape {
    private double length;
    private double breadth;

    public Rectangle(double l, double b) {
        this.length = l;
        this.breadth = b;
        this.area = length * breadth;
    }
}

public class asdfg {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        Square square = new Square(4.0);
        Rectangle rectangle = new Rectangle(6.0, 8.0);

        System.out.println("Circle Area: " + circle.calcarea());
        System.out.println("Square Area: " + square.calcarea());
        System.out.println("Rectangle Area: " + rectangle.calcarea());
    }
}
