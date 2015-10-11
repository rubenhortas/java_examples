/**
 * Java 
 * 
 * @author:  Rubén Hortas Astariz <http://rubenhortas.blogspot.com.es>
 * @contact: rubenhortas at gmail.com
 * @web:     http://www.rubenhortas.blogspot.com.es
 * @github:  http://github.com/rubenhortas
 * @license: CC BY-NC-SA 3.0 <http://creativecommons.org/licenses/by-nc-sa/3.0/>
 * @file:    TimeStamped.java
 */

package decoratorPattern;

import java.util.Date;

public class TimeStamped extends Decorator {
	private final long timeStamp;

	public TimeStamped(Basic basic) {
		super(basic);
		timeStamp = new Date().getTime();
	}
	public long getStamp() {
		return timeStamp;
	}
}
