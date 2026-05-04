public class Palindrome{
    
    public static int reverseNumbers(int number){
        int reversedNum = 0;
        while(number != 0){
            int digit = number % 10;
            reversedNum = reversedNum * 10 + digit;
            number = number/10;
        }
        return reversedNum;
    }
    
    public static boolean isPalindrome(int number){
        int reversed = reverseNumbers(number);
        return number == reversed;
    }
    
    public static void main(String[] args){
        System.out.print("Enter your number: ");
        java.util.Scanner inputCollector = new java.util.Scanner(System.in);
        
        int userNum = inputCollector.nextInt();
        
        int result = reverseNumbers(userNum);
        System.out.println("Reversed: " + result);
        
        if(isPalindrome(userNum)){
            System.out.println(userNum + " is a palindrome");
        } else {
            System.out.println(userNum + " is NOT a palindrome");
        }
    }
}
