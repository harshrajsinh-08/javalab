package AUG_23_wed;
class Clock {
    private int hours;
    private int minutes;
    private int seconds;

    public Clock() {
        this(12, 0, 0);
    }

    public void setClock(int secondsSinceMidnight) {
        hours = secondsSinceMidnight / 3600;
        minutes = (secondsSinceMidnight % 3600) / 60;
        seconds = secondsSinceMidnight % 60;
    }
    public Clock(int hours, int minutes, int seconds) {
        setClock(hours, minutes, seconds);
    }

    public Clock(int secondsSinceMidnight) {
        setClock(secondsSinceMidnight);
    }


    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public void tick() {
        seconds++;
        if (seconds == 60) {
            seconds = 0;
            minutes++;
            if (minutes == 60) {
                minutes = 0;
                hours = (hours + 1) % 24;
            }
        }
    }

    public void tickDown() {
        seconds--;
        if (seconds < 0) {
            seconds = 59;
            minutes--;
            if (minutes < 0) {
                minutes = 59;
                hours = (hours - 1 + 24) % 24;
            }
        }
    }

    public void addClock(Clock otherClock) {
        int totalSeconds = hours * 3600 + minutes * 60 + seconds;
        totalSeconds += otherClock.hours * 3600 + otherClock.minutes * 60 + otherClock.seconds;
        setClock(totalSeconds);
    }

    public Clock subtractClock(Clock otherClock) {
        int thisTotalSeconds = hours * 3600 + minutes * 60 + seconds;
        int otherTotalSeconds = otherClock.hours * 3600 + otherClock.minutes * 60 + otherClock.seconds;
        int differenceSeconds = thisTotalSeconds - otherTotalSeconds;

        return new Clock(differenceSeconds);
    }

    @Override
    public String toString() {
        return String.format("(%02d:%02d:%02d)", hours, minutes, seconds);
    }
}

class ClockDemo {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Enter seconds since midnight for firstClock: ");
        int secondsSinceMidnight1 = scanner.nextInt();
        Clock firstClock = new Clock(secondsSinceMidnight1);

        System.out.println("Ticking firstClock:");
        for (int i = 0; i < 10; i++) {
            firstClock.tick();
            System.out.println(firstClock);
        }

        System.out.print("\nEnter hours, minutes, and seconds for secondClock: ");
        int hours2 = scanner.nextInt();
        int minutes2 = scanner.nextInt();
        int seconds2 = scanner.nextInt();
        Clock secondClock = new Clock(hours2, minutes2, seconds2);

        System.out.println("Ticking secondClock:");
        for (int i = 0; i < 10; i++) {
            secondClock.tick();
            System.out.println(secondClock);
        }

        firstClock.addClock(secondClock);
        System.out.println("\nAfter adding secondClock to firstClock:");
        System.out.println("firstClock: " + firstClock);
        System.out.println("secondClock: " + secondClock);

        Clock thirdClock = firstClock.subtractClock(secondClock);
        System.out.println("\nDifference between firstClock and secondClock:");
        System.out.println("thirdClock: " + thirdClock);

        scanner.close();
    }
}