import java.util.Scanner; 
public class TaskTwentyTwo{
                                public static void main (String[] args) {

                                        Scanner valueCollector = new Scanner(System.in);    
                                        System.out.println("Give me a radius value!");

                                        double rad = valueCollector.nextInt();
                                        float valOfPi = 3.142f;

                                        System.out.printf("The Area a Circle with radius:%d, with val of Pi:%d is:",rad,valOfPi);
                                        System.out.println(3.142*rad*rad);   
                       }
}
