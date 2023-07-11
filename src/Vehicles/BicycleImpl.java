package Vehicles;

public class BicycleImpl extends VehicleImpl implements Vehicle, Bicycle {
    private final Vehicles VEHICLETYPE = Vehicles.Bicycle;

    @Override
    public Vehicles getVehicleType() {
        return VEHICLETYPE;
    }
    public BicycleImpl(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
}