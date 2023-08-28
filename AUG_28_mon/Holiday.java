package AUG_28_mon;

import Holiday;

public class Holiday {
    private String name;
    private int day;
    private String month;

    public Holiday(String name, int day, String month) {
        this.name = name;
        this.day = day;
        this.month = month;
    }

    public boolean inSameMonth(Holiday otherHoliday) {
        return this.month.equals(otherHoliday.month);
    }

    public static double avgDate(Holiday[] holidays) {
        int totalDays = 0;
        for (Holiday holiday : holidays) {
            totalDays += holiday.day;
        }
        return (double) totalDays / holidays.length;
    }

    public static void main(String[] args) {
        Holiday independenceDay = new Holiday("Independence Day", 4, "July");

        System.out.println("Holiday: " + independenceDay.name);
        System.out.println("Day: " + independenceDay.day);
        System.out.println("Month: " + independenceDay.month);
    }
}
