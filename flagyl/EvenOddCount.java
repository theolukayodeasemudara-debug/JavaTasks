public class EvenOddCount {
    public static void main(String[] args) {
    
        java.util.Scanner inputCollector = new java.util.Scanner(System.in);
        int even = 0, odd = 0;
        
        for (int index = 0; index < 10; index++) {
            System.out.print("Enter 10 integers (or until 0): ");
            int num = inputCollector.nextInt();
            if (num == 0) break;
            if (num % 2 == 0) even+=1;
            else odd+=1;
        }
        System.out.println("Even: " + even + ", Odd: " + odd);
    }
}
