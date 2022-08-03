package types.datatypes.array;

import java.util.Arrays;

public class Multidimensional {
    private static final Integer[][] multiDimensionalArray1 = {{0, 1, 2, 3, 4}, {5, 6, 7, 8, 9}, {10, 11, 12, 13, 14}};
    private static final Integer[][] multiDimensionalArray2 = {{0, 1, 2, 3, 4}, {5, 6, 7, 8, 9}, {10, 11, 12, 13, 14}};

    public static void main(String[] args) {
        print();
        compare();
    }

    private static void print() {
        // deepToString to print multi dimensional arrays
        System.out.println("multiDimensionalArray1: " + Arrays.deepToString(multiDimensionalArray1));
    }

    private static void compare() {
        // deepEquals to compare multi dimensional arrays
        System.out.println("multiDimensionalArray1 == multiDimensionalArray2: " + Arrays.deepEquals(multiDimensionalArray1, multiDimensionalArray2));
    }
}
