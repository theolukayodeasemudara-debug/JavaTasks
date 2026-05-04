public class TaskEight{
    public static void minimumValue(int []array){
        int minimum = 0;
        int index = 0;
        for(;index < array.length; index+=2){
            minimum = array[0];
            if(array[index] <= minimum){
                minimum = array[index];
                System.out.print(minimum);
            }
        }
    }
    public static void main(String[] args){
        int []array = {1,2,3,4,5,6,7,8,9,0};
        minimumValue(array);
    }
}
