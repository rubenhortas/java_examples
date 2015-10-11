/**
 * Java 
 * 
 * @author:  Rubén Hortas Astariz <http://rubenhortas.blogspot.com.es>
 * @contact: rubenhortas at gmail.com
 * @web:     http://www.rubenhortas.blogspot.com.es
 * @github:  http://github.com/rubenhortas
 * @license: CC BY-NC-SA 3.0 <http://creativecommons.org/licenses/by-nc-sa/3.0/>
 * @file:    Decoration.java
 */

package decoratorPattern;

public class Decoration {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		TimeStamped t = new TimeStamped(new Basic());
		TimeStamped t2 = new TimeStamped(new SerialNumbered(new Basic()));
		// t2.getSerialNumber(); // Not available
	
		SerialNumbered s = new SerialNumbered(new Basic());
		SerialNumbered s2 = new SerialNumbered(new TimeStamped(new Basic()));
		// s2.getStamp(); // Not available
	}
}
