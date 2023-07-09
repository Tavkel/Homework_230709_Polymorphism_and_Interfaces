package Vehicles;

public class Car extends Vehicle implements IVehicle, ICar {
    private final Vehicles VEHICLETYPE = Vehicles.Car;

    public Car(String modelName, int wheelsCount) {
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