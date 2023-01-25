package classes.covariantreturntypes;

// Requires java >= 5
// A covariant return type of a method is one that can be replaced by a "narrower" type when the method is overridden
// in a subclass.
public class CovariantReturnTypes {
    public static void main(String[] args) {
        VehicleFabric fabric;
        Vehicle vehicle;

        fabric = new VehicleFabric();
        vehicle = fabric.manufacture();
        System.out.println(vehicle);

        fabric = new CarFabric();
        vehicle = fabric.manufacture();
        System.out.println(vehicle);
    }
}
