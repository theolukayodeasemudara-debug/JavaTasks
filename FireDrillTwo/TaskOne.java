import java.util.Scanner;
public class TaskOne{
    public static void main(String[] args){
        int totalNum = 0;
        Scanner inputCollector = new Scanner(System.in);
        int count=1;
        while(count <= 10){
            System.out.print("Enter number:" + count + " ");
            int userVal = inputCollector.nextInt();
            count++;
            
            totalNum+=userVal;
        }
        System.out.println(totalNum);
    }
}
