package enums;

public class JExEnum {
    public static void main(String[] args) {
        // Example of using a default enum
        defaultEnumEx();

        // Example of switch usage with default enums
        defaultEnumSwitch();

        // Example of using a custom enum (with assigned values)
        customEnumEx();

        // Print an enum info
        printEnum();
    }

    // Example of value assignment and comparison of an enum
    @SuppressWarnings("ConstantConditions")
    private static void defaultEnumEx() {

        // Assign a value to the local variable myEnumValue
        DefaultEnum myEnumValue = DefaultEnum.ONE;

        // Example of comparison
        if (myEnumValue.equals(DefaultEnum.ONE)) {
            System.out.println("Ok, myEnumValue is equal to DefaultEnum.ONE");
        }
    }

    // Example of switch usage with default enums.
    @SuppressWarnings({"SwitchStatementWithTooFewBranches", "ConstantConditions", "EnhancedSwitchMigration"})
    private static void defaultEnumSwitch() {
        // Assign a value to the local variable myEnumValue
        DefaultEnum myEnumValue = DefaultEnum.ONE;

        switch (myEnumValue) {
            case ONE:
                System.out.println("Ok, switch done. Case DefaultEnum.ONE");
                break;
            default:
                System.out.println("Nevermind...");
                break;
        }
    }

    // Example of value comparison of a custom enum (with assigned values)
    private static void customEnumEx() {
        int myValue = 2;

        if (myValue == CustomEnum.TWO.getValue()) {
            System.out.println("Ok, myValue is equal to CustomEnum.TWO value");
        }
    }

    private static void printEnum() {
        System.out.println("Printing enum info");

        for (CustomEnum customEnum : CustomEnum.values()) {
            System.out.println("\tName: " + customEnum.name());
            System.out.println("\tOrdinal: " + customEnum.ordinal());
            System.out.println("\tValue: " + customEnum.getValue());
            System.out.println("\tDeclaring class: " + customEnum.getDeclaringClass());
            System.out.println();
        }
    }
}
