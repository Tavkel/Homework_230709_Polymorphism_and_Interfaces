package Vehicles;

public class Bicycle extends Vehicle implements IVehicle, IBicycle {
    private final Vehicles VEHICLETYPE = Vehicles.Bicycle;

    @Override
    public Vehicles getVehicleType() {
        return VEHICLETYPE;
    }
    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
}