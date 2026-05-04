public class SumOfIntegers{
    public static int sumDigits(int number){
        int sum = 0;
        while(number != 0){
            int digit = number % 10;
            sum = sum + digit;
            number = number/10;
        }
        return sum;
    }

    public static void main(String[] args){
        System.out.print("Enter your number: ");
        java.util.Scanner inputCollector = new java.util.Scanner(System.in);
        
        int userNumber = inputCollector.nextInt();
        int result = sumDigits(userNumber);
        System.out.println("Sum of digits is: " + result);
    }
}
