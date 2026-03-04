import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Average Calculator (5 Numbers) ===");

        System.out.print("Enter 1st number: ");
        double n1 = input.nextDouble();

        System.out.print("Enter 2nd number: ");
        double n2 = input.nextDouble();

        System.out.print("Enter 3rd number: ");
        double n3 = input.nextDouble();

        System.out.print("Enter 4th number: ");
        double n4 = input.nextDouble();

        System.out.print("Enter 5th number: ");
        double n5 = input.nextDouble();

        double sum = n1 + n2 + n3 + n4 + n5;
        double average = sum / 5;

        System.out.println("------------------------------------");
        System.out.println("Total Sum: " + sum);
        System.out.println("Average  : " + average);
        System.out.println("------------------------------------");

        input.close();
    }
}