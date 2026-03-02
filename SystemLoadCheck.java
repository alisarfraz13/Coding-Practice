public class SystemLoadCheck {
    public static void main(String[] args) {

        int cpuUsage = 75;

        if (cpuUsage < 40) {
            System.out.println("System running normally.");
        } 
        else if (cpuUsage >= 40 && cpuUsage < 80) {
            System.out.println("System under moderate load.");
        } 
        else {
            System.out.println("System under high load! Optimize resources.");
        }
    }
}