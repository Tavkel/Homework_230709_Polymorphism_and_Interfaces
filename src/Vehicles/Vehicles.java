package Vehicles;

import ServiceStations.*;

public enum Vehicles {
    Bicycle {
        @Override
        public IServiceStation<IBicycle> create() {
            return new ServiceStationBicycle();
        }
    },
    Car {
        @Override
        public IServiceStation<ICar> create() {
            return new ServiceStationCar();
        }
    },
    Truck {
        @Override
        public IServiceStation<ITruck> create() {
            return new ServiceStationTruck();
        }
    };

    public abstract IServiceStation create();
}
