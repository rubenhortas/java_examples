/**
 * Java 
 * 
 * @author:  Rubén Hortas Astariz <http://rubenhortas.blogspot.com.es>
 * @contact: rubenhortas at gmail.com
 * @web:     http://www.rubenhortas.blogspot.com.es
 * @github:  http://github.com/rubenhortas
 * @license: CC BY-NC-SA 3.0 <http://creativecommons.org/licenses/by-nc-sa/3.0/>
 * @file:    IteratorExample.java
 */

package foreach;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Foreach {

	public static void main(String[] args) {
		
		List<String> electronicDevices = new ArrayList<String>();
		
		electronicDevices.add("router");
		electronicDevices.add("raspberry pi");
		electronicDevices.add("tv");
		electronicDevices.add("hard disk");
		
		for(String device : electronicDevices) {
			System.out.println(device);
		}
		
		System.out.println();
		
		// Foreach also works with any Collection object
		Collection<String> collectionString = new LinkedList<String>();
		Collections.addAll(collectionString, "Follow the white rabbit".split(" "));
		
		for(String str: collectionString) {
			System.out.print("'" + str + "' ");
		}
	}
}
