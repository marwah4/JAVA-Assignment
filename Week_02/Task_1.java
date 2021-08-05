// print the sum of all numbers between 1 to 100

package week_02;

/**
 *
 * @author Marwah
 */
public class Task_1 {
    public static void main(String[] args) {
        int sum =0;
        for(int i=0; i<=100; i++)
        {
            sum=sum+i;
        }
        System.out.println("sum of all numbers between 1 to 100 = "+sum);
    }
}
