package ServiceStations;

import Vehicles.IBicycle;

public class ServiceStationBicycle implements IServiceStation<IBicycle> {
    @Override
    public void check(IBicycle bicycle) {
        ServiceStationActions.checkTyres(bicycle);
    }
}
