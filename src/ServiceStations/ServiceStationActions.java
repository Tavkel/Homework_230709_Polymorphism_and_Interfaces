package ServiceStations;

import Vehicles.Car;
import Vehicles.Truck;
import Vehicles.Vehicle;

public class ServiceStationActions {
    public static void checkTyres(Vehicle vehicle) {
        System.out.println("Обслуживаем " + vehicle.getModelName());
        for (int i = 0; i < vehicle.getWheelsCount(); i++) {
            vehicle.updateTyre();
        }
    }

    public static void checkEngine(Car vehicle) {
        vehicle.checkEngine();
    }

    public static void checkTrailer(Truck vehicle) {
        vehicle.checkTrailer();
    }
}
