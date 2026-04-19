public class LeapYearCalc{
    public static void main(String[] args){
        
        int count = 2000;
        for(;count <= 2100;){
            if(count % 4 == 0){
                System.out.print(count + " ");
                if(count % 7 == 0){
                    System.out.println();
            }
            }
            count++;
        
        }
    }
}
