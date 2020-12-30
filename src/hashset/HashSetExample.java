package hashset;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class HashSetExample {
    /*
     * A Set refuses to hold more than one instance of each object value.
     */
    public static void main(String[] args) {
        Random random = new Random(47);
        Set<Integer> intSet = new HashSet<>();

        for (int i = 0; i <= 100; i++) {
            intSet.add(random.nextInt(15));
        }

        System.out.println(intSet);
    }
}
