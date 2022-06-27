package linkedHashMapExample;

import java.util.LinkedHashMap;

public class LinkedHashMapExample {
    /* LinkedHashMap can be configured in the constructor to use
       a least-recently-used (LRU) algorithm based on accesses,
       so elements that haven't been accessed (and thus are
       candidates to removal) appear at the front of the list.
       This allows easy creation of programs that do periodic
       cleanup in order to save space. */
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();

        linkedHashMap.put(1, "One");
        linkedHashMap.put(2, "Two");
        linkedHashMap.put(3, "Three");
        linkedHashMap.put(4, "Four");
        linkedHashMap.put(5, "Five");

        System.out.println(linkedHashMap);

        // Least Recently Used order
        linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);

        linkedHashMap.put(1, "One");
        linkedHashMap.put(2, "Two");
        linkedHashMap.put(3, "Three");
        linkedHashMap.put(4, "Four");
        linkedHashMap.put(5, "Five");

        for (int i = 0; i < 3; i++) {
            linkedHashMap.get(i);
        }

        System.out.println(linkedHashMap);
    }
}
