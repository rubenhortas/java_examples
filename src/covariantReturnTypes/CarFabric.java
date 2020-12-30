package covariantReturnTypes;

public class CarFabric extends VehicleFabric {
    Car manufacture() {
        return new Car();
    }
}
