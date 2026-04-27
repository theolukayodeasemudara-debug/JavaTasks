public class PizzaWahala {
    
    public static int numberOfBoxes() {
        java.util.Scanner inputCollector = new java.util.Scanner(System.in);
        System.out.println("How many boxxes of pizza will you buy?");
        int boxesNumber = inputCollector.nextInt();
        return boxesNumber;
    }
    
    public static int pizzaType(){
        java.util.Scanner inputCollector = new java.util.Scanner(System.in);
        // System.out.println("Select your preferred type");
        int pizzaOption = inputCollector.nextInt();
        return pizzaOption;
    }
    
    
    
    public static void main(String[] args) {
        
        String pizzaType = """
        Select from our menu options
        
        1.Sapa size
        2.Small money
        3.Big boys
        4.Odogwu
        """;
        
        int pizza = pizzaType();
        
        System.out.println(pizzaType);
        
        int boxes = numberOfBoxes();
        System.out.printf("You ordered: %d boxes \n",boxes);
    }
}
