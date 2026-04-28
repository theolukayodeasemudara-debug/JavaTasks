public class OddNumbersArrays {
    public static void main(String[] args) {
        java.util.Scanner inputCollector = new  java.util.Scanner(System.in);
        int[] array = new int[10];

        for (int count = 0; count < 10; count++) {
            System.out.println("Enter a number");
            int userInput = inputCollector.nextInt();
            array[count] = userInput;
        }

        System.out.print("Odd numbers: ");
        for (int row = 0; row < array.length; row++) {
            if (array[row] % 2 == 1) {
                System.out.print(array[row] + " ");
            }
        }
        System.out.println();
    }
}
