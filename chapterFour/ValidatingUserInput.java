// (Validating User Input) Modify the program in Fig. 4.12 to validate its inputs. For any input, if the value entered is other than 1 or 2, keep looping until the user enters a correct value.
import java.util.Scanner;
public class ValidatingUserInput{
    public static void main(String[] args){
        Scanner inputCollector = new Scanner(System.in);
        
        while(true){
            System.out.println("Enter a value");
            int number = inputCollector.nextInt();
            
            if(number == 1 || number == 2){
                break;
            }
        }
            System.out.println("validated!!!");
    }
}
