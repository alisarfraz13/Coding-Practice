import java.util.Scanner;

public class EvenOddChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("========================================");
        System.out.println("       EVEN OR ODD NUMBER CHECKER       ");
        System.out.println("========================================");

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        System.out.println("----------------------------------------");

        if (num % 2 == 0) {
            System.out.println("Result: " + num + " is an EVEN number.");
        } else {
            System.out.println("Result: " + num + " is an ODD number.");
        }

        System.out.println("========================================");

        input.close();
    }
}