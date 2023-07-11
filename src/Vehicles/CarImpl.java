package Vehicles;

public class CarImpl extends VehicleImpl implements Vehicle, Car {
    private final Vehicles VEHICLETYPE = Vehicles.Car;

    public CarImpl(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    @Override
    public Vehicles getVehicleType() {
        return this.VEHICLETYPE;
    }
}