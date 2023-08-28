package AUG_23_wed;

import java.util.Scanner;

public class TestProgClock {
    private int hr; // store hours
    private int min; // store minutes
    private int sec; // store seconds

    // Default constructor
    // Postcondition: hr = 0; min = 0; sec = 0
    public TestProgClock() {
        setTime(0, 0, 0);
    }

    // Constructor with parameters, to set the time
    // The time is set according to the parameters
    // Postcondition: hr = hours; min = minutes; sec = seconds
    public TestProgClock(int hours, int minutes, int seconds) {
        setTime(hours, minutes, seconds);
    }

    // Method to set the time
    // The time is set according to the parameters
    // Postcondition: hr = hours; min = minutes; sec = seconds
    public void setTime(int hours, int minutes, int seconds) {
        if (0 <= hours && hours < 24)
            hr = hours;
        else
            hr = 0;

        if (0 <= minutes && minutes < 60)
            min = minutes;
        else
            min = 0;

        if (0 <= seconds && seconds < 60)
            sec = seconds;
        else
            sec = 0;
    }

    // Method to return the hours
    // Postcondition: The value of hr is returned.
    public int getHours() {
        return hr;
    }

    // Method to return the minutes
    // Postcondition: The value of min is returned.
    public int getMinutes() {
        return min;
    }

    // Method to return the seconds
    // Postcondition: The value of sec is returned.
    public int getSeconds() {
        return sec;
    }

    // Method to print the time
    // Postcondition: Time is printed in the form hh:mm:ss.
    public void printTime() {
        if (hr < 10)
            System.out.print("0");
        System.out.print(hr + ":");

        if (min < 10)
            System.out.print("0");
        System.out.print(min + ":");

        if (sec < 10)
            System.out.print("0");
        System.out.print(sec);
    }

    // Method to increment the time by one second
    // Postcondition: The time is incremented by one second.
    // If the before-increment time is 23:59:59, the time
    // is reset to 00:00:00.
    public void incrementSeconds() {
        sec++;

        if (sec > 59) {
            sec = 0;
            incrementMinutes(); // increment minutes
        }
    }

    // Method to increment the time by one minute
    // Postcondition: The time is incremented by one minute.
    // If the before-increment time is 23:59:53, the time
    // is reset to 00:00:53.
    public void incrementMinutes() {
        min++;

        if (min > 59) {
            min = 0;
            incrementHours(); // increment hours
        }
    }

    // Method to increment the time by one hour
    // Postcondition: The time is incremented by one hour.
    // If the before-increment time is 23:45:53, the time
    // is reset to 00:45:53.
    public void incrementHours() {
        hr++;

        if (hr > 23)
            hr = 0;
    }

    // Method to compare the two times
    // Postcondition: Returns true if this time is equal to
    // otherClock; otherwise returns false
    public boolean equals(TestProgClock otherClock) {
        return (hr == otherClock.hr
                && min == otherClock.min
                && sec == otherClock.sec);
    }

    // Method to copy the time
    // Postcondition: The instance variables of otherClock are
    // copied into the corresponding data members
    // of this time.
    // hr = otherClock.hr; min = otherClock.min;
    // sec = otherClock.sec.
    public void makeCopy(TestProgClock otherClock) {
        hr = otherClock.hr;
        min = otherClock.min;
        sec = otherClock.sec;
    }

    // Method to return a copy of the time
    // Postcondition: A copy of the object is created
    // and a reference of the copy is returned.
    public TestProgClock getCopy() {
        TestProgClock temp = new TestProgClock();

        temp.hr = hr;
        temp.min = min;
        temp.sec = sec;

        return temp;
    }

    public String toString() {
        String str = "";

        if (hr < 10)
            str = "0";
        str = str + hr + ":";

        if (min < 10)
            str = str + "0";
        str = str + min + ":";

        if (sec < 10)
            str = str + "0";
        str = str + sec;

        return str;
    }

    public class TestProgClock {
        static Scanner console = new Scanner(System.in);

        public static void main(String[] args) {
            TestProgClock myClock = new TestProgClock(5, 4, 30); // Line 1
            TestProgClock yourClock = new TestProgClock(); // Line 2

            int hours; // Line 3
            int minutes; // Line 4
            int seconds; // Line 5

            System.out.println("Line 6: myClock: "
                    + myClock); // Line 6

            System.out.println("Line 7: yourClock: "
                    + yourClock); // Line 7

            yourClock.setTime(5, 45, 16); // Line 8

            System.out.println("Line 13: After setting the "
                    + "time, yourClock: "
                    + yourClock); // Line 9

            if (myClock.equals(yourClock)) // Line 10
                System.out.println("Line 11: Both times "
                        + "are equal."); // Line 11
            else // Line 12
                System.out.println("Line 13: The two times "
                        + "are not equal"); // Line 13

            System.out.print("Line 14: Enter the hours, "
                    + "minutes, and seconds: "); // Line 14

            hours = console.nextInt(); // Line 15
            minutes = console.nextInt(); // Line 16
            seconds = console.nextInt(); // Line 17
            System.out.println(); // Line 18

            myClock.setTime(hours, minutes, seconds); // Line 19

            System.out.println("Line 20: New myClock: "
                    + myClock); // Line 20

            myClock.incrementSeconds(); // Line 21

            System.out.printf("Line 22: After incrementing "
                    + "the clock by one second, "
                    + "myClock: %s%n", myClock); // Line 22

            yourClock.makeCopy(myClock); // Line 23
            System.out.println("Line 24: After copying "
                    + "myClock into yourClock, "
                    + "yourClock: " + yourClock); // Line 24
        }// end main
    }
}