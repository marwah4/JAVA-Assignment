package week_02;

/**
 *
 * @author Marwah
 */
import java.util.Scanner;


public class Task_2 {
    public static void main(String[] args) {
        int positive=0;
        int negetive=0;
        int number;
        Scanner input =new Scanner(System.in);
        for(int i=0; i<10; i++)
        {
            number=input.nextInt();
            if(number>=0)
            {
                positive++;
            }
            else
            {
                negetive++;
            }
        }
        System.out.println("Positive number is : "+positive);
        System.out.println("Negetive number is : "+negetive);
    }
 
}
