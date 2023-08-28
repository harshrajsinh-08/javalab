package AUG_23_wed;
import java.time.LocalTime;
import java.util.Scanner;

class Airplane {
    private String flightNumber;
    private String destination;
    private int departureHour;
    private int departureMinute;
    private boolean onTime;
    private int delayMinutes;

    public Airplane(String flightNumber, String destination, int departureHour, int departureMinute) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureHour = departureHour;
        this.departureMinute = departureMinute;
        this.onTime = true;
        this.delayMinutes = 0;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public int getDepartureHour() {
        return departureHour;
    }

    public int getDepartureMinute() {
        return departureMinute;
    }

    public boolean isOnTime() {
        return onTime;
    }

    public int getDelayMinutes() {
        return delayMinutes;
    }

    public void delay(int minutes) {
        onTime = false;
        delayMinutes = minutes;
    }

    public void calculateDelay() {
        LocalTime currentTime = LocalTime.now();
        int currentHour = currentTime.getHour();
        int currentMinute = currentTime.getMinute();

        int totalDepartureMinutes = departureHour * 60 + departureMinute;
        int totalCurrentMinutes = currentHour * 60 + currentMinute;

        if (totalDepartureMinutes <= totalCurrentMinutes) {
            delayMinutes = totalCurrentMinutes - totalDepartureMinutes;
            onTime = false;
        }
    }

    public String getFlightStatus() {
        if (onTime) {
            return "On time";
        } else {
            return "Delayed by " + delayMinutes + " minutes";
        }
    }
}

public class air {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Airplane airplane = null;

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Create Flight");
            System.out.println("2. Check Flight Status");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter flight number: ");
                    String flightNumber = scanner.nextLine();
                    System.out.print("Enter destination: ");
                    String destination = scanner.nextLine();
                    System.out.print("Enter departure hour: ");
                    int departureHour = scanner.nextInt();
                    System.out.print("Enter departure minute: ");
                    int departureMinute = scanner.nextInt();
                    airplane = new Airplane(flightNumber, destination, departureHour, departureMinute);
                    System.out.println("Flight created.");
                    break;
                case 2:
                    if (airplane == null) {
                        System.out.println("No flight created yet.");
                    } else {
                        airplane.calculateDelay();
                        System.out.println("Flight Information:");
                        System.out.println("Flight " + airplane.getFlightNumber() + " to " + airplane.getDestination());
                        System.out.println("Departure Time: " + airplane.getDepartureHour() + ":" + airplane.getDepartureMinute());
                        System.out.println("Flight Status: " + airplane.getFlightStatus());
                    }
                    break;
                case 3:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
