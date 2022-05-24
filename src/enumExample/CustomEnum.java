package enumExample;

/**
 * Example of enum with assigned values.
 */
public enum CustomEnum {
    ONE(1),
    TWO(2),
    THREE(3);

    private final int enumValue;

    CustomEnum(int value) {
        this.enumValue = value;
    }

    public int getValue() {
        return this.enumValue;
    }
}
