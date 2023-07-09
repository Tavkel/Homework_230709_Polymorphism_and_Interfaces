package Vehicles;

public class Truck extends Car implements IVehicle, ICar, ITruck {
    private final Vehicles VEHICLETYPE = Vehicles.Truck;

    @Override
    public Vehicles getVehicleType() {
        return this.VEHICLETYPE;
    }

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}