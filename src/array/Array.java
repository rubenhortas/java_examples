package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array {
    @SuppressWarnings("MismatchedReadAndWriteOfArray")
    public static void main(String[] args) {
        // Arrays vs Lists
        // Arrays are more efficient, but lists automatically allocates more space.
        System.out.println("\nArrays vs Lists");
        Integer[] arrayOfIntegers = new Integer[10];

        for (int i = 0; i < 10; i++) {
            arrayOfIntegers[i] = i;
        }

        System.out.println(arrayOfIntegers[6]);
        System.out.println(Arrays.toString(arrayOfIntegers));

        List<Integer> listOfIntegers = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            listOfIntegers.add(i);
        }

        System.out.println(listOfIntegers.get(6));
        System.out.println(listOfIntegers);

        // Initialization
        System.out.println("\nInitialization");
        Integer[] a; // Local uninitialized variable

        Integer[] b = new Integer[5]; // Initialized to point to an array
        // The references inside the array are automatically initialized to null
        System.out.println(Arrays.toString(b));

        //Aggregate initialization
        Integer[] d = {0, 1, 2};
        System.out.println(Arrays.toString(d));

        //Dynamic aggregate initialization
        a = new Integer[]{3, 4, 5};
        System.out.println(Arrays.toString(a));

        //noinspection GrazieInspection
        d = a; //Now d and a are pointing to the same array
        System.out.println(Arrays.toString(d));

        // Fill
        System.out.println("\nFill");
        int[] arrayToFill = new int[20];
        Arrays.fill(arrayToFill, 1);
        System.out.println(Arrays.toString(arrayToFill));

        // Copy
        System.out.println("\nCopy");
        Integer[] originalArray = new Integer[10];
        Integer[] copyArray = new Integer[10];

        Arrays.fill(originalArray, 1);
        Arrays.fill(copyArray, 2);

        System.out.println(Arrays.toString(originalArray));
        System.out.println(Arrays.toString(copyArray));

        System.arraycopy(originalArray, 0, copyArray, 0, originalArray.length);

        System.out.println("After copy");
        System.out.println(Arrays.toString(copyArray));

        // Comparison
        System.out.println("\nComparison");
        System.out.println("originalArray == copyArray:" + Arrays.equals(originalArray, copyArray));

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

        // Sorting
        System.out.println("\nSorting");
        Integer[] unsortedArray = new Integer[10];
        for (int i = 0; i < 10; i++) {
            unsortedArray[i] = (unsortedArray.length - i);
        }
        System.out.println(Arrays.toString(unsortedArray));

        Arrays.sort(unsortedArray); // Quicksort for primitives, Merge sort for objects
        System.out.println("After sort");
        System.out.println(Arrays.toString(unsortedArray));

        // Binary search
        // Only for sorted arrays
        int position = Arrays.binarySearch(unsortedArray, 8);
        System.out.println("\nBinary search");
        System.out.println("Position of 8 in unsortedArray (after sort): " + position);

        //Conversion
        String[] stringArray;
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("string1");
        arrayList.add("string2");
        stringArray = arrayList.toArray(new String[0]);
        // The toArray() method without passing any argument returns Object[]. So you have to pass an array
        // as an argument, which will be filled with the data from the lists.list, and returned
        // Due to JVM optimizations, using new String[0] is better than new String[lists.list.size()]
        // https://shipilev.net/blog/2016/arrays-wisdom-ancients/
        System.out.println("\nConversion: ArrayList<String> to String[]");
        System.out.println(arrayList);
        System.out.println(Arrays.toString(stringArray));
    }
}
