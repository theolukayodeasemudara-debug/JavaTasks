// (Creating a Comparator) Write an application that works as a comparator. Your program should read two numbers from the user and print 0 if they are equal to each other, 1 if the first number is greater, and –1 if the second number is greater.

import java.util.Scanner;
public class Comparator{
    public static void main(String[] args){
        Scanner inputCollector = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int num1 = inputCollector.nextInt();
        
        System.out.print("Enter second number: ");
        int num2 = inputCollector.nextInt();
        
        if (num1 == num2) {
            System.out.println(0);
        } else if (num1 > num2) {
            System.out.println(1);
        } else {
            System.out.println(-1);
        }
    }
}
