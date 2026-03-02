public class LogicalDemo {
    public static void main(String[] args) {

        int age = 22;
        boolean hasID = true;

        if (age >= 18 && hasID) {
            System.out.println("Allowed to enter.");
        }

        if (age < 18 || !hasID) {
            System.out.println("Not allowed.");
        }

        if (!(age < 18)) {
            System.out.println("Age is valid.");
        }
    }
}