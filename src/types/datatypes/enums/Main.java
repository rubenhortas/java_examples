package types.datatypes.enums;

public class Main {

    private static final DefaultEnum defaultEnum = DefaultEnum.One;

    public static void main(String[] args) {
        compareDefaultEnum();
        compareDefaultEnumWithSwitch();
        compareCustomEnumsValues();
        printCustomEnumInfo();
    }

    private static void compareDefaultEnum() {
        System.out.println("(" + defaultEnum + " == " + DefaultEnum.One + "): " + defaultEnum.equals(DefaultEnum.One));
    }

    @SuppressWarnings({"SwitchStatementWithTooFewBranches", "EnhancedSwitchMigration"})
    private static void compareDefaultEnumWithSwitch() {
        switch (defaultEnum) {
            case One:
                System.out.println("Ok, switch done. Case DefaultEnum.ONE");
                break;
            default:
                System.out.println("Nevermind...");
                break;
        }
    }

    private static void compareCustomEnumsValues() {
        int value = 2;
        boolean areEquals = value == CustomEnum.Two.getValue();

        System.out.println("(" + value + " == " + DefaultEnum.Two + "): " + areEquals);
    }

    private static void printCustomEnumInfo() {
        System.out.println("Printing custom enum info");

        for (CustomEnum customEnum : CustomEnum.values()) {
            System.out.println("\tName: " + customEnum.name());
            System.out.println("\tOrdinal: " + customEnum.ordinal());
            System.out.println("\tValue: " + customEnum.getValue());
            System.out.println("\tDeclaring class: " + customEnum.getDeclaringClass());
        }
    }
}
