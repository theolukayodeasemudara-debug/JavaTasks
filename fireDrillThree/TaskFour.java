public class TaskFour{
    public static int []getArrayEvenIndex(int []number){
        int []array = new int[10];
        for(int index = 0; index < array.length; index+=2){
            System.out.print(array[index] + " ");
        }
        return array;
    }

    public static void main(String[] args){
        int []array = {1,2,3,4,5,6,7,8,9,0};
        getArrayEvenIndex(array);
    }
}
