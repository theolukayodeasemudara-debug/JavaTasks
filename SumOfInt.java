// write a program that takes in an integer from your user and add all the digits
import java.util.Scanner;
public class SumOfInt{
    public static void main(String[] args){
        Scanner inputCollector = new Scanner(System.in);
        System.out.println("Enter your digits");
        int intSquare = inputCollector.nextInt();

        for (;intSquare != 0;) {
            int digit = intSquare % 10;     // 1. grab last digit
            int square = digit  digit;     // 2. sum it
            System.out.print(square + " "); // 3. print the square
            intSquare = intSquare / 10;     // 4. remove last digit
        }
    }
}
