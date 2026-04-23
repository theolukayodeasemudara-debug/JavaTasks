import java.util.Scanner;
public class FactorialCalculator{
    public static void main(String[] args){
     Scanner inputCollector = new Scanner(System.in);
     
     
     System.out.print("Enter a value: ");
     int userNum = inputCollector.nextInt();
     int factor = 0;
     while(userNum <= 1){
         factor = factor + 1;
         long factorial = userNum * factor;
         userNum-=1;
     }
         System.out.println(factorial);
    }
}
