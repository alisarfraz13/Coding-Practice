import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("========================================");
        System.out.println("      ADVANCED GRADE CALCULATOR        ");
        System.out.println("========================================");

        System.out.print("Enter Total Marks: ");
        double total = input.nextDouble();

        System.out.print("Enter Obtained Marks: ");
        double obtained = input.nextDouble();

        double percentage = (obtained / total) * 100;
        
        // Percentage ko single digit mein convert karna (e.g., 85 / 10 = 8)
        int score = (int) percentage / 10;

        System.out.println("----------------------------------------");
        System.out.printf("Percentage: %.2f%%\n", percentage);

        System.out.print("Grade: ");
        switch (score) {
            case 10:
            case 9:
                System.out.println("A+ (Excellent)");
                break;
            case 8:
                System.out.println("A (Very Good)");
                break;
            case 7:
                System.out.println("B (Good)");
                break;
            case 6:
                System.out.println("C (Satisfactory)");
                break;
            case 5:
                System.out.println("D (Pass)");
                break;
            default:
                System.out.println("F (Fail)");
        }
        System.out.println("========================================");

        input.close();
    }
}