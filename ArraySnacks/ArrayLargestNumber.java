public class ArrayLargestNumber{
    public static void main(String[] args){
       int []numbers = {98,100,83,50,93};

        int largestNumber = numbers[0];
        for(int index = 0; index < numbers.length; index++){
            if(numbers[index] > largestNumber){
                largestNumber = numbers[index];
                System.out.println(largestNumber + " is the largest number");
            }
        } 
    }
}
