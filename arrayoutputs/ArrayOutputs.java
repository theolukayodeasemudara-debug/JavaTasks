public class ArrayOutputs{
    public static int highestNumber(int []Array){
        int index = 0;   
        int highestNumber = Array[0];
        
        for(;index < Array.length; index++){
            if(Array[index] > highestNumber){
                highestNumber = Array[index];
            }
        }
        
        return highestNumber;
    }
    
    public static int lowestNumber(int []Array){
        int index = 0; 
        int lowestNumber = Array[0];
        
        for(;index < Array.length; index++){
             if(Array[index] < lowestNumber){
                lowestNumber = Array[index];
            }
        }
        
        return lowestNumber;
    }
    
    public static String greeter(name){
        
        return name;
    }
    
    public static void main(String[] args){
            
        int []arrayOne = {2,5,7,9,20};
        int []arrayTwo = {2,3,1,4,6};
        
        
        System.out.println(highestNumber(arrayOne));
        System.out.println(lowestNumber(arrayOne));
        
        greeter();
    }
}
