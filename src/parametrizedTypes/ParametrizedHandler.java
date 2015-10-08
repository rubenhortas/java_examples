/**
 * Java 
 * 
 * @author:  Rubén Hortas Astariz <http://rubenhortas.blogspot.com.es>
 * @contact: rubenhortas at gmail.com
 * @web:     http://www.rubenhortas.blogspot.com.es
 * @github:  http://github.com/rubenhortas
 * @license: CC BY-NC-SA 3.0 <http://creativecommons.org/licenses/by-nc-sa/3.0/>
 * @file:    ParametrizedHandler.java
 */

package parametrizedTypes;

public class ParametrizedHandler<T> {
	
	private T t;

	public ParametrizedHandler(T t) {
		this.t = t;
	}
	
	public T get() {
		System.out.println(this.t.getClass().getName());
		return this.t;
	}
}
