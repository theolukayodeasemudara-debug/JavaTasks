public class MilesKilometer{
    
    public static double mileToKilometer(double mile) {
        return mile * 1.609; 
    }

    public static double kilometerToMile(double kilometer) {
        return kilometer / 1.609; 
    }
    
    public static void main(String[] args) {
    
        System.out.println("Miles to Kilometer (1-10):");
        for (int index = 1; index <= 10; index++) {
            System.out.printf("%d mile = %.3f kilometer\n", index, mileToKilometer(index));
        }
        
        System.out.println("Kilometers to Miles (1-10):");
        for (int index = 1; index <= 10; index++) {
            System.out.printf("%d kilometer = %.3f mile\n", index, kilometerToMile(index));
        }
    }
}

