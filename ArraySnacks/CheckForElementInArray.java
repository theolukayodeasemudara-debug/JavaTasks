public class CheckForElementInArray{
    public static void main(String[] args){
       int []numbers = {98,100,83,50,93,10,5,1};
       
        java.util.Scanner inputCollector = new  java.util.Scanner(System.in);
        
        System.out.println("Enter a number");
        int userInput = inputCollector.nextInt();

        int largestNumber = numbers[0];
        int count = 0;
        for(; count < numbers.length; count++){
            if(userInput == numbers[count]){
                System.out.println(userInput + " is in the given array!");
                break;
            } else{
                System.out.println(userInput + " is not in the given array!");
            }
        } 
    }
}
