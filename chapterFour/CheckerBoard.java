// (Checkerboard Pattern of Asterisks) Write an application that uses only the output statements to display the checkerboard pattern that follows. A System.out.println method call with no arguments causes the program to output a single newline character. [Hint: Iteration statements are required.]
// System.out.print("* ");
// System.out.print(" ");
// System.out.println();


public class CheckerBoard{
    public static void main(String[] args){
        for(int count = 1; count <= 8; count++){
            if(count%2==0){
                System.out.print(" ");
            }           
            for(int num = 1; num <= 8; num++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


