```java
import java.util.Scanner;

public class Stopwatch {
    private long start;

    public static void main(String[] args) {
        Stopwatch stopwatch = new Stopwatch();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Press 's' to start the stopwatch");
        String input = scanner.nextLine();
        if (input.equalsIgnoreCase("s")) {
            stopwatch.start();
        }

        System.out.println("Press 'e' to end the stopwatch");
        input = scanner.nextLine();
        if (input.equalsIgnoreCase("e")) {
            stopwatch.stop();
        }
    }

    public void start() {
        start = System.currentTimeMillis();
    }

    public void stop() {
        long end = System.currentTimeMillis();
        long elapsedTime = end - start;
        System.out.println("Elapsed time in milliseconds: " + elapsedTime);
    }
}
```