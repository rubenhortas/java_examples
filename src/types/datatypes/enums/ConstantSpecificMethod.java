package types.datatypes.enums;

import java.text.DateFormat;
import java.util.Date;

/* Java enums have a very interesting feature that allows you to give
   each enum instance different behavior by creating methods for each one.
   To do this, you define one or more abstract methods as part of the enum,
   then define the methods for each enum instance.
   Example extracted from the Bruce Eckel's book Thinking in java. */
public enum ConstantSpecificMethod {
    DateTime {
        String getInfo() {
            return DateFormat.getDateInstance().format(new Date());
        }
    },

    ClassPath {
        String getInfo() {
            return System.getenv("CLASSPATH");
        }
    },

    Version {
        String getInfo() {
            return System.getProperty("java.version");
        }
    };

    abstract String getInfo();

    public static void main(String[] args) {
        for (ConstantSpecificMethod csm : values()) {
            System.out.println(csm.getInfo());
        }
    }
}
