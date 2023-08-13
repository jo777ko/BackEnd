package de.telran.geork.homeworks.hw3.dayofweek;

public class EnumDayOfTheWeekDetector implements DayOfTheWeekDetector{
    @Override
    public String detectDayName(int number) {
        Day[] values = Day.values();
        if (number > 0 && number <values.length+1){
            return String.valueOf(values[number-1]);
        } else{
            return "Please input a valid number between 1 and 7";
        }

    }
}
