// write a function that reverses an array

public class ArrayReverse{
    public static void main(String[] args){
    
        int []numbers = {10,20,30,40,50,60};
        int []reversed = new int [6];
        for(int index = 0; index < numbers.length - 1; index--){
            reversed += numbers[index];
            System.out.print(numbers[index] + " ");
        }
    }
}
