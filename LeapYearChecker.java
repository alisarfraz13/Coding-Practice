import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("========================================");
        System.out.println("          LEAP YEAR CHECKER             ");
        System.out.println("========================================");

        System.out.print("Enter a year: ");
        int year = input.nextInt();

        System.out.println("----------------------------------------");

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("RESULT: " + year + " is a LEAP YEAR.");
        } else {
            System.out.println("RESULT: " + year + " is NOT a leap year.");
        }

        System.out.println("========================================");

        input.close();
    }
}