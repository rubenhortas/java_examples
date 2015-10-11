/**
 * Java 
 * 
 * @author:  Rubén Hortas Astariz <http://rubenhortas.blogspot.com.es>
 * @contact: rubenhortas at gmail.com
 * @web:     http://www.rubenhortas.blogspot.com.es
 * @github:  http://github.com/rubenhortas
 * @license: CC BY-NC-SA 3.0 <http://creativecommons.org/licenses/by-nc-sa/3.0/>
 * @file:    Decorator.java
 */

package decoratorPattern;

public class Decorator extends Basic {
	protected Basic basic;

	public Decorator(Basic basic) {
		this.basic = basic;
	}

	public void set(String val) {
		basic.set(val);
	}

	public String get() {
		return basic.get();
	}
}
