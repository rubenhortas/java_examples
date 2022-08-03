package types.datatypes.array;

import java.util.Arrays;

public class Multidimensional {
    public static void main(String[] args) {
        Integer[][] multiDimensionalArray1 = new Integer[5][5];
        Integer[][] multiDimensionalArray2 = new Integer[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                multiDimensionalArray1[i][j] = i;
                multiDimensionalArray2[i][j] = i;
            }
        }

        // deepToString to print multi dimensional arrays
        System.out.println("multiDimensionalArray1: " + Arrays.deepToString(multiDimensionalArray1));
        System.out.println("multiDimensionalArray2: " + Arrays.deepToString(multiDimensionalArray2));

        // deepEquals to compare multi dimensional arrays
        System.out.println("multiDimensionalArray1 == multiDimensionalArray2: " + Arrays.deepEquals(multiDimensionalArray1, multiDimensionalArray2));
    }
}
