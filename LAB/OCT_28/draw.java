import java.util.Scanner;

interface Drawable {
    void draw();
}

class Circle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }
}

class Triangle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing Triangle");
    }
}

class Rectangle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing Rectangle");
    }
}

public class draw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("What do you want to draw?\n1-Circle\n2-Triangle\n3-Rectangle\n4-Exit");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    Circle circle = new Circle();
                    circle.draw();
                    break;
                case 3:
                    Rectangle rectangle = new Rectangle();
                    rectangle.draw();
                    break;
                case 2:
                    Triangle triangle = new Triangle();
                    triangle.draw();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Enter valid input");
                    break;
            }
            System.out.println();
        } while (choice != 4);

    }
}
