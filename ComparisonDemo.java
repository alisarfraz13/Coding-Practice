public class ComparisonDemo {
    public static void main(String[] args) {

        int x = 20;
        int y = 10;

        if (x == y) {
            System.out.println("x is equal to y");
        } 
        else if (x != y) {
            System.out.println("x is NOT equal to y");
        }

        if (x > y) {
            System.out.println("x is greater than y");
        } 
        else {
            System.out.println("x is NOT greater than y");
        }

        if (x < y) {
            System.out.println("x is less than y");
        } 
        else {
            System.out.println("x is NOT less than y");
        }

        if (x >= y) {
            System.out.println("x is greater than or equal to y");
        }

        if (x <= y) {
            System.out.println("x is less than or equal to y");
        } 
        else {
            System.out.println("x is NOT less than or equal to y");
        }
    }
}