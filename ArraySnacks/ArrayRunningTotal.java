public class ArrayRunningTotal{
    public static void main(String[] args){
        
        int[] numbers = {10,20,30,40,50};
        numbers[1] = 60;

        int total = 0;
        for (int index = 0; index < numbers.length; index++) {
            total += numbers[index];
            System.out.print(numbers[index] + " ");  
        } 
        System.out.println("total = " + total);
        
    }
}
