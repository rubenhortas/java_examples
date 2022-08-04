package types.datatypes.strings.formatspecifiers;

import java.util.Formatter;

public class FormatSpecifiers {
    private static final String string = "this is a string";
    private static final double double1 = 10.6;
    private static final double double2 = 9.9999999;
    private static final Formatter formatter = new Formatter(System.out);

    public static void main(String[] args) {
        formatter.format("*%30s*\n", string); // 30 chars long string representation
        formatter.format("*%-30s*\n", string); // 30 chars long string representation; left justified
        // Precision specifies the maximum number of characters from the String to print
        formatter.format("*%.10s*\n", string); // 10 chars long string representation

        // Precision specifies the number of decimal places to display,
        // rounding if there are too many or adding zeroes if there are too few
        formatter.format("*%30.10f*\n", double1);
        formatter.format("*%30.10f*\n", double2);
        formatter.format("*%2.3f*\n", double1);
        formatter.format("*%2.3f*\n", double2); // Rounds the number

        formatter.close();
    }
}
