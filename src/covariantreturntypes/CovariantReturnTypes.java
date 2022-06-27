package covariantreturntypes;

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
