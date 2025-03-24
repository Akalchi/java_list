package dev.alejandra;

import static org.junit.jupiter.api.Assertions.assertEquals;

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

}
