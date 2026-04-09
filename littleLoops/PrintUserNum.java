import java.util.Scanner;
public class PrintUserNum {
        public static void main (String[] args) {
                Scanner inputCollector = new Scanner(System.in);

//              Enter your number
                System.out.println("Enter your number!");
                int userInput = inputCollector.nextInt();

                for (int i = 1; i <=userInput; i++) System.out.println(i);
        }
}
