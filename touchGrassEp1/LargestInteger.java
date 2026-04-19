// // // // write a program that collects integers and determines which is largest and how many times it occured. Input ends when 0 is entered

// // // // initialize the largestNum
// // // initialize a temporary large value to record how many times a particular number has occured
// collect user inputs as the integers
// // use select statements to compare the integers

import java.util.Scanner;
public class LargestInteger{
    public static void main(String[] args){
        Scanner inputCollector = new Scanner(System.in);
        
        int largestNum = 0;
        int frequency = 0;
        
        System.out.print("Enter a value: ");
        int number = inputCollector.nextInt();
        
        int counter = 0;
        while(counter <= number){
            if(number >= largestNum){
                largestNum = number;
                frequency = frequency + 1;
            }
            // else if(largestNum == frequency){
            
            // }
            counter++;
            
            System.out.print("Enter a value: ");
            number = inputCollector.nextInt();
            
            if(number == 0){
            System.out.printf("The largest number is %d and it occurs %d times", largestNum, frequency);
                break;
            }            
        }
    }
}
