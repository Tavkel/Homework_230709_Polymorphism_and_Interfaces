package Vehicles;

public class TruckImpl extends CarImpl implements Vehicle, Car, Truck {
    private final Vehicles VEHICLETYPE = Vehicles.Truck;

    @Override
    public Vehicles getVehicleType() {
        return this.VEHICLETYPE;
    }

    public TruckImpl(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}