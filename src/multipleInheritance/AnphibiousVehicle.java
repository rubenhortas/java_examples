/**
 * Java 
 * 
 * @author:  Rubén Hortas Astariz <http://rubenhortas.blogspot.com.es>
 * @contact: rubenhortas at gmail.com
 * @web:     http://www.rubenhortas.blogspot.com.es
 * @github:  http://github.com/rubenhortas
 * @license: CC BY-NC-SA 3.0 <http://creativecommons.org/licenses/by-nc-sa/3.0/>
 * @file:    AnphibiousVehicle.java
 */

package multipleInheritance;

/**
 * In Java you can do Multiple Inheritance implementing interfaces. If you do
 * inherit from a non-interface, you can inherit from only one.
 * 
 * You can have as many interfaces as you want. You can upcast to each
 * interface.
 * 
 */

public class AnphibiousVehicle implements ICar, IShip {

    @Override
    public void canFloat() {
	System.out.println("I can float");
    }

    @Override
    public void canRun() {
	System.out.println("I can run");
    }

}
