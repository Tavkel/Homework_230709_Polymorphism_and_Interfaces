package ServiceStations;

import Vehicles.ITruck;

public class ServiceStationTruck implements IServiceStation<ITruck> {
    @Override
    public void check(ITruck truck) {
        ServiceStationActions.checkTyres(truck);
        ServiceStationActions.checkEngine(truck);
        ServiceStationActions.checkTrailer(truck);
    }
}
