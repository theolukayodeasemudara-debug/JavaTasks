import java.util.Scanner;
public class TaskThree{
    public static void main (String[] args){
            Scanner inputCollector = new Scanner(System.in);
        
        // collect user input 10 times
        for(int count =1;count <= 10; count++){   
            System.out.print("Enter number " + count + ": ");
            int userNum = inputCollector.nextInt();
            
            System.out.print(userNum);
        }   
    }
}
