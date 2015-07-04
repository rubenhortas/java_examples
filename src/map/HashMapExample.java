/**
 * Java 
 * 
 * @author:  Rubén Hortas Astariz <http://rubenhortas.blogspot.com.es>
 * @contact: rubenhortas at gmail.com
 * @web:     http://www.rubenhortas.blogspot.com.es
 * @github:  http://github.com/rubenhortas
 * @license: CC BY-NC-SA 3.0 <http://creativecommons.org/licenses/by-nc-sa/3.0/>
 * @file:    HashMapExample.java
 */

package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class HashMapExample {

	public static void main(String[] args) {

		Random random = new Random(25);
		
		Map<Integer, Integer> intMap = new HashMap<Integer, Integer>();
		
		for(int i=0; i<100; i++) {
			int randomInt = random.nextInt(20);
			
			Integer frequency = intMap.get(randomInt);
			
			if(frequency == null) {
				intMap.put(randomInt, 1);
			} else {
				intMap.put(randomInt, frequency + 1);
			}			
		}
		
		System.out.println(intMap);
	}
}
