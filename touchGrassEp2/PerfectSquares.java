import java.util.Scanner;

public class PerfectSquares {
    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);
        
        System.out.println("Enter a number:");
        int number = inputCollector.nextInt();
        
        if (number < 0) {
            System.out.println(number + " is not a perfct squre.");
            return;
        }
        
        boolean isPerfectSquare = false;
        
        int square = 0;
        for (; square * square <= number; square++) { 
            if (square * square == number) {              
                isPerfectSquare = true;
                break;                   
            }
        }
        
        if (isPerfectSquare) {
            System.out.println(number + " is a perfect square.");
        } else {
            System.out.println(number + " is not a perfect square.");
        }
    }
}
