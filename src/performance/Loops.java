/**
 * Java 
 * 
 * @author:  Rubén Hortas Astariz <http://rubenhortas.blogspot.com.es>
 * @contact: rubenhortas at gmail.com
 * @web:     http://www.rubenhortas.blogspot.com.es
 * @github:  http://github.com/rubenhortas
 * @license: CC BY-NC-SA 3.0 <http://creativecommons.org/licenses/by-nc-sa/3.0/>
 * @file:    Loops.java
 */

package performance;

public class Loops {
	
	static int iterations = 100000000;

	public static void main(String[] args) {

		long t1 = System.nanoTime();
		for(int i = 0; i< iterations; i++) {
			@SuppressWarnings("unused")
			String s1 = "aaaaaaa";
		}
		long t2 = System.nanoTime();
		
		long total1 = (t2 - t1);
		
		
		// ------------------------------ //
		
		long t3 = System.nanoTime();
		@SuppressWarnings("unused")
		String s2;
		for(int i = 0; i< iterations; i++) {
			s2 = "aaaaaaa";
		}
		long t4 = System.nanoTime();
		
		long total2 = (t4-t3);
		
		// ------------------------------ //
		System.out.println("Iterations: " + iterations);
		System.out.println("Time method 1: " + total1);
		System.out.println("Time method 2: " + total2);
		
	}
}
