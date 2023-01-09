import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scans the input.
        Scanner scan = new Scanner(System.in);

        // Enter the numbers in the input console
        int number1 = scan.nextInt();
        int number2 = scan.nextInt();

        System.out.print(squareOfSum(number1, number2));
    }

    /**
     * Calculates the square of the sum of passed numbers.
     */
    public static int squareOfSum(int number1, int number2) {
        return (number1 + number2) * (number1 + number2);
    }
}