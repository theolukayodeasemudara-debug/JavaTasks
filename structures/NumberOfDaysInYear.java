public class NumberOfDaysInYear{

    public static void noOfDaysInAYear(){
        int year = 2014;
        for(; year <= 2034; year++){
            if(year % 4 == 0){
                System.out.println(year + " has 366 days");
            } else{
                System.out.println(year + " has 365 days");
            }
        }
    }    
    
    public static void main(String[] args){
        noOfDaysInAYear();
    }
}
