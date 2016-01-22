/**
 * Java 
 * 
 * @author:  Rubén Hortas Astariz <http://rubenhortas.blogspot.com.es>
 * @contact: rubenhortas at gmail.com
 * @web:     http://www.rubenhortas.blogspot.com.es
 * @github:  http://github.com/rubenhortas
 * @license: CC BY-NC-SA 3.0 <http://creativecommons.org/licenses/by-nc-sa/3.0/>
 * @file:    StaticImportEx.java
 */

package enums;

/** The static import brings all the enum instance identifiers into the local
 * namespace, so they don't need to be qualified.
 */
import static enums.CustomEnum.*;

public class StaticImportEx {
	
	public static void main(String[] args) {

	 System.out.println(ONE);
	 System.out.println(TWO);
	 System.out.println(THREE);
	}
}
