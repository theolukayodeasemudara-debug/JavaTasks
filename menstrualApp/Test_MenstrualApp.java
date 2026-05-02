import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Test_MenstrualApp{
        int lastStartDate = 0;
        int cycleLength = 22;
        
        
        @Test
        public void testForNextPeriodDate(){
            lastStartDate = 10;
            int actual = MenstrualApp.calculateNextCycle(lastStartDate + cycleLength);
            int expected = 32;
            assertEquals(actual,expected);
        }
        
        @Test
        public void testForLengthOfMenstrualCycle(){
            lastStartDate = 10;
            int actual = MenstrualApp.calculateLengthOfCycle(lastStartDate + cycleLength);
            int expected = 32;
            assertEquals(actual,expected);
        }
        
        @Test
        public void testForFertileWindowDates(){
            lastStartDate = 10;
            int actual = MenstrualApp.calculateOvulationDates(lastStartDate + cycleLength);
            int expected = 32;
            assertEquals(actual,expected);
        }
        
        @Test
        public void testForSafeDates(){
            lastStartDate = 10;
            int actual = MenstrualApp.calculateSafeDays(lastStartDate + cycleLength);
            int expected = 32;
            assertEquals(actual,expected);
        }
}


// Next period date = Last period start + average cycle 
// lengthOvulation date ≈ Next period start - 14 days  
// Fertile window ≈ 5 days before ovulation + ovulation day
// "Safe" dates: Days outside fertile window. 
// Important: no day is 100% safe without birth control
