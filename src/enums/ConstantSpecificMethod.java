/**
 * Java 
 * 
 * @author:  Rubén Hortas Astariz <http://rubenhortas.blogspot.com.es>
 * @contact: rubenhortas at gmail.com
 * @web:     http://www.rubenhortas.blogspot.com.es
 * @github:  http://github.com/rubenhortas
 * @license: CC BY-NC-SA 3.0 <http://creativecommons.org/licenses/by-nc-sa/3.0/>
 * @file:    ConstantSpecificMethods.java
 */

package enums;

import java.text.DateFormat;
import java.util.Date;

public enum ConstantSpecificMethod {

	/**
	 * Java enums have a very interesting feature that allows you to give 
	 * each enum instance different behavior by creating methods for each one.
	 * To do this, you define one ore more abstract methods as part of the enum,
	 * then define the methods for each enum instance.
	 * 
	 *  Example extracted from the Bruce Eckel's book Thinking in java.
	 */
	
	DATE_TIME {
		String getInfo() {
			return DateFormat.getDateInstance().format(new Date());
		}
	},
	
	CLASSPATH {
		String getInfo() {
			return System.getenv("CLASSPATH");
		}
	},
	
	VERSION {
		String getInfo() {
			return System.getProperty("java.version");
		}
	};
	
	abstract String getInfo();
	
	public static void main(String[] args) {
		for(ConstantSpecificMethod csm: values()) {
			System.out.println(csm.getInfo());
		}
	}
}
