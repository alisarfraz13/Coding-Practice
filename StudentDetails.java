import java.util.Scanner;

public class StudentDetails {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.println("--- Please Enter Student Information ---");
        
        System.out.print("Enter Full Name: ");
        String name = input.nextLine();

        System.out.print("Enter Age: ");
        int age = input.nextInt();
        input.nextLine(); 

        System.out.print("Enter Department: ");
        String department = input.nextLine();

        System.out.print("Enter Course: ");
        String course = input.nextLine();

        
        System.out.println("\n========================================");
        System.out.println("           STUDENT PROFILE              ");
        System.out.println("========================================");
        System.out.println("Name       : " + name);
        System.out.println("Age        : " + age);
        System.out.println("Department : " + department);
        System.out.println("Course     : " + course);
        System.out.println("========================================");

        input.close();
    }
}