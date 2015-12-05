/**
 * Java 
 * 
 * @author:  Rubén Hortas Astariz <http://rubenhortas.blogspot.com.es>
 * @contact: rubenhortas at gmail.com
 * @web:     http://www.rubenhortas.blogspot.com.es
 * @github:  http://github.com/rubenhortas
 * @license: CC BY-NC-SA 3.0 <http://creativecommons.org/licenses/by-nc-sa/3.0/>
 * @file:    Example.java
 */

package factoryMethod;

public class Example {

	public static void main(String[] args) {
	    Creator creatorOne;
	    Creator creatorTwo;
	    
	    creatorOne = new ConcreteCreatorOne();
	    Product productOne = creatorOne.factoryMethod();
	    productOne.operation();
	    
	    creatorTwo = new ConcreteCreatorTwo();
	    Product productTwo = creatorTwo.factoryMethod();
	    productTwo.operation();
	}

}
