// write a function that takes in three numbers and gives the highest of the numbers

public class HighestNumber{

        public static int HighestNumberChecker(int ...){
        int highestNumber = 0;
        
          if(numberOne > numberTwo && numberOne > numberThree){
              highestNumber = numberOne;
              System.out.printf("%d is the highest number \n",numberOne);
          }
          
          
          if(numberTwo > numberOne && numberTwo > numberThree){
            highestNumber = numberTwo;
            System.out.printf("%d is the highest number \n",numberTwo);
          }
          
          
          if(numberThree > numberOne && numberThree > numberTwo){
            highestNumber = numberThree;
            System.out.printf("%d is the highest number \n",numberThree);
          }

          
          return highestNumber;
        }
        
        
    public static void main(String[] args){
        
        System.out.println("Enter a number");
        java.util.Scanner inputCollector = new java.util.Scanner(System.in);
        
        
        // System.out.println("Enter a number");
        // int numberOne = inputCollector.nextInt();
        
        // System.out.println("Enter a number");
        // int numberTwo = inputCollector.nextInt();
        
        // System.out.println("Enter a number");
        // int numberThree = inputCollector.nextInt();
        
        HighestNumberChecker(numberOne, numberTwo, numberThree);
        
        for(int count = 1; count <= 3; count++){
        
        System.out.println("Enter a number");
        int myNumber = inputCollector.nextInt(); 
        
        
        
        // }        

    }
}
