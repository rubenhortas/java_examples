package hashes.hashmap;

import java.util.Map;
import java.util.Random;

public class HashMap {
    @SuppressWarnings("Java8MapApi")
    public static void main(String[] args) {
        Random random = new Random(47);
        Map<Integer, Integer> intMap = new java.util.HashMap<>();

        for (int i = 0; i < 100; i++) {
            int randomInt = random.nextInt(20);
            Integer frequency = intMap.get(randomInt);

            if (frequency == null) {
                intMap.put(randomInt, 1);
            } else {
                intMap.put(randomInt, frequency + 1);
            }
        }

        System.out.println(intMap);
    }
}
