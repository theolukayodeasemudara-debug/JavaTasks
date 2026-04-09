public class WhileIntegers {
        public static void main (String[] args) {
                //              product of integers from 1 - 10

                int product = 1;
                int i = 1;
                
                while(i<=10){
                    product *=i;
                    i++;

                    System.out.println(product);                 
                }   
        }
}
