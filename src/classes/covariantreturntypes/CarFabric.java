package classes.covariantreturntypes;

public class CarFabric extends VehicleFabric {
    public Car manufacture() {
        return new Car();
    }
}
