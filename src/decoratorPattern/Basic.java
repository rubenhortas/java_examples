/**
 * Java 
 * 
 * @author:  Rubén Hortas Astariz <http://rubenhortas.blogspot.com.es>
 * @contact: rubenhortas at gmail.com
 * @web:     http://www.rubenhortas.blogspot.com.es
 * @github:  http://github.com/rubenhortas
 * @license: CC BY-NC-SA 3.0 <http://creativecommons.org/licenses/by-nc-sa/3.0/>
 * @file:    Basic.java
 */

/**
 * 
 */
package decoratorPattern;

public class Basic {
	private String value;
	
	public void set(String val) {
		value = val;
	}
	
	public String get() {
		return value;
	}
}
