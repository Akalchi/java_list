package dev.alejandra;

import java.util.ArrayList;
import java.util.Collections;
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

    public List<String> getWeekDays() {
        return new ArrayList<>(weekDays);
    }

    public int getSize() {
        return weekDays.size();
    }

    public boolean removeDay(String day) {
        return weekDays.remove(day);
    }

    public String getDay(int index) {
        return weekDays.get(index);
    }

    public boolean containsDay(String day) {
        return weekDays.contains(day);
    }

    public void sortDays() {
        Collections.sort(weekDays);
    }

}
