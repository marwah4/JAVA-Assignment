package week_02;

/**
 *
 * @author Marwah
 */
import java.util.Scanner;


public class Task_3 {
    public static void main(String[] args) {
        int n;
        Scanner input =new Scanner(System.in);
        n= input.nextInt();
        for(int i=1; i<=n; i++)
        {
            for(int m=1; m<=n-i; m++)
            {
                System.out.print("  ");
            }
            for(int a=1; a<=i; a++)
            {
                System.out.print(a+" ");
            }
            System.out.println("  ");
        }
    }
 
}
