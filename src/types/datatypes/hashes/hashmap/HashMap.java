package types.datatypes.hashes.hashmap;

import java.util.Map;
import java.util.Random;

public class HashMap {
    private static final Random random = new Random(47);
    
    public static void main(String[] args) {
        Map<Integer, Integer> map = new java.util.HashMap<>();
        int randomValue;
        Integer frequency;

        for (int i = 0; i < 100; i++) {
            randomValue = random.nextInt(20);
            frequency = map.get(randomValue);

            if (frequency == null) {
                map.put(randomValue, 1);
            } else {
                map.put(randomValue, frequency + 1);
            }
        }

        System.out.println(map);
    }
}
