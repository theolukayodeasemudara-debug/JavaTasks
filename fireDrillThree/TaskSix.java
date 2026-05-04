public class TaskSix{
    public static void sumOfEvenArrayElements(int []array){
        int sum = 0;
        int index = 0;
        for(; index < array.length; index+=2){
            sum += array[index];
        }
                System.out.print(sum);
    }
    public static void main(String[] args){
        int []array = {1,2,3,4,5,6,7,8,9,0};
        sumOfEvenArrayElements(array);
    }
}
