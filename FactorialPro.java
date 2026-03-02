import java.util.Scanner;

public class FactorialPro {
    public static void main(String[] args) {
        // Step 1: User se input lene ke liye Scanner ka object
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a positive number: ");
        
        // Check karna ke user ne number hi dala hai ya nahi
        if (sc.hasNextInt()) {
            int num = sc.nextInt();
            
            // Step 2: Negative number check (Factorial negative ka nahi hota)
            if (num < 0) {
                System.out.println("Error! Negative numbers ka factorial nahi nikalta.");
            } else {
                // Step 3: Result ke liye 'long' use kiya hai taake bara result store ho sakay
                long result = 1;
                
                // Step 4: Optimized Loop (1 se shuru kar ke num tak)
                for (int i = 1; i <= num; i++) {
                    result *= i; // result = result * i
                }
                
                System.out.println("The Factorial of " + num + " is: " + result);
            }
        } else {
            System.out.println("Ghalat input! Sirf numbers enter karen.");
        }
        
        sc.close(); // Resource leak se bachne ke liye close karna
    }
}