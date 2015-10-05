/**
 * Java 
 * 
 * @author:  Rubén Hortas Astariz <http://rubenhortas.blogspot.com.es>
 * @contact: rubenhortas at gmail.com
 * @web:     http://www.rubenhortas.blogspot.com.es
 * @github:  http://github.com/rubenhortas
 * @license: CC BY-NC-SA 3.0 <http://creativecommons.org/licenses/by-nc-sa/3.0/>
 * @file:    Subject.java
 */

package listenerPattern;

public class Subject {

	private Listener listener = null;
	
	public static void main(String[] args) {
		Subject subject = new Subject();
		subject.doNotification();
	}
	
	public Subject() {
		System.out.println("(Subject) I'm the subject");
	}
	
	private void doNotification() {
		this.listener = new Listener();
		
		System.out.println("(Subject) I'll notify my listener");
		listener.notify("Very important message!");
	}
}
