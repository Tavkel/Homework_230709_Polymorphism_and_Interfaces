package ServiceStations;

import Vehicles.Vehicle;

public interface ServiceStation<T extends Vehicle> {
    void check(T vehicle);
}
