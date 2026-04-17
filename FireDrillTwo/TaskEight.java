// collect 10 valid scores between 0-100 and print sum
import java.util.Scanner;
public class TaskEight{
    public static void main(String[] args){
        Scanner inputTaker = new Scanner(System.in);
        
        // >=0 and <=100
        int sum = 0;
        int validCounter = 1;
        
        int counter =0;
        while(validCounter <= 10){
            System.out.print("Enter a number: ");
            int num = inputTaker.nextInt();
            
            if(num >= 0 && num <= 100){
                validCounter++;
                sum+=num;
                
            }
            counter++;
        }
        System.out.println(sum);
        
    }
}
