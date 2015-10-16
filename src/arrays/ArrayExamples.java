/**
 * Java 
 * 
 * @author:  Rubén Hortas Astariz <http://rubenhortas.blogspot.com.es>
 * @contact: rubenhortas at gmail.com
 * @web:     http://www.rubenhortas.blogspot.com.es
 * @github:  http://github.com/rubenhortas
 * @license: CC BY-NC-SA 3.0 <http://creativecommons.org/licenses/by-nc-sa/3.0/>
 * @file:    ArrayExamples.java
 */

package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayExamples {

	public static void main(String[] args) {

		/** Arrays vs Lists **/
		// Arrays are more efficient, but lists automatically allocates more
		// space.
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

		/** Initialization **/
		System.out.println("Initialization");
		Integer[] a; // Local unitialized variable
		
		Integer[] b = new Integer[5]; // Initialized to point to an array
		// The references inside the array are automatically initialized to null
		System.out.println(Arrays.toString(b));
		
		//Aggregate initialization
		Integer[] d = { 0, 1, 2 };
		System.out.println(Arrays.toString(d));
		
		//Dynamic aggregate initialization
		a = new Integer[] { 3, 4, 5};
		System.out.println(Arrays.toString(a));
		
		d = a; //Now d and a are pointing to the same array
		System.out.println(Arrays.toString(d));
		
		/** Fill **/
		System.out.println("Fill");
		int[] arrayToFill = new int[20];
		Arrays.fill(arrayToFill, 1);
		System.out.println(Arrays.toString(arrayToFill));
	}
}
