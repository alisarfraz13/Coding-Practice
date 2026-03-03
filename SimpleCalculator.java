import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("========================================");
        System.out.println("        SMART JAVA CALCULATOR           ");
        System.out.println("========================================");

        // User se operation puchna
        System.out.println("Select an Operation:");
        System.out.println(" +  for Addition");
        System.out.println(" -  for Subtraction");
        System.out.println(" * for Multiplication");
        System.out.println(" /  for Division");
        System.out.print("\nEnter your choice: ");
        char choice = input.next().charAt(0);

        // User se values lena
        System.out.print("Enter first number: ");
        double num1 = input.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = input.nextDouble();

        System.out.println("----------------------------------------");

        // Switch statement se operation handle karna
        switch (choice) {
            case '+':
                System.out.println("Result: " + num1 + " + " + num2 + " = " + (num1 + num2));
                break;

            case '-':
                System.out.println("Result: " + num1 + " - " + num2 + " = " + (num1 - num2));
                break;

            case '*':
                System.out.println("Result: " + num1 + " * " + num2 + " = " + (num1 * num2));
                break;

            case '/':
                // Division by zero check
                if (num2 != 0) {
                    System.out.println("Result: " + num1 + " / " + num2 + " = " + (num1 / num2));
                } else {
                    System.out.println("Error: Cannot divide by zero!");
                }
                break;

            default:
                System.out.println("Invalid Choice! Please select +, -, * or /.");
        }

        System.out.println("========================================");
        input.close();
    }
}