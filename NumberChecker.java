import java.util.Scanner;

public class NumberChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("========================================");
        System.out.println("     POSITIVE OR NEGATIVE CHECKER       ");
        System.out.println("========================================");

        System.out.print("Enter any number: ");
        double num = input.nextDouble();

        System.out.println("----------------------------------------");

        if (num > 0) {
            System.out.println("RESULT: " + num + " is a POSITIVE number.");
        } else if (num < 0) {
            System.out.println("RESULT: " + num + " is a NEGATIVE number.");
        } else {
            System.out.println("RESULT: The number is ZERO.");
        }

        System.out.println("----------------------------------------");

        input.close();
    }
}