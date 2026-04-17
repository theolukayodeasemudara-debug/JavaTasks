// collect integer input from user and give the squares of the digits on
import java.util.Scanner;
public class IntegerSquare{
    public static void main(String[] args){
               Scanner inputCollector = new Scanner(System.in);
        System.out.println("Enter your digits");
        int intSquare = inputCollector.nextInt();

        for (;intSquare != 0;) {
            int digit = intSquare % 10;     // 1. grab last digit
            int square = digit * digit;     // 2. square it
            System.out.print(square + " "); // 3. print the square
            intSquare = intSquare / 10;     // 4. remove last digit
        }
    }
}
