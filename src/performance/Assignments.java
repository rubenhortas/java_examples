package performance;

import java.time.Duration;
import java.time.Instant;

public class Assignments {
    private static final int ITERATIONS = 100000;
    private static final int ASSIGNMENTS = 100000;

    public static void main(String[] args) {
        Instant start; // Requires java 8.
        Instant finish;
        long time;

        System.out.printf("Running %d iterations\n", ITERATIONS);

        start = Instant.now();
        assignInsideTheLoop();
        finish = Instant.now();
        time = Duration.between(start, finish).toMillis();
        System.out.printf("Assigning the variable inside the loop: %d milliseconds.\n", time);

        // Assigning the variable outside the loop is slightly faster.
        start = Instant.now();
        assignOutsideTheLoop();
        finish = Instant.now();
        time = Duration.between(start, finish).toMillis();
        System.out.printf("Assigning the variable outside the loop: %d milliseconds.", time);
    }

    private static void assignInsideTheLoop() {
        for (int i = 0; i < ITERATIONS; i++) {
            for (int j = 0; j < ASSIGNMENTS; j++) {
                @SuppressWarnings("unused")
                String s = "someString";
            }
        }
    }

    @SuppressWarnings({"ReassignedVariable", "UnusedAssignment"})
    private static void assignOutsideTheLoop() {
        String s;

        for(int j = 0; j < ITERATIONS; j++) {
            for (int i = 0; i < ASSIGNMENTS; i++) {
                s = "someString";
            }
        }
    }
}
