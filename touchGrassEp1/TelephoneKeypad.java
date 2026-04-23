import java.util.Scanner;

public class TelephoneKeypadNumber{
public static void main(String[] agrs){

Scanner inputCollector = new Scanner(System.in);
  System.out.print("Enter a lowercase or uppercase letter: ");
  char letter = inputCollector.next().charAt(0);
        letter = Character.toLowerCase(letter);

switch (letter){
    case 'a','b','c':
        System.out.println("2");
        break;

    case 'd','e','f':
        System.out.println("3");
        break;

    case 'g','h','i':
        System.out.println("4");
        break;

    case 'j','k','l':
        System.out.println("5");
        break;

    case 'm','n','o':
        System.out.println("6");
        break;

    case 'p','q','r','s':
        System.out.println("7");
        break;

    case 't','u','v':
        System.out.println("8");
        break;

    case 'w','x','y','z':
        System.out.println("9");
        break;
    default:
        System.out.print("Invalid input");
        break;
                }

    }
}
