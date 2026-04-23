// (Reading numbers until a specified sum) Write an application that asks for a number from the user and then keeps reading integer values from the user until the sum of those integers equals or becomes greater than the value that was input in the beginning.

import java.util.Scanner;
public class ReadingNumbersUntilSum{
    public static void main(String[] args){
        Scanner inputCollector = new Scanner(System.in);
        
        int bigNumber;
        int newSum = 0;
        
        int sumTotal = 0;
        
        System.out.println("Enter a number to start with: ");
        int firstNumber = inputCollector.nextInt();
        bigNumber = firstNumber;
        
        while(true){
            System.out.println("Enter a number till it sums to the first number: ");
            int number = inputCollector.nextInt();
            sumTotal += number;

            
            if(sumTotal == bigNumber){
                break;
            } else if(sumTotal > bigNumber){
                System.out.print("you have exceeded the number already");
                break;
            }
        }
        System.out.println("End!!!");
    }
}
