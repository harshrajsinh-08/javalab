package SEPT_27_wed;

import java.util.Scanner;

class Sports {
    void play() {
        System.out.println("Playing a generic sport");
    }
}

class Football extends Sports {
    @Override
    void play() {
        System.out.println("Playing football");
    }
}

class Basketball extends Sports {
    @Override
    void play() {
        System.out.println("Playing basketball");
    }
}

class Rugby extends Sports {
    @Override
    void play() {
        System.out.println("Playing rugby");
    }
}

public class sportt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("which sport do you want \n1)Generic\n2)Football\n3)Basketball\n4)Rugby\n5)Exit");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    Sports genericSport = new Sports();
                    System.out.print("Generic Sport: ");
                    genericSport.play();
                    System.out.println();
                    break;

                case 2:
                    Football football = new Football();
                    System.out.print("Football: ");
                    football.play();
                    System.out.println();
                    break;

                case 3:
                    Basketball basketball = new Basketball();
                    System.out.print("Basketball: ");
                    basketball.play();
                    System.out.println();
                    break;

                case 4:
                    Rugby rugby = new Rugby();
                    System.out.print("Rugby: ");
                    rugby.play();
                    System.out.println();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Enter valid option");
            }
        } while (choice != 5);
    }

}
