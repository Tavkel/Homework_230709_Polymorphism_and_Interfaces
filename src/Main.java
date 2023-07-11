import ServiceStations.ServiceStation;
import Vehicles.*;

public class Main {
    public static void main(String[] args) {
        CarImpl car = new CarImpl("car1", 4);
        CarImpl car2 = new CarImpl("car2", 4);

        TruckImpl truck = new TruckImpl("truck1", 6);
        TruckImpl truck2 = new TruckImpl("truck2", 8);

        BicycleImpl bicycle = new BicycleImpl("bicycle1", 2);
        BicycleImpl bicycle2 = new BicycleImpl("bicycle2", 2);

        checkVehicle(bicycle);
        checkVehicle(bicycle2);

        checkVehicle(car);
        checkVehicle(car2);

        checkVehicle(truck);
        checkVehicle(truck2);
    }

    public static void checkVehicle(Vehicle vehicle) {
        ServiceStation serviceStation = vehicle.getVehicleType().create();
        serviceStation.check(vehicle);
    }
}

