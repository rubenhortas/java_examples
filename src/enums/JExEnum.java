package enums;

/**
 * Java 
 * 
 * @author:  Rubén Hortas Astariz <http://rubenhortas.blogspot.com.es>
 * @contact: rubenhortas at gmail.com
 * @web: 	 http://www.rubenhortas.blogspot.com.es
 * @github:  http://github.com/rubenhortas
 * @license: CC BY-NC-SA 3.0 <http://creativecommons.org/licenses/by-nc-sa/3.0/>
 * @file: 	 JExEnum.java
 */

public class JExEnum {

	public static void main(String[] args) {

		// Example of using a default enum
		defaultEnumEx();
		
		// Example of switch usage with default enums
		defaultEnumSwitch();

		// Example of using a custom enum (with assigned values)
		customEnumEx();
	}

	/**
	 * Example of value assignment and comparison of an enum
	 */
	private static void defaultEnumEx() {
		
		// Asign a value to the local variable myEnumValue
		DefaultEnum myEnumValue = DefaultEnum.ONE;

		// Example of comparison
		if (myEnumValue.equals(DefaultEnum.ONE)) {
			System.out.println("Ok, myEnumValue is equal to DefaultEnum.ONE");
		}
	}
	
	/**
	 * Example of switch usage with default enums.
	 */
	private static void defaultEnumSwitch() {
		// Asign a value to the local variable myEnumValue
		DefaultEnum myEnumValue = DefaultEnum.ONE;
		
		switch(myEnumValue) {
		case ONE:
			System.out.println("Ok, switch done. Case DefaultEnum.ONE");
			break;
		default:
			System.out.println("Nevermind...");
			break;
		}
	}
	
	/**
	 * Example of value comparison of a custom enum (with assigned values)
	 */
	private static void customEnumEx() {
		int myValue = 2;
		
		if(myValue == CustomEnum.TWO.getEnumValue()) {
			System.out.println("Ok, myValue is equal to CustomEnum.TWO value");
		}
	}
}
