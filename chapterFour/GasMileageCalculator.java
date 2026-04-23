// (Gas Mileage) Drivers are concerned with the mileage their automobiles get. One driver has
// kept track of several trips by recording the miles driven and gallons used for each tankful. Develop
// a Java application that will input the miles driven and gallons used (both as integers) for each trip.
// The program should calculate and display the miles per gallon obtained for each trip and print the
// combined miles per gallon obtained for all trips up to this point. All averaging calculations should
// produce floating-point results. Use class Scanner and sentinel-controlled iteration to obtain the data
// from the user.

import java.util.Scanner;
public class GasMileageCalculator{
    public static void main(String[] args){
        Scanner inputCollector = new Scanner(System.in);
        int totalMileage = 0;
        int totalGallons = 0;
        
        while(true){
            System.out.println("Enter number of miles, -1 to quit: ");
            int miles = inputCollector.nextInt();
            
            if(miles == -1){
                break;
            }
            
            System.out.println("Enter number of gallons used: ");
            int gallons = inputCollector.nextInt();
            
            totalMileage += miles;
            totalGallons += gallons;
            
            int tripMilesPerGallon = miles / gallons;
            
            int totalMilesPerGallon = totalMileage / totalGallons;
        }
        
        System.out.printf("Final totals -> Miles: %d, Gallons: %d %n", totalMileage, totalGallons);
        if(totalGallons != 0){
            System.out.printf("Overall MPG: %.2f %n", (float) totalMileage / totalGallons);
        }
    }
}
