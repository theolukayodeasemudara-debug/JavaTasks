import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Test_TaskFour{

    @Test
    public void testThatReturnedArrayIsInEvenIndexFunctionExists() {
        int []result = TaskFour.getArrayEvenIndex({1,2,3,4,5,6,7,8,9,0});
        int []expected = {2,4,6,8,0};
        assertEquals(expected, result);
    }
}
