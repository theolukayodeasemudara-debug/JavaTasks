// collect 10 scores and print sum of the even indexes(2nd number, 4th number, 10th number)
import java.util.Scanner;
public class TaskFour{
    public static void main(String[] args){
        int totalNum = 0;
        int sumOfEvenNum = 0;
        Scanner inputCollector = new Scanner(System.in);
        int count=1;
        while(count <= 10){
            System.out.print("Enter number:" + count + " ");
            int userVal = inputCollector.nextInt();
            count++;
            
            if(userVal %2 == 0){
                sumOfEvenNum+=userVal;
            }
        }
        System.out.println(sumOfEvenNum);
    }
}
