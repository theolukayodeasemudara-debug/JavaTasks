public class SortNumbers{
    public static void displaySortedNumbers(double num1, double num2, double num3){
        if(num1 <= num2 && num1 <= num3) {
            System.out.print(num1 + " ");
        } 
        else if(num2 <= num1 && num2 <= num3) {
            System.out.print(num2 + " ");
        }
        else {
            System.out.print(num3 + " ");
        }
    }

    public static void main(String[] args){
        java.util.Scanner inputCollector = new java.util.Scanner(System.in);
        double num1; 
        double num2; 
        double num3;
        
        System.out.print("Enter number 1: ");
        num1 = inputCollector.nextDouble();
        
        System.out.print("Enter number 2: ");
        num2 = inputCollector.nextDouble();
        
        System.out.print("Enter number 3: ");
        num3 = inputCollector.nextDouble();
        
        displaySortedNumbers(num1, num2, num3);
    }
}
