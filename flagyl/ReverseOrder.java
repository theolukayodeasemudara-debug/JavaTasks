public class ReverseOrder {
    public static void main(String[] args) {
    
        java.util.Scanner inputCollector = new java.util.Scanner(System.in);
        int[] numbers = new int[10];
        
        
        for (int count = 0; count < numbers.length; count++) {
            System.out.println("Enter a number");
            numbers[count] = inputCollector.nextInt();
        }
        
        for (int index = 9; index >= 0; index--) {
            System.out.print(numbers[index] + " ");
        }
    }
}

