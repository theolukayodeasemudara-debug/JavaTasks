// collect 10 scores and print average
import java.util.Scanner;
public class TaskTwo{
    public static void main(String[] args){
        int totalNum = 0;
        double average = 0;
        Scanner inputCollector = new Scanner(System.in);
        int count=1;
        while(count <= 10){
            System.out.print("Enter number:" + count + " ");
            int userVal = inputCollector.nextInt();
            count++;
            
            totalNum+=userVal;
            average = (double)totalNum/10;
        }
        System.out.println(average);
    }
}
