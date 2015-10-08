/**
 * Java 
 * 
 * @author:  Rubén Hortas Astariz <http://rubenhortas.blogspot.com.es>
 * @contact: rubenhortas at gmail.com
 * @web:     http://www.rubenhortas.blogspot.com.es
 * @github:  http://github.com/rubenhortas
 * @license: CC BY-NC-SA 3.0 <http://creativecommons.org/licenses/by-nc-sa/3.0/>
 * @file:    Main.java
 */

package parametrizedTypes;

public class Main {

	public static void main(String[] args) {
		System.out.println("MyCustomClass");
		ParametrizedHandler<MyCustomClass> ph = new ParametrizedHandler<MyCustomClass>(new MyCustomClass());
		ph.get();
		
		System.out.println("String");
		ParametrizedHandler<String> ph2 = new ParametrizedHandler<String>(new String());
		ph2.get();
	}
}
