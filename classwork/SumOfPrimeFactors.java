// collect a number and sum the prime factors

// psueod-code
// initialize count to start at 2
// collect user-input
// use a check if user-input is divisible by count without any remainder, increment count
// continue checking until userinput has reached count/count and equal to 1, stop the loop


import java.util.Scanner;
public class SumOfPrimeFactors{
    public static void main(String[] args){
        Scanner inputCollector = new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        int number = inputCollector.nextInt();
        int count = 2;
        int total = 0;
        
           while(count <= number){  
            if(number % count == 0){
                number = number/count;
                total+=count;
            } else{
                count++;
            }        
        }
        System.out.printf("total of the prime numbers is %d \n",total);
        
        
    }
}
