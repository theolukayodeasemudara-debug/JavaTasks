public class ReverseNumber{

    public static int reverse(int number){
        int reversedNum = 0;
        while(number != 0){
            int digit = number % 10;
            reversedNum = reversedNum * 10 + digit;
            number = number/10;
        }
        return reversedNum;
    }
    
    
    public static void main(String[] args){
    
        System.out.println("Enter your number: ");
        java.util.Scanner inputCollector = new java.util.Scanner(System.in);
        
        int userNum = inputCollector.nextInt();
        
        int result = reverse(userNum);
        System.out.println(result);
        
    }
}
