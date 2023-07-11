package ServiceStations;

import Vehicles.Bicycle;

public class ServiceStationBicycle implements ServiceStation<Bicycle> {
    @Override
    public void check(Bicycle bicycle) {
        ServiceStationActions.checkTyres(bicycle);
    }
}
