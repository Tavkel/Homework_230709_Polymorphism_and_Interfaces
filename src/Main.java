import ServiceStations.IServiceStation;
import Vehicles.*;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("car1", 4);
        Car car2 = new Car("car2", 4);

        Truck truck = new Truck("truck1", 6);
        Truck truck2 = new Truck("truck2", 8);

        Bicycle bicycle = new Bicycle("bicycle1", 2);
        Bicycle bicycle2 = new Bicycle("bicycle2", 2);

        checkVehicle(bicycle);
        checkVehicle(bicycle2);

        checkVehicle(car);
        checkVehicle(car2);

        checkVehicle(truck);
        checkVehicle(truck2);
    }

    public static void checkVehicle(IVehicle vehicle) {
        IServiceStation serviceStation = vehicle.getVehicleType().create();
        serviceStation.check(vehicle);
    }
}

