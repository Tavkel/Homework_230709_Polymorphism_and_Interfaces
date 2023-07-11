package ServiceStations;

import Vehicles.Car;

public class ServiceStationCar implements ServiceStation<Car> {
    @Override
    public void check(Car car) {
        ServiceStationActions.checkTyres(car);
        ServiceStationActions.checkEngine(car);
    }
}
