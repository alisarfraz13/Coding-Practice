import java.util.Scanner;

public class GreaterNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("========================================");
        System.out.println("        GREATEST NUMBER FINDER          ");
        System.out.println("========================================");

        System.out.print("Enter first number: ");
        double n1 = input.nextDouble();

        System.out.print("Enter second number: ");
        double n2 = input.nextDouble();

        System.out.print("Enter third number: ");
        double n3 = input.nextDouble();

        System.out.println("----------------------------------------");

        if (n1 >= n2 && n1 >= n3) {
            System.out.println("The Greatest Number is: " + n1);
        } else if (n2 >= n1 && n2 >= n3) {
            System.out.println("The Greatest Number is: " + n2);
        } else {
            System.out.println("The Greatest Number is: " + n3);
        }

        System.out.println("========================================");

        input.close();
    }
}