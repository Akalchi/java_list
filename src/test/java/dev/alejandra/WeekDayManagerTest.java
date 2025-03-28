package dev.alejandra;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
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

    @Test
    public void testRemoveDay() {
       
        weekDayManager.createWeekDays();

        boolean result = weekDayManager.removeDay("Monday");
        
        assertTrue(result);
        assertEquals(6, weekDayManager.getSize());
    }
    
    @Test
    public void testRemoveDayNotFound() {

        weekDayManager.createWeekDays();
        
        boolean result = weekDayManager.removeDay("NotADay");
        
        assertFalse(result);
        assertEquals(7, weekDayManager.getSize());
    }

    @Test
    public void testGetDay() {
        
        weekDayManager.createWeekDays();
      
        String day = weekDayManager.getDay(2);
        
        assertEquals("Wednesday", day);
    }
    
    @Test
    public void testGetDayInvalidIndex() {
       
        weekDayManager.createWeekDays();
    }

    @Test
    public void testContainsDay() {
       
        weekDayManager.createWeekDays();
      
        boolean contains = weekDayManager.containsDay("Friday");
        
        assertTrue(contains);
    }
    
    @Test
    public void testContainsDayNotFound() {
      
        weekDayManager.createWeekDays();
        
        boolean contains = weekDayManager.containsDay("NotADay");
       
        assertFalse(contains);
    }

    @Test
    public void testSortDays() {
   
        weekDayManager.createWeekDays();
       
        weekDayManager.sortDays();
       
        List<String> weekDays = weekDayManager.getWeekDays();
        assertEquals("Friday", weekDays.get(0));
        assertEquals("Monday", weekDays.get(1));
        assertEquals("Saturday", weekDays.get(2));
        assertEquals("Sunday", weekDays.get(3));
        assertEquals("Thursday", weekDays.get(4));
        assertEquals("Tuesday", weekDays.get(5));
        assertEquals("Wednesday", weekDays.get(6));
    }

    @Test
    public void testClearDays() {
        
        weekDayManager.createWeekDays();
      
        weekDayManager.clearDays();
       
        assertEquals(0, weekDayManager.getSize());
    }

}
