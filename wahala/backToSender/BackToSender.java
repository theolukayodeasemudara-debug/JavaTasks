public class BackToSender {

// function to check riders score logic and calculated value
    public static int ridersWageCalculator(int successfulDeliveries) {
        int wages = 0;
            
        if (successfulDeliveries < 50) {
            wages = successfulDeliveries * 160 + 5000;
        } else if (successfulDeliveries >= 50 && successfulDeliveries <= 59) {
            wages = successfulDeliveries * 200 + 5000;
        } else if (successfulDeliveries >= 60 && successfulDeliveries <= 69) {
            wages = successfulDeliveries * 250 + 5000;
        } else if (successfulDeliveries >= 70) {
            wages = successfulDeliveries * 500 + 5000;
        }

        return wages;
    }
    
    // public static void main(String[] args) {
    // // I pointed to the Scanner path, hence the need for an import statement was no longer necessary
    //     java.util.Scanner inputCollector = new java.util.Scanner(System.in);
        
    //     System.out.print("Enter number of successful deliveries: ");
    //     int deliveredItemsNo = inputCollector.nextInt();
        
    //     int wages = ridersWageCalculator(deliveredItemsNo);
    //     System.out.println("Rider's wage: " + wages);
    // }
    
    

}
