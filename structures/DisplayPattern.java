public class DisplayPattern{

    public static void displayPattern(int number) {
        for (int index = 1; index <= number; index++) {
            for(int row = 1; row <= index; row++){
                System.out.print(row);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
    
        java.util.Scanner inputCollector = new java.util.Scanner(System.in);
        System.out.print("Enter number: ");
        
        int number = inputCollector.nextInt();
        displayPattern(number);
    }
}


