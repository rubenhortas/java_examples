/**
 * Java 
 * 
 * @author:  Rubén Hortas Astariz <http://rubenhortas.blogspot.com.es>
 * @contact: rubenhortas at gmail.com
 * @web:     http://www.rubenhortas.blogspot.com.es
 * @github:  http://github.com/rubenhortas
 * @license: CC BY-NC-SA 3.0 <http://creativecommons.org/licenses/by-nc-sa/3.0/>
 * @file:    CannonicalMapping.java
 */

package weakHashMap;

import java.util.WeakHashMap;

/**
 * WeakHashMap is a class designed to make the creation of canonicalized mappings easier.
 * In such a mapping, you are saving storage by creating only one instance of a particular value.
 * When the program needs that value, it looks up the existing object in the mapping and uses that.
 * 
 * This is a storage-saving technique.
 *
 */
public class CannonicalMapping {

	public static void main(String[] args) {
		int size = 1000;
		Key[] keys = new Key[size];
		WeakHashMap<Key, Value> map = new WeakHashMap<Key, Value>();
		
		for(int i=0; i < size; i++) {
			Key k = new Key(Integer.toString(i));
			Value v = new Value(Integer.toString(i));
			
			if((i % 3) == 0) {
				keys[i] = k; // Save as "real" references
			}
			map.put(k, v);
		}
		System.gc();
	}
}
