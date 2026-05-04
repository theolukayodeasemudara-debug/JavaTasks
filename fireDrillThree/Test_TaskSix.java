import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Test_TaskSix{

    @Test
    public void testThatReturnedArrayIsInEvenIndexFunctionExists() {
        int []result = sumOfArrayElements(1,2,3,4,5,6,7,8,9,0);
        int expected = 25;
        assertEquals(expected, result);
    }
}
