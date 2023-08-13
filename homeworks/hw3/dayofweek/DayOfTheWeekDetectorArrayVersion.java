package de.telran.geork.homeworks.hw3.dayofweek;

public class DayOfTheWeekDetectorArrayVersion implements DayOfTheWeekDetector{

    @Override
    public String detectDayName(int number) {
        String[] dayOfWeek = {"Monday", "Tuesday", "Wednesday",
                                "Thursday", "Friday", "Saturday", "Sunday"};
        if (number > 0 && number < 8){
            number -=1;
            return dayOfWeek[number];
        } else {
            return "Please input a valid number between 1 and 7";
        }
    }

}
