public class PizzaWahala {
    
    public static int numberOfBoxes() {
        java.util.Scanner inputCollector = new java.util.Scanner(System.in);
        System.out.println("How many boxxes of pizza will you buy?");
        int boxesNumber = inputCollector.nextInt();
        return boxesNumber;
    }
    
    public static void main(String[] args) {
        int boxes = numberOfBoxes();
        System.out.printf("You ordered: %d boxes \n",boxes);
    }
}
