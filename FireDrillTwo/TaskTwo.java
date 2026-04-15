import java.util.Scanner;
public class TaskOne{
    public static void main (String[] args){
        Scanner inputCollector = new Scanner(System.in);
        int total = 0;
        
        // collect user input 10 times
        int count;
        for(count =1;count <= 10; count++){   
            System.out.print("Enter number " + count + ": ");
            int userNum = inputCollector.nextInt();
            
            // sum of input collected
            total +=userNum/10;
            System.out.print("the average score is " + total);
        }   
    }
}
