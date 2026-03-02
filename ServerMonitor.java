import java.lang.management.ManagementFactory;
import com.sun.management.OperatingSystemMXBean;

public class ServerMonitor {

    public static void main(String[] args) throws InterruptedException {

        OperatingSystemMXBean osBean =
            (OperatingSystemMXBean) ManagementFactory.getOperatingSystemMXBean();

        while (true) {

            // CPU Usage
            double cpuLoad = osBean.getSystemCpuLoad() * 100;

            // RAM Usage
            long totalMemory = osBean.getTotalPhysicalMemorySize();
            long freeMemory = osBean.getFreePhysicalMemorySize();
            long usedMemory = totalMemory - freeMemory;

            double usedRamPercent = ((double) usedMemory / totalMemory) * 100;

            System.out.println("===== SERVER STATS =====");
            System.out.printf("CPU Usage: %.2f%%\n", cpuLoad);
            System.out.printf("RAM Used: %.2f%%\n", usedRamPercent);
            System.out.println("========================");

            Thread.sleep(5000); // 5 sec delay
        }
    }
}