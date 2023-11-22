package AUG_21_mon;
import java.util.Scanner;
class Patient {
    private static int totalPatients = 0;
    private static double totalWeight = 0;

    private int patientCount;
    private double averageWeight;

    public Patient() {
        patientCount = 10;
        averageWeight = 60.0;
        updateTotal();
    }

    public Patient(int numPatients, double weightDifference) {
        patientCount = numPatients;
        averageWeight = 60.0 + weightDifference;
        updateTotal();
    }

    private void updateTotal() {
        totalPatients += patientCount;
        totalWeight += patientCount * averageWeight;
    }

    public static double getOverallAverage() {
        if (totalPatients == 0) {
            return 0;
        }
        return totalWeight / totalPatients;
    }
}

public class P {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Patient defaultPatient = new Patient();
        System.out.println("Default Patient Overall Average: " + Patient.getOverallAverage());

        int pat = sc.nextInt();
        int weightdiff = sc.nextInt();
        Patient customPatient = new Patient(pat, weightdiff);
        System.out.println("Custom Patient Overall Average: " + Patient.getOverallAverage());
    }
}
