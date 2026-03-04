import java.util.Scanner;

public class PercentageCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("========================================");
        System.out.println("      STUDENT PERCENTAGE CALCULATOR     ");
        System.out.println("========================================");

        System.out.print("Enter Total Marks: ");
        double total = input.nextDouble();

        System.out.print("Enter Obtained Marks: ");
        double obtained = input.nextDouble();

        double percentage = (obtained / total) * 100;

        System.out.println("----------------------------------------");
        System.out.printf("Your Percentage is: %.2f%%\n", percentage);
        System.out.println("----------------------------------------");

        input.close();
    }
}