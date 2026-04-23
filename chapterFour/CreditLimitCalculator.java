// (Credit Limit Calculator) Develop a Java application that determines whether any of several department-store customers has exceeded the credit limit on a charge account. For each customer, the following facts are available:
// a) account number
// b) balance at the beginning of the month
// c) total of all items charged by the customer this month
// d) total of all credits applied to the customer’s account this month
// e) allowed credit limit.
// The program should input all these facts as integers, calculate the new balance (= beginning balance + charges – credits), display the new balance and determine whether the new balance exceeds the customer’s credit limit. For those customers whose credit limit is exceeded, the program should display the message "Credit limit exceeded".
import java.util.Scanner;
public class CreditLimitCalculator{
    public static void main(String[] args){
        Scanner inputCollector = new Scanner(System.in);
        
        System.out.println("Enter your account number: ");
        int accountNumber = inputCollector.nextInt();
        
        System.out.println("Enter your balance at the beginning of the month: ");
        int startBalance = inputCollector.nextInt();
        
        System.out.println("Enter total charges this month: ");
        int totalCharges = inputCollector.nextInt();
        
        System.out.println("Enter total credits applied this month: ");
        int totalCredits = inputCollector.nextInt();
        
        System.out.println("Enter your allowed credit limit: ");
        int creditLimit = inputCollector.nextInt();
        
        int newBalance = (startBalance + totalCharges - totalCredits);
        
        if(newBalance > creditLimit){
            System.out.println("Credit limit exceeded!");
        } else{
            System.out.println("Still within credit limit..Continue to lavish baba");
        }
    }
}
