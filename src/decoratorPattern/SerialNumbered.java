/**
 * Java 
 * 
 * @author:  Rubén Hortas Astariz <http://rubenhortas.blogspot.com.es>
 * @contact: rubenhortas at gmail.com
 * @web:     http://www.rubenhortas.blogspot.com.es
 * @github:  http://github.com/rubenhortas
 * @license: CC BY-NC-SA 3.0 <http://creativecommons.org/licenses/by-nc-sa/3.0/>
 * @file:    SerialNumbered.java
 */

package decoratorPattern;

public class SerialNumbered extends Decorator {

	private static long counter = 1;

	private final long serialNumber = counter++;

	public SerialNumbered(Basic basic) {
		super(basic);
	}

	public long getSerialNumber() {
		return serialNumber;
	}
}
