/**
 * Java 
 * 
 * @author:  Rubén Hortas Astariz <http://rubenhortas.blogspot.com.es>
 * @contact: rubenhortas at gmail.com
 * @web:     http://www.rubenhortas.blogspot.com.es
 * @github:  http://github.com/rubenhortas
 * @license: CC BY-NC-SA 3.0 <http://creativecommons.org/licenses/by-nc-sa/3.0/>
 * @file:    FinalArguments.java
 */

/**
 * Example of using final arguments.
 * Inside the method you can't change what the argument reference points to.
 * You can read the argument, but you can't change it.
 * This feature is primarly used to pass data to anonymous inner classes.
 */

package finalArguments;

public class FinalArguments {

    void withFinalArguments(final MyClass mc) {

	/**
	 * The final local variable mc cannot be assigned. It must be blank and
	 * not using a compound assignment.
	 */
	// mc = new MyClass(); // illegal, mc is final
    }

    void withoutFinalArguments(MyClass mc) {
	mc = new MyClass(); // mc not final
	mc.doSomething();
    }

    public static void main(String args[]) {
	FinalArguments fa = new FinalArguments();
	fa.withoutFinalArguments(null);
	fa.withFinalArguments(null);
    }
}
