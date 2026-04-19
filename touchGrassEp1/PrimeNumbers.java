public class PrimeNumbers{
    public static void main(String[] args){
        
        int count = 2;
        for(;count <= 1200;){
            if(count % 2 == 1){
                System.out.print(count + " ");
                if(count % 8 == 0){
                    System.out.println();
                }
            }
            count++;
        
        }
    }
}
