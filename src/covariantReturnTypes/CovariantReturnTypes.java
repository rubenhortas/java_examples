/**
 * Java 
 * 
 * @author:  Rubén Hortas Astariz <http://rubenhortas.blogspot.com.es>
 * @contact: rubenhortas at gmail.com
 * @web:     http://www.rubenhortas.blogspot.com.es
 * @github:  http://github.com/rubenhortas
 * @license: CC BY-NC-SA 3.0 <http://creativecommons.org/licenses/by-nc-sa/3.0/>
 * @file:    CovariantReturnTypes.java
 */

/**
 * An overriden method in a derived class can return a type derived
 * from the type returned by the base class method.
 */
package covariantReturnTypes;

public class CovariantReturnTypes {

    public static void main(String[] args) {

	VehicleFabric fabric = new VehicleFabric();
	Vehicle vehicle = new Vehicle();
	System.out.println(vehicle);

	fabric = new CarFabric();
	vehicle = fabric.manufacture();
	System.out.println(vehicle);
    }
}
