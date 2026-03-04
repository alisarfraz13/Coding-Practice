import java.util.Scanner;

public class LoopTasks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // --- Task 1: Swap Two Numbers ---
        System.out.println("=== TASK 1: SWAPPING ===");
        int a = 10, b = 20;
        System.out.println("Before: a = " + a + ", b = " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After:  a = " + a + ", b = " + b);

        // --- Task 2: Print a Table ---
        System.out.println("\n=== TASK 2: TABLE ===");
        System.out.print("Enter number for table: ");
        int num = input.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }

        // --- Task 3: Factorial ---
        System.out.println("\n=== TASK 3: FACTORIAL ===");
        System.out.print("Enter number for factorial: ");
        int fNum = input.nextInt();
        long factorial = 1;
        for (int i = 1; i <= fNum; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of " + fNum + " is: " + factorial);

        // --- Task 4: Sum of First 10 Numbers ---
        System.out.println("\n=== TASK 4: SUM OF 10 NUMBERS ===");
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 numbers is: " + sum);

        input.close();
    }
}