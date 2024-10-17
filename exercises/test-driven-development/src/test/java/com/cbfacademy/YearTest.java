package com.cbfacademy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class YearTest {
    @Test
    //@DisplayName("LeapYearDivisibleBy400")
    public void divisibleBy400Test(){
        Year year = new Year();
        assertTrue(Year.isLeapYear(2000));
    }

    @Test
    public void onlyDivisibleBy100(){
        assertFalse(Year.isLeapYear(1700));
        assertEquals(Year.isLeapYear(1700),false);

    }
@Test
public void onlyDivisibleBy4(){
    assertTrue(Year.isLeapYear(2004));
}

@Test
public void notDivisibleBy4(){
    assertFalse(Year.isLeapYear(2002));
}

   

    
    }







/*years divisible by 400 are leap years
years divisible by 100 but not by 400 are not leap years
years divisible by 4 but not by 100 are leap years
years not divisible by 4 are not leap year

}*/
