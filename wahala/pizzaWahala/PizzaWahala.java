public class PizzaWahala {
    
    public static int numberOfBoxes() {
        java.util.Scanner inputCollector = new java.util.Scanner(System.in);
        System.out.println("How many boxxes of pizza will you buy?");
        int boxesNumber = inputCollector.nextInt();
        return boxesNumber;
    }
    
    
    public static String pizzaMenu(){
        String pizzaType = """
        Select from our menu options
        
        1.Sapa size
        2.Small money
        3.Big boys
        4.Odogwu
        """;
        
        System.out.println(pizzaType);
        
        return pizzaType;
    }
    
    public static void main(String[] args) {
        String menu = pizzaMenu();
        int boxes = numberOfBoxes();
        System.out.printf("You ordered: %d boxes \n",boxes);
    }
}
