package types.datatypes.enums;

// Use EnumSet instead of flags
public class EnumSet {
    public static void main(String[] args) {
        // Empty set
        java.util.EnumSet<Food> cupboard = java.util.EnumSet.noneOf(Food.class);
        cupboard.add(Food.Candies);
        cupboard.add(Food.Popcorn);
        cupboard.add(Food.Chips);
        System.out.println(cupboard);

        // Removing all
        cupboard.removeAll(java.util.EnumSet.range(Food.Chips, Food.Candies));
        System.out.println(cupboard);

        // Adding all
        cupboard = java.util.EnumSet.allOf(Food.class);
        System.out.println(cupboard);

        // Since it's a set it will only hold one of each item.
        // Duplicate calls to add() with the same argument are ignored.
        cupboard.add(Food.Candies);
        System.out.println(cupboard);
    }
}
