// write a program that asks users for input until they enter a negative number then print the average of all positive numbers entered.


// pseudocode
// 1.initialize the total numbers collected
// 2.initialize the counter variable that would count the total numbers collected
// 3.collect the user input using scanner
// define the value value that ends the program and calculates the average
// 4.use a while loop to collect user's input while the program still runs

import java.util.Scanner;
public class SentinelStopper{
    public static void main(String[] args){
        Scanner inputCollector = new Scanner(System.in);
        
        
        int total = 0;
        int gradeCounter = 0;
        int grade = 0;
        
        System.out.print("Enter a grade, -1 to end: ");
        int number = inputCollector.nextInt();
        
        while(grade <= gradeCounter){
            total = total + number;
            gradeCounter++;
            System.out.print("Enter a grade, -1 to end: ");
            number = inputCollector.nextInt();
            
            if(number < 0){
            int average = total / gradeCounter;
            System.out.printf("The average score of your grades is %d \n", average);
                break;
            }
        }
    }
}
