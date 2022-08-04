package types.datatypes.enums;

// Example of enum with assigned values
public enum CustomEnum {
    One(1),
    Two(2),
    Three(3);

    private final int enumValue;

    CustomEnum(int value) {
        this.enumValue = value;
    }

    public int getValue() {
        return this.enumValue;
    }
}
