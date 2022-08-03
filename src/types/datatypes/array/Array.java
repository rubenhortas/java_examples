package types.datatypes.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array {
    public static void main(String[] args) {
        initialize();
        fill();
        copy();
        compare();
        sort(); // Quicksort for primitives, Merge sort for objects
        doBinarySearch();
        convertArrayListToArray();
        compareArraysAndLists();
    }

    @SuppressWarnings("MismatchedReadAndWriteOfArray")
    private static void initialize() {
        Integer[] array1; // Or Integer array1[]
        Integer[] array2 = new Integer[5];   // Initialized to point to an array
        // The references inside the array are automatically initialized to null
        // Aggregate initialization
        Integer[] array3 = {0, 1, 2};
        Integer[] array4;

        // Dynamic aggregate initialization
        array1 = new Integer[]{3, 4, 5};

        array4 = array1; // Now c and a are pointing to the same array

        System.out.println("Initialization:");
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(array3));
        System.out.println(Arrays.toString(array4));
    }

    private static void fill() {
        int[] arrayToFill = new int[20];
        Arrays.fill(arrayToFill, 1);

        System.out.println("Fill:");
        System.out.println(Arrays.toString(arrayToFill));
    }

    private static void copy() {
        Integer[] originalArray = new Integer[10];
        Integer[] copyArray = new Integer[10];

        Arrays.fill(originalArray, 1);
        Arrays.fill(copyArray, 2);

        System.out.println("Copy");
        System.out.println(Arrays.toString(originalArray));
        System.out.println(Arrays.toString(copyArray));

        System.arraycopy(originalArray, 0, copyArray, 0, originalArray.length);

        System.out.println("After copy:");
        System.out.println(Arrays.toString(originalArray));
        System.out.println(Arrays.toString(copyArray));
    }

    private static void compare() {
        Integer[] a = {0, 1, 2};
        Integer[] b = {0, 1, 2};

        System.out.println("\nComparison");
        System.out.println("originalArray == copyArray:" + Arrays.equals(a, b));
    }

    public static void sort() {
        Integer[] unsortedArray = new Integer[10];

        for (int i = 0; i < 10; i++) {
            unsortedArray[i] = (unsortedArray.length - i);
        }

        System.out.println("Sorting: " + Arrays.toString(unsortedArray));

        Arrays.sort(unsortedArray); // Quicksort for primitives, Merge sort for objects

        System.out.println("Sorted: " + Arrays.toString(unsortedArray));
    }

    private static void doBinarySearch() {
        // Only for sorted arrays
        Integer[] sortedArray = {0, 1, 2};
        int position = Arrays.binarySearch(sortedArray, 8);

        System.out.println("Binary search");
        System.out.println("Position of 8 in sortedArray: " + position);
    }

    private static void compareArraysAndLists() {
        // Arrays are more efficient, but lists automatically allocates more space.
        Integer[] arrayOfIntegers = new Integer[10];
        List<Integer> listOfIntegers = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            arrayOfIntegers[i] = i;
        }

        for (int i = 0; i < 10; i++) {
            listOfIntegers.add(i);
        }

        System.out.println("Arrays vs Lists:");
        System.out.println("Array:");
        System.out.println(arrayOfIntegers[6]);
        System.out.println(Arrays.toString(arrayOfIntegers));
        System.out.println("List:");
        System.out.println(listOfIntegers.get(6));
        System.out.println(listOfIntegers);
    }

    private static void convertArrayListToArray() {
        String[] stringArray;
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("string1");
        arrayList.add("string2");

        // The toArray() method without passing any argument returns Object[].
        // So you have to pass an array as an argument, which will be filled with the data from the list, and returned.
        // Due to JVM optimizations using new String[0] is better than new String[lists.list.size()]
        stringArray = arrayList.toArray(new String[0]);

        System.out.println("Conversion: ArrayList<String> to String[]");
        System.out.println(arrayList);
        System.out.println(Arrays.toString(stringArray));
    }
}
