/**
 * Java 
 * 
 * @author:  Rubén Hortas Astariz <http://rubenhortas.blogspot.com.es>
 * @contact: rubenhortas at gmail.com
 * @web:     http://www.rubenhortas.blogspot.com.es
 * @github:  http://github.com/rubenhortas
 * @license: CC BY-NC-SA 3.0 <http://creativecommons.org/licenses/by-nc-sa/3.0/>
 * @file:    ImplementationEx.java
 */

package enums;

public class ImplementationEx {

	/**
	 * An enum can implement one or more interfaces.
	 */

	private enum StupidEnum implements StupidInterface {
		RALPH, LISA, BART;

		@Override
		public void printStupidStuff() {
			System.out.println("I'm an unitard!!!");
		}
	}

	public static void main(String[] args) {
		StupidEnum stupidEnum = StupidEnum.RALPH;
		stupidEnum.printStupidStuff();
	}
}
