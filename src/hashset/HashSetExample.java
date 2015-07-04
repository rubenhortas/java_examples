/**
 * Java 
 * 
 * @author:  Rubén Hortas Astariz <http://rubenhortas.blogspot.com.es>
 * @contact: rubenhortas at gmail.com
 * @web:     http://www.rubenhortas.blogspot.com.es
 * @github:  http://github.com/rubenhortas
 * @license: CC BY-NC-SA 3.0 <http://creativecommons.org/licenses/by-nc-sa/3.0/>
 * @file:    HashSetExample.java
 */

package hashset;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class HashSetExample {

	/*
	 * A Set refuses to hold more than one instance of each object value.
	 */
	public static void main(String[] args) {

		Random random = new Random(50);
		
		Set<Integer> intSet = new HashSet<Integer>();
		
		for(int i=0; i <= 100; i++) {
			intSet.add(random.nextInt(15));	
		}
		
		System.out.println(intSet);
	}
}
