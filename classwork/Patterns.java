import java.util.Scanner;
public class Patterns{
    public static void main(String[] args){
        Scanner inputCollector = new Scanner(System.in);
        
        System.out.println("enter number of rows: ");
        int rowNumber = inputCollector.nextInt();
        int count = 1;
        for(; count <= rowNumber;){
            for(int space = 1; space <= rowNumber - count; space++){
                System.out.print(" ");
            }
            for(int num = 1; num <= count; num++){
                System.out.print("*");
            }
            System.out.println();
            count++;
        }
    }
}




// read about Heap memory vs memory stack









































// import java.util.Scanner;
// public class Patterns{
//     public static void main(String[] args){
//         Scanner inputCollector = new Scanner(System.in);
        
//         System.out.println("enter number of rows: ");
//         int rowNumber = inputCollector.nextInt();
//         int count = 1;
//         for(;count <= rowNumber; count++){
//             for(int space = 1; space <= rowNumber - count; space++){
//                 System.out.print("");
//                 for(int num = 1; num <= count; num++){
//                     System.out.print("*");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }
