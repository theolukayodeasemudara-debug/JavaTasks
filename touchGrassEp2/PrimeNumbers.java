// write a program that prints all the factors of a number requested from the user

// pseudo
// 1.collect userInput using Scanner
// 2.use a for-loop to loop over userInput
// 3.Intialize userInput as the counter variable

import java.util.Scanner;
public class PrimeNumbers{
    public static void main(String[] args){
        Scanner inputCollector = new Scanner(System.in);
        
        
        System.out.println("Enter a number!");
        int number = inputCollector.nextInt();
        

        // a number divisible by 1 and itself
        if(number % number == 0 && number % 2 == 0){
          System.out.println(number + " is a prime number");
          } else System.out.println("Number is not a prime number");
        }
    }

