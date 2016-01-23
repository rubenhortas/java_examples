/**
 * Java 
 * 
 * @author:  Rubén Hortas Astariz <http://rubenhortas.blogspot.com.es>
 * @contact: rubenhortas at gmail.com
 * @web:     http://www.rubenhortas.blogspot.com.es
 * @github:  http://github.com/rubenhortas
 * @license: CC BY-NC-SA 3.0 <http://creativecommons.org/licenses/by-nc-sa/3.0/>
 * @file:    EnumSetEx.java
 */

package enums;

import java.util.EnumSet;

/* Use EnumSet instead of flags */
public class EnumSetEx {
	public static void main(String[] args) {
		// Empty set
		EnumSet<Food> cupboard = EnumSet.noneOf(Food.class);
		cupboard.add(Food.CANDIES);
		cupboard.add(Food.POPCORN);
		cupboard.add(Food.CHIPS);
		System.out.println(cupboard);
		
		// Removing all
		cupboard.removeAll(EnumSet.range(Food.CHIPS, Food.CANDIES));
		System.out.println(cupboard);
		
		// Adding all
		cupboard = EnumSet.allOf(Food.class);
		System.out.println(cupboard);
	}
}
