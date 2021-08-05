package week_02;

/**
 *
 * @author Marwah
 */
import java.util.Scanner;

public class Task_5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = input.nextInt();
        int newarr[] = new int[n + 1];
        System.out.print("Enter " + n + " integers: ");
        for (int i = 0; i < n; i++) {
            int x = input.nextInt();
            newarr[i] = x;

        }
        System.out.print("Enter the number to search: ");
        int p = input.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (newarr[i] == p) {
                count++;
            }

        }
        System.out.println(p + " occurred " + count + " times in the array.");

    }

}
