import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// Next period date = Last period start + average cycle 
// lengthOvulation date ≈ Next period start - 14 days  
// Fertile window ≈ 5 days before ovulation + ovulation day
// "Safe" dates: Days outside fertile window. 
// Important: no day is 100% safe without birth control

public class Test_MenstrualApp{
        
        @Test
        public void testForNextPeriodDate(){
            int lastStartDate = 10;
            int cycleLength = 18;
            int actual = MenstrualApp.calculateNextCycle(lastStartDate,cycleLength);
            int expected = 28;
            assertEquals(actual,expected);
        }
        
        @Test
            public void testForLengthOfMenstrualCycle(){
            int firstStartDate = 1;
            int secondStartDate = 30;
            int actual = MenstrualApp.calculateLengthOfCycle(firstStartDate,secondStartDate);
            int expected = 29;
            assertEquals(actual,expected);
        }
        
        @Test
        public void testForOvulationDates(){
            int nextCycle = 28;
            int actual = MenstrualApp.calculateOvulationDates(nextCycle);
            int expected = 14;
            assertEquals(actual,expected);
        }
        
        @Test
        public void testForSafeDates(){
            int ovulationDate = 14;
            int actual = MenstrualApp.calculateSafeDays(ovulationDate);
            int expected = 8;
            assertEquals(actual,expected);
        }
}
