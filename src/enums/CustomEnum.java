package enums;

/**
 * Java Example of Enum
 * 
 * @author		Rubén Hortas Astariz <http://rubenhortas.blogspot.com.es>
 * @contact		rubenhortas at gmail.com
 * @web			http://www.rubenhortas.blogspot.com.es
 * @github:		http://github.com/rubenhortas
 * @license:	CC BY-NC-SA 3.0 <http://creativecommons.org/licenses/by-nc-sa/3.0/>
 */

/**
 * Example of enum with assigned values.
 *
 */
public enum CustomEnum {
	ONE(1),
	TWO(2),
	THREE(3);
	
	private int enumValue;
	
	private CustomEnum(int value) {
		this.enumValue = value;
	}
	
	public int getEnumValue() {
		return this.enumValue;
	}
}
