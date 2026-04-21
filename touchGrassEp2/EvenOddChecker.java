// write a program that prints all the factors of a number requested from the user

// pseudo
// 1.collect userInput using Scanner
// 2.use a for-loop to loop over userInput
// 3.Intialize userInput as the counter variable

import java.util.Scanner;
public class EvenOddChecker{
    public static void main(String[] args){
        Scanner inputCollector = new Scanner(System.in);
        
        
        System.out.println("Enter a number!");
        int number = inputCollector.nextInt();
        

        if(number % 2 == 0){
                System.out.println(number + " is an even number");
            } else if(number % 2 == 1) System.out.println(number + " is an odd number");
        }
    }

