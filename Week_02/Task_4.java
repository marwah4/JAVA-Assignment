package week_02;

/**
 *
 * @author Marwah
 */
import java.util.Scanner;

public class Task_4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int numberOne = input.nextInt();
        System.out.print("Enter second number: ");
        int numberTwo = input.nextInt();

        System.out.print("1. Addition (+).\n"
                + "2. Subtraction (-).\n"
                + "3. Multiplication (*).\n"
                + "4. Division (/).\n");
        System.out.print("Enter operation number: ");
        int option = input.nextInt();
        int answer = 0;
        switch (option) {
            case 1:
                answer = numberOne + numberTwo;
                break;
            case 2:
                answer = numberOne - numberTwo;
                break;
            case 3:
                answer = numberOne * numberTwo;
                break;
            case 4:
                answer = numberOne / numberTwo;
                break;
        }
        System.out.println("The result is " + answer);
    }
}
