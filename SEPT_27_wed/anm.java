package SEPT_27_wed;

import java.util.Scanner;

class Animal {
    void makeSound() {
        System.out.println("SOund");
    }
}

class Cat extends Animal {
    void makeSound() {
        System.out.println("Meow");
    }

    void makeIt() {
        System.out.println("BHAU BHAU.");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Meow");
    }

    void makeIt() {
        System.out.println("Meow");
    }
}

public class anm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.print("Animal: ");
            System.out.println("which animal do you want \n1)cat\n2)dog\n4)exit");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    Animal a = new Animal();
                    Cat myCat = new Cat();

                    System.out.print("Cat: ");
                    myCat.makeIt();
                    System.out.println("");
                    break;

                case 2:
                    Animal a1 = new Animal();
                    Dog myDog = new Dog();

                    System.out.print("Dog: ");
                    myDog.makeIt();
                    System.out.println("");
                    break;

                case 3:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Enter valid option");
            }
        } while (choice != 3);
    }
}