package types.datatypes.hashes.hashmap;

import java.util.Map;
import java.util.Random;

public class HashMap {
    public static void main(String[] args) {
        Random random = new Random(47);
        Map<Integer, Integer> intMap = new java.util.HashMap<>();
        int randomValue;
        Integer frequency;

        for (int i = 0; i < 100; i++) {
            randomValue = random.nextInt(20);
            frequency = intMap.get(randomValue);

            if (frequency == null) {
                intMap.put(randomValue, 1);
            } else {
                intMap.put(randomValue, frequency + 1);
            }
        }

        System.out.println(intMap);
    }
}
