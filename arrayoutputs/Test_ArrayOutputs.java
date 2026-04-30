import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    public class ArrayRangeCalculator{
        
        @Test
        public void testThatArrayCalculatesTheRangeBetweenTheElementsOfAnArray(){
            int []numbers = {2,5,7,9,20}
            int actual = ArrayOutputs.CalculateRange({2,5,7,9,20});
            int expected = 18;
            assertEquals(actual,expected);
        } 

    }
