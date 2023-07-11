package Vehicles;

import ServiceStations.*;

public enum Vehicles {
    Bicycle {
        @Override
        public ServiceStation<Bicycle> create() {
            return new ServiceStationBicycle();
        }
    },
    Car {
        @Override
        public ServiceStation<Car> create() {
            return new ServiceStationCar();
        }
    },
    Truck {
        @Override
        public ServiceStation<Truck> create() {
            return new ServiceStationTruck();
        }
    };

    public abstract ServiceStation create();
}
