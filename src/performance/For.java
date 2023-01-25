package performance;

import java.time.Duration;
import java.time.Instant;
import java.util.List;
import java.util.stream.IntStream;

@SuppressWarnings("ReassignedVariable")
public class For {
    private static final int ITERATIONS = 1000000;
    private static final int LIST_SIZE = 1000000;

    public static void main(String[] args) {
        Instant start; // Requires java 8
        Instant finish;
        long time;
        List<Integer> numbers = IntStream.range(0, LIST_SIZE).boxed().toList();

        System.out.printf("List size: %d elements\n", LIST_SIZE);
        System.out.println(numbers.size());
        System.out.printf("Running %d iterations\n", ITERATIONS);

        // For is much faster
        start = Instant.now();
        iterateFor(numbers);
        finish = Instant.now();
        time = Duration.between(start, finish).toMillis();
        System.out.printf("For loop: %d milliseconds.\n", time);

        start = Instant.now();
        iterateForeach(numbers);
        finish = Instant.now();
        time = Duration.between(start, finish).toMillis();
        System.out.printf("For each loop: %d milliseconds.", time);
    }

    private static void iterateFor(List<Integer> numbers) {
        int number;

        for (int i = 0; i < LIST_SIZE; i++) {
            number = numbers.get(i);
        }
    }

    private static void iterateForeach(List<Integer> numbers) {
        int number;

        for (int i: numbers) {
            number = numbers.get(i);
        }
    }
}
