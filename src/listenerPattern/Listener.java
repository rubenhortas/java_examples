/**
 * Java 
 * 
 * @author:  Rubén Hortas Astariz <http://rubenhortas.blogspot.com.es>
 * @contact: rubenhortas at gmail.com
 * @web:     http://www.rubenhortas.blogspot.com.es
 * @github:  http://github.com/rubenhortas
 * @license: CC BY-NC-SA 3.0 <http://creativecommons.org/licenses/by-nc-sa/3.0/>
 * @file:    Listener.java
 */

package listenerPattern;

public class Listener implements IListener {

	String notifiedMessage = null;
	
	public Listener() {
		System.out.println("(Listener) I'm the listener");
	}

	@Override
	public void notify(String msg) {
		System.out.println("(Listener) I've a new notification: " + msg);
	}
}
