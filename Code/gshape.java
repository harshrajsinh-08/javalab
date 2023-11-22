import java.util.Scanner;

abstract class GeometricShape {
    public abstract double area();

    public abstract double perimeter();
}

class Triangle extends GeometricShape {
    public double s1, s2, s3;

    public Triangle(double s1, double s2, double s3) {
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }

    @Override
    public double area() {
        double s = (s1 + s2 + s3) / 2;
        return Math.sqrt(s * (s - s1) * (s - s2) * (s - s3));
    }

    @Override
    public double perimeter() {
        return s1 + s2 + s3;
    }
}

class Square extends GeometricShape {
    public double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public double perimeter() {
        return 4 * side;
    }
}

public class gshape {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Enter:\n1 for Triangle\n2 for Square\n3 to Exit...\n");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter dimensions for Trianglewith spaces: ");
                    double s1 = sc.nextDouble();
                    double s2 = sc.nextDouble();
                    double s3 = sc.nextDouble();
                    GeometricShape tri = new Triangle(s1, s2, s3);
                    System.out.println("Triangle Area: " + tri.area());
                    System.out.println("Triangle Perimeter: " + tri.perimeter());
                    System.out.println();
                    break;
                case 2:
                    System.out.print("Enter side of Square: ");
                    double sidesq = sc.nextDouble();
                    GeometricShape sq = new Square(sidesq);

                    System.out.println("Square Area: " + sq.area());
                    System.out.println("Square Perimeter: " + sq.perimeter());
                    System.out.println();
                    break;
                
                    default:
                    System.out.println("Enter valid input");
                    System.out.println();
                    break;

                case 3:
                System.out.println("Exiting...");
            }
        } while (choice != 3);
    }
}
