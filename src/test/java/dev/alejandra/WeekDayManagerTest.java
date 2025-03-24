package dev.alejandra;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class WeekDayManagerTest {

    private WeekDayManager weekDayManager;
    
    @BeforeEach
    public void setUp() {
        weekDayManager = new WeekDayManager();
    }

    @Test
    public void testNewManagerHasEmptyList() {
        assertEquals(0, weekDayManager.getSize());
    }

    @Test
    public void testCreateWeekDays() {
        weekDayManager.createWeekDays();
        assertEquals(7, weekDayManager.getSize());
    }

     @Test
    public void testGetWeekDays() {
        
        weekDayManager.createWeekDays();
        
        List<String> weekDays = weekDayManager.getWeekDays();
    
        assertEquals(7, weekDays.size());
        assertEquals("Monday", weekDays.get(0));
        assertEquals("Tuesday", weekDays.get(1));
        assertEquals("Wednesday", weekDays.get(2));
        assertEquals("Thursday", weekDays.get(3));
        assertEquals("Friday", weekDays.get(4));
        assertEquals("Saturday", weekDays.get(5));
        assertEquals("Sunday", weekDays.get(6));
    }

}
