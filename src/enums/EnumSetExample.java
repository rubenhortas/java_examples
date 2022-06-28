package enums;

import java.util.EnumSet;

// Use EnumSet instead of flags
public class EnumSetExample {
    public static void main(String[] args) {
        // Empty set
        EnumSet<Food> cupboard = EnumSet.noneOf(Food.class);
        cupboard.add(Food.CANDIES);
        cupboard.add(Food.POPCORN);
        cupboard.add(Food.CHIPS);
        System.out.println(cupboard);

        // Removing all
        cupboard.removeAll(EnumSet.range(Food.CHIPS, Food.CANDIES));
        System.out.println(cupboard);

        // Adding all
        cupboard = EnumSet.allOf(Food.class);
        System.out.println(cupboard);

        // Since it's a set it will only hold one of each item.
        // Duplicate calls  to add() with the same argument are ignored.
        cupboard.add(Food.CANDIES);
        System.out.println(cupboard);
    }
}
