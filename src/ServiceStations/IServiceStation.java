package ServiceStations;

import Vehicles.IVehicle;

public interface IServiceStation<T extends IVehicle> {
    void check(T vehicle);
}
