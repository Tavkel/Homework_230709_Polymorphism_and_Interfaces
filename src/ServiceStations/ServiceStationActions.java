package ServiceStations;

import Vehicles.ICar;
import Vehicles.ITruck;
import Vehicles.IVehicle;

public class ServiceStationActions {
    public static void checkTyres(IVehicle vehicle) {
        System.out.println("Обслуживаем " + vehicle.getModelName());
        for (int i = 0; i < vehicle.getWheelsCount(); i++) {
            vehicle.updateTyre();
        }
    }

    public static void checkEngine(ICar vehicle) {
        vehicle.checkEngine();
    }

    public static void checkTrailer(ITruck vehicle) {
        vehicle.checkTrailer();
    }
}
