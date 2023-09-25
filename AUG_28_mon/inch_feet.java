package AUG_28_mon;
import java.util.Scanner;

class AddDistance {
    private int feet;
    private int inches;

    public AddDistance(int feet, int inches) {
        this.feet = feet;
        this.inches = inches;
    }

    public void addDistance(AddDistance distance) {
        this.feet += distance.feet;
        this.inches += distance.inches;

        if (this.inches >= 12) {
            this.feet += this.inches / 12;
            this.inches %= 12;
        }
    }

    public void displayDistance() {
        System.out.println(feet + " feet " + inches + " inches");
    }
}

public class inch_feet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n ");
        int numDistances = scanner.nextInt();

        AddDistance[] distances = new AddDistance[numDistances];

        for (int i = 0; i < numDistances; i++) {
            System.out.print("Enter distance " + (i + 1) + " (feet inches): ");
            int feet = scanner.nextInt();
            int inches = scanner.nextInt();
            distances[i] = new AddDistance(feet, inches);
        }

        AddDistance totalDistance = new AddDistance(0, 0);

        for (AddDistance distance : distances) {
            totalDistance.addDistance(distance);
        }

        System.out.println("Distances:");
        for (int i = 0; i < numDistances; i++) {
            System.out.print("Distance " + (i + 1) + ": ");
            distances[i].displayDistance();
        }

        System.out.print("Total distance: ");
        totalDistance.displayDistance();
    }
}
