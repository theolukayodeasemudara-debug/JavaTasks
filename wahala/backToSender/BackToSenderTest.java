import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BackToSenderTest{
    
	@Test
	
    public void testWageCalculatorFor80Deliveries(){
        // Given
        int sampleInput1 = 80;
        
        // When
        int actualResult = BackToSender.ridersWageCalculator(sampleInput1);
        
	    //check
	    int expectedResult = 80 * 500 + 5000; // 45000
	    assertEquals(expectedResult, actualResult);
	    }
	    
	    
	    @Test
    public void testWageCalculatorFor25liveries(){
        // Given
        int sampleInput2 = 25;
        
        // When
        int actualResult = BackToSender.ridersWageCalculator(sampleInput2);
        
        //check
        int expectedResult = 25 * 160 + 5000; // 9000
        assertEquals(expectedResult, actualResult);
    }
	
} 




// javac -cp "junit-platform-console-standalone-1.11.0.jar:out" -d out BackToSenderTest.java BackToSender.java
// java -cp "junit-platform-console-standalone-1.11.0.jar:out" org.junit.platform.console.Console Launcher --scan-class-path
// java -jar junit-platform-console-standalone-1.11.0.jar --class-path out --select-class BackToSenderTest

