package de.telran.geork.homeworks.hw3.dayofweek;

public class DayOfWeekTest {
    public static void main(String[] args) {
        DayOfTheWeekDetectorIfVersion day = new DayOfTheWeekDetectorIfVersion();
        System.out.println(day.detectDayName(8));
        DayOfTheWeekDetectorSwitchVersion day1 = new DayOfTheWeekDetectorSwitchVersion();
        System.out.println(day1.detectDayName(8));
        DayOfTheWeekDetectorArrayVersion day2 = new DayOfTheWeekDetectorArrayVersion();
        System.out.println(day2.detectDayName(8));
        EnumDayOfTheWeekDetector day3 = new EnumDayOfTheWeekDetector();
        System.out.println(day3.detectDayName(8));

    }
}
