package ServiceStations;

import Vehicles.ICar;

public class ServiceStationCar implements IServiceStation<ICar> {
    @Override
    public void check(ICar car) {
        ServiceStationActions.checkTyres(car);
        ServiceStationActions.checkEngine(car);
    }
}
