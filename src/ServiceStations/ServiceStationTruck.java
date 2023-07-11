package ServiceStations;

import Vehicles.Truck;

public class ServiceStationTruck implements ServiceStation<Truck> {
    @Override
    public void check(Truck truck) {
        ServiceStationActions.checkTyres(truck);
        ServiceStationActions.checkEngine(truck);
        ServiceStationActions.checkTrailer(truck);
    }
}
