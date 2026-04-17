// write a program that takes in an integer from your user and add all the digits
import java.util.Scanner;
public class SumOfInt{
    public static void main(String[] args){
        Scanner inputTaker = new Scanner(System.in);
        int sum = 0;  
        System.out.println("Enter a value: ");
        int num = inputTaker.nextInt();
        
       // int count = 0;
        while(num != 0){
            int digit = num%10;
            sum += digit;
            num /= 10;
        }
        System.out.println("sum of digit is " + num + " " + sum);
        
    }
}

            // int digit = num % 10;     // 1. grab last digit
            // int sum += digit;     // 2. sum it
            // System.out.print(sum + " "); // 3. print the square
            // num = num / 10; 
