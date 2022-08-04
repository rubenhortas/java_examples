package types.datatypes.lists.list;

import java.util.ArrayList;

public class List {
    private static final java.util.List<String> heroes = new ArrayList<>();
    private static java.util.List<String> avengers;
    private static java.util.List<String> dcHeroes;

    public static void main(String[] args) {
        insert();
        contains();
        copy();
        remove();
        get();
        set(); // Replace
    }

    private static void insert() {
        heroes.add("Batman");
        heroes.add("Green Lantern");
        heroes.add("Hulk");
        heroes.add("Thor");

        heroes.add(0, "Superman"); // Insert at index

        avengers = heroes.subList(3, 5);
        dcHeroes = new ArrayList<>(heroes.subList(0, 3));

        System.out.println("Heroes: " + heroes);
        System.out.println("Avengers:" + avengers);
        System.out.println("DC heroes: " + dcHeroes);
    }

    @SuppressWarnings("SlowListContainsAll")
    private static void contains() {
        System.out.println("Avengers contains Hulk: " + avengers.contains("Hulk"));
        System.out.println("Heroes contains avengers: " + heroes.containsAll(avengers));
    }

    private static void copy() {
        java.util.List<String> copyList = new ArrayList<>(heroes); // Fresh copy.

        System.out.println("Copy: " + copyList);
    }

    private static void remove() {
        heroes.removeAll(avengers); // Removes EXACT objects

        System.out.println("Removing the Avengers... Heroes: " + heroes);
    }

    private static void get() {
        System.out.println("dHeroes.get(1): " + dcHeroes.get(1));
    }

    private static void set() {
        dcHeroes.set(2, "Flash");

        System.out.println("DC Heroes: " + dcHeroes);
    }
}
