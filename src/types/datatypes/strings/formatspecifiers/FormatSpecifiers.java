package types.datatypes.strings.formatspecifiers;

import java.util.Formatter;

public class FormatSpecifiers {
    public static void main(String[] args) {
        Formatter f = new Formatter(System.out);
        String str = "this is a string";
        double f1 = 10.6;
        double f2 = 9.9999999;

        f.format("*%30s*\n", str); // 30 chars long string representation
        f.format("*%-30s*\n", str); // 30 chars long string representation; left justified
        // Precision specifies the maximum number of characters from the String
        // to print.
        f.format("*%.10s*\n", str); // 10 chars long string representation

        // Precision specifies the number of decimal places to display,
        // rounding if there are too many or adding zeroes if there are too few.
        f.format("*%30.10f*\n", f1);
        f.format("*%30.10f*\n", f2);
        f.format("*%2.3f*\n", f1);
        f.format("*%2.3f*\n", f2); // Rounds the number

        f.close();
    }
}
