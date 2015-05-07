/**
 * Java 
 * 
 * @author:  Rubén Hortas Astariz <http://rubenhortas.blogspot.com.es>
 * @contact: rubenhortas at gmail.com
 * @web:     http://www.rubenhortas.blogspot.com.es
 * @github:  http://github.com/rubenhortas
 * @license: CC BY-NC-SA 3.0 <http://creativecommons.org/licenses/by-nc-sa/3.0/>
 * @file:    Wind.java
 */

package upcasting;

/**
 * Example of upcasting.
 * 
 */
public class Wind extends Instrument {

	/*
	 * Tune accepts an instrument reference. Wind object is an Instrument
	 * object. Upcasting is always safe, but the class interface can lose
	 * methods.
	 */
	public static void main(String[] args) {
		Wind flute = new Wind();
		Instrument.tune(flute); // Upcasting
	}
}
