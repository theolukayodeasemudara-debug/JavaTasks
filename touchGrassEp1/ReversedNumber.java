import java.util.Scanner;
public class ReversedNumber{
    public static void main(String[] args){
       Scanner inputCollector = new Scanner(System.in);
       
       int reversedNum = 0;
       
       System.out.println("Enter a nummber: ");
       int number = inputCollector.nextInt();
       
       while(number > 0){
           int digit = number % 10;
           reversedNum = reversedNum * 10 + digit;
           number = number / 10;
       }
       System.out.println("reversed number of your number is " + reversedNum);
    }
    
}
