// pseudo
// initialize counter to zero
// initialize heads to zero
// initialize tails to zero
// import Random from java.util
// use select statements to check whether the value generated is head or tail

import java.util.Random;
public class CoinFlipper {
    public static void main(String[] args) {
        Random randomGenerator = new Random();
        
        int counter = 0;
        int heads = 0;
        int tails = 0;
        
        while (counter < 1000000) { 
            int ranNum = randomGenerator.nextInt(2);
            
            if (ranNum == 1) {
                heads = heads + 1;
                // System.out.print(ranNum);
            } else if(ranNum == 0) {
                tails = tails + 1;
                // System.out.print(ranNum);
            }
            
            counter++;
        }
        
        System.out.println("Heads: " + heads);
        System.out.println("Tails: " + tails);
    }
}
