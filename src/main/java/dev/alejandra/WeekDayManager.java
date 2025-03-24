package dev.alejandra;

import java.util.ArrayList;
import java.util.List;

public class WeekDayManager {

     private List<String> weekDays;
    
    public WeekDayManager() {
        this.weekDays = new ArrayList<>();
    }
    
    public int getSize() {
        return weekDays.size();
    }

}
