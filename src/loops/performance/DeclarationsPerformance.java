package loops.performance;

import java.time.Duration;
import java.time.Instant;

public class DeclarationsPerformance {
    private static final int ITERATIONS = 1000000000;

    public static void main(String[] args) {
        Instant start; // Requires java 8.
        Instant finish;
        long time;

        System.out.printf("%d iterations\n", ITERATIONS);

        start = Instant.now();
        assignInsideTheLoop();
        finish = Instant.now();
        time = Duration.between(start, finish).toNanos();
        System.out.printf("Assigning the variable inside the loop: %d nanoseconds.\n", time);

        start = Instant.now();
        assignOutsideTheLoop();
        finish = Instant.now();
        time = Duration.between(start, finish).toNanos();
        System.out.printf("Assigning the variable outside the loop: %d nanoseconds.", time);
    }

    private static void assignInsideTheLoop() {
        for (int i = 0; i < ITERATIONS; i++) {
            @SuppressWarnings("unused")
            String s = "someString";
        }
    }

    @SuppressWarnings({"ReassignedVariable", "UnusedAssignment"})
    private static void assignOutsideTheLoop() {
        String s;

        for (int i = 0; i < ITERATIONS; i++) {
            s = "someString";
        }
    }
}
