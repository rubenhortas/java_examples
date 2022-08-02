package loops.foreach;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Foreach {

    private static final List<String> ELECTRONIC_DEVICES = new ArrayList<>() {{
        add("router");
        add("raspberry pi");
        add("tv");
        add("hard disk");
    }};

    private static final Collection<String> MATRIX_MESSAGE = new LinkedList<>() {{
        add("Follow");
        add("the");
        add("white");
        add("rabbit");
    }};

    public static void main(String[] args) {
        System.out.print("Electronic devices:");

        for (String device : ELECTRONIC_DEVICES) {
            System.out.print(" " + device);
        }

        System.out.println();

        // Foreach also works with any Collection object
        System.out.print("Wake up, NEO.");

        for (String word : MATRIX_MESSAGE) {
            System.out.print(" " + word);
        }
    }
}
