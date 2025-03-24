package dev.alejandra;

import java.util.ArrayList;
import java.util.List;

public class WeekDayManager {

     private List<String> weekDays;
    
    public WeekDayManager() {
        this.weekDays = new ArrayList<>();
    }

    public void createWeekDays() {
        weekDays.add("Monday");
        weekDays.add("Tuesday");
        weekDays.add("Wednesday");
        weekDays.add("Thursday");
        weekDays.add("Friday");
        weekDays.add("Saturday");
        weekDays.add("Sunday");
    }
    
    public int getSize() {
        return weekDays.size();
    }

}
