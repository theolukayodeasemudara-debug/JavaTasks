import java.util.Scanner;
public class FlipCoinGame {
            public static void main (String[] args) {
                        Scanner userInput = new Scanner(System.in);

                        System.out.println("Pick a number between 0 and 1 to play this game of flipping a coin");
                        int playerNum = userInput.nextInt();

//                      checking player input
                        if(playerNum == 0) {
                            System.out.printf("You chose %d which is: 'Head' %n%n'", playerNum);
                        } 
                        else if(playerNum == 1) {
                            System.out.printf("You chose %d, which is: 'Tail' %n%n'", playerNum);
                        }
            }
}
