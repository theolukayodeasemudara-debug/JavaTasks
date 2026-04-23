// (Right-angled Triangle) Write an application that prompts the user to enter the length of the base of a triangle, and uses that to draw a right-angled triangle composed of asterisks. Your program should work for triangles of base lengths between 1 and 10.

import java.util.Scanner;
public class RightAngledTriangle{
    public static void main(String[] args){
        Scanner inputCollector = new Scanner(System.in);
        
        System.out.println("Enter the length of base of your triangle: ");
        int length = inputCollector.nextInt();
        
        int count = 1;
        while(count <= length){
            for(int num = 1; num <= count; num++){
                System.out.print("*");
            }
            System.out.println();
            count++;
        }
    }
}
