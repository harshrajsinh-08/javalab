package AUG_14_mon;
import java.util.Scanner;

class Complex {
    private double real;
    private double imaginary;

    public Complex(double r, double i) {
        real =r;
        imaginary = i;
    }

    public Complex add(Complex other) {
        double newReal = this.real + other.real;
        double newImaginary = this.imaginary + other.imaginary;
        return new Complex(newReal, newImaginary);
    }

    public Complex subtract(Complex other) {
        double newReal = this.real - other.real;
        double newImaginary = this.imaginary - other.imaginary;
        return new Complex(newReal, newImaginary);
    }

    public Complex multiply(Complex other) {
        double newReal = this.real * other.real - this.imaginary * other.imaginary;
        double newImaginary = this.real * other.imaginary + this.imaginary * other.real;
        return new Complex(newReal, newImaginary);
    }

    @Override
    public String toString() {
        return real + " + " + imaginary + "i";
    }
}

public class ComplexOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice  = sc.nextInt();
        double real1 = sc.nextDouble();
        double imaginary1 = sc.nextDouble();
        Complex complex1 = new Complex(real1, imaginary1);
        double real2 = sc.nextDouble();
        double imaginary2 = sc.nextDouble();
        Complex complex2 = new Complex(real2, imaginary2);
        if(choice == 1){
            Complex sum = complex1.add(complex2);
            System.out.println("Sum: " + sum);
        }
        else if(choice ==2){
            Complex difference = complex1.subtract(complex2);
            System.out.println("Difference: " + difference);
        }
        else if(choice ==3){
            Complex product = complex1.multiply(complex2);
            System.out.println("Product: " + product);
        }

        sc.close();
    }
}
