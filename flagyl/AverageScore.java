public class AverageScore {
    public static void main(String[] args) {
        java.util.Scanner inputCollector = new java.util.Scanner(System.in);
    
        int[] scores = new int[100];
        int counter = 0;
        double sum = 0;

        for (int index = 0; index < 100; index++) {
            System.out.print("Enter scores (negative to stop): ");
            int number = inputCollector.nextInt();
            if (number < 0) break;
            
            scores[index] = number;
            sum += number;
            counter+=1;
        }

        double average = sum / counter;
        int above = 0, below = 0;
        
        for (int index = 0; index < counter; index++) {
            if (scores[index] >= average) above+=1;
            else below+=1;
        }
        System.out.println("Average: " + average);
        System.out.println("Above or equal: " + above);
        System.out.println("Below average: " + below);
    }
}



