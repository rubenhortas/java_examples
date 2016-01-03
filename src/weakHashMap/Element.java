/**
 * Java 
 * 
 * @author:  Rubén Hortas Astariz <http://rubenhortas.blogspot.com.es>
 * @contact: rubenhortas at gmail.com
 * @web:     http://www.rubenhortas.blogspot.com.es
 * @github:  http://github.com/rubenhortas
 * @license: CC BY-NC-SA 3.0 <http://creativecommons.org/licenses/by-nc-sa/3.0/>
 * @file:    Element.java
 */

package weakHashMap;

public class Element {

	private String ident;
	public Element(String id) { ident = id; };
	public String toString() { return ident; };
	public int hashCode() {return ident.hashCode(); };
	public boolean equals(Object r) {
		return r instanceof Element &&
				ident.equals(((Element)r).ident);
	}
	
	protected void finalize() {
		System.out.println("Finalizing " + getClass().getSimpleName() + " " + ident);
	}
}
