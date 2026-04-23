// (Tax Calculator) Develop a Java application that determines the total tax for each of three citizens. The tax rate is 15% for earnings up to 30,000 USD earned by each citizen and 20% for all earnings in excess of that ceiling. You are given a list with the citizens’ names and their earnings in a given year. Your program should input this information for each citizen, then determine and display the citizen’s total tax. Use class Scanner to input the data.

import java.util.Scanner;
public class TaxCalculator{
    public static void main(String[] args){
        Scanner inputCollector = new Scanner(System.in);
        int ceiling = 30000;
        double lowerRate = 0.15;
        double upperRate = 0.20;
        
        int count = 1;
        for(; count <= 3;){
        
            System.out.print("Enter citizen " + count + " name: ");
            String name = inputCollector.next();
            
            
            System.out.println("What is your earning? ");
            int earnings = inputCollector.nextInt();
        
            double tax;
            if (earnings <= ceiling) {
                tax = earnings * lowerRate;
            } else {
                tax = (ceiling * lowerRate) + ((earnings - ceiling) * upperRate);
            }
        
        count++;
        System.out.printf("%s total tax is: %f \n", name, tax);
        }
    }
}
