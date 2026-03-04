import java.util.Scanner;

// 1. Parent Class
class Employee {
    String name;
    String department;
    double salary;

    // Parent Constructor
    Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
}

// 2. Child Class (Inheritance)
class Bonus extends Employee {
    double bonusAmount;
    double totalEarnings;

    // Child Constructor: Is mein hi calculation hogi
    Bonus(String name, String department, double salary, double bonusPercentage) {
        // 'super' keyword parent class ke constructor ko call krta hai
        super(name, department, salary);
        
        // Logic: Bonus calculate krna (Salary * Percentage / 100)
        this.bonusAmount = (salary * bonusPercentage) / 100;
        this.totalEarnings = salary + bonusAmount;

        // Result print krna (Constructor ke andar hi)
        System.out.println("\n--- Employee Salary Slip ---");
        System.out.println("Name: " + this.name);
        System.out.println("Department: " + this.department);
        System.out.println("Basic Salary: " + this.salary);
        System.out.println("Bonus (" + bonusPercentage + "%): " + this.bonusAmount);
        System.out.println("Total Monthly Income: " + this.totalEarnings);
    }
}

// 3. Main Execution Class
public class Mainn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Employee Name enter karein: ");
        String n = sc.nextLine();

        System.out.print("Department enter karein: ");
        String d = sc.nextLine();

        System.out.print("Basic Salary enter karein: ");
        double s = sc.nextDouble();

        System.out.print("Bonus Percentage (%) enter karein: ");
        double p = sc.nextDouble();

        // Object banatay hi Constructor call ho jaye ga aur output aa jaye gi
        new Bonus(n, d, s, p);

        sc.close();
    }
}