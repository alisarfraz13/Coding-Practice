import java.util.Scanner;

class Employee {
    String name;
    String department;
    double salary;

    Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
}

class Bonus extends Employee {
    double bonusAmount;
    double totalEarnings;

    Bonus(String name, String department, double salary, double bonusPercentage) {
        super(name, department, salary);
        
        this.bonusAmount = (salary * bonusPercentage) / 100;
        this.totalEarnings = salary + bonusAmount;

        System.out.println("\n--- Employee Salary Slip ---");
        System.out.println("Name: " + this.name);
        System.out.println("Department: " + this.department);
        System.out.println("Basic Salary: " + this.salary);
        System.out.println("Bonus (" + bonusPercentage + "%): " + this.bonusAmount);
        System.out.println("Total Monthly Income: " + this.totalEarnings);
    }
}

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

        new Bonus(n, d, s, p);

        sc.close();
    }
}