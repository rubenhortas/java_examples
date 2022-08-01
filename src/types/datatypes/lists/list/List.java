package types.datatypes.lists.list;

import java.util.ArrayList;

public class List {
    @SuppressWarnings("SlowListContainsAll")
    public static void main(String[] args) {
        java.util.List<String> heroes = new ArrayList<>();

        // Insert some elements
        heroes.add("Batman");
        heroes.add("Green Lantern");
        heroes.add("Hulk");
        heroes.add("Thor");
        System.out.println("Heroes types.datatypes.lists.list: " + heroes);
        System.out.println();

        // Insert at an index
        heroes.add(0, "Spiderman");
        System.out.println("List after add \"Spiderman\" at 0 position: " + heroes);
        System.out.println();

        // Sublists
        java.util.List<String> avengers = heroes.subList(3, 5);
        System.out.println("Heroes types.datatypes.lists.list contains avengers: " + heroes.containsAll(avengers));
        System.out.println();

        // Copy
        java.util.List<String> copyList = new ArrayList<>(heroes); // Fresh copy
        System.out.println("Copy types.datatypes.lists.list: " + copyList);
        System.out.println();

        // Remove
        java.util.List<String> listToRemove = new ArrayList<>(heroes.subList(0, 3));
        System.out.println("listToRemove types.datatypes.lists.list: " + listToRemove);
        listToRemove.removeAll(avengers); // Removes EXACT objects
        System.out.println("listToRemove types.datatypes.lists.list without avengers: " + listToRemove);
        System.out.println();

        // Replace an element
        listToRemove.set(2, "Superman");
        System.out.println("listToRemove: " + listToRemove);
        System.out.println();

        // Contains
        System.out.println("Avengers contains Hulk = " + avengers.contains("Hulk"));
        System.out.println();

        // Get
        System.out.println("Avengers.get(1): " + avengers.get(1));
        System.out.println();
    }
}
