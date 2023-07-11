public class Main {
    public static void main(String[] args) {
        Car car = new Car("car1", 4);
        Car car2 = new Car("car2", 4);

        Truck truck = new Truck("truck1", 6);
        Truck truck2 = new Truck("truck2", 8);

        Bicycle bicycle = new Bicycle("bicycle1", 2);
        Bicycle bicycle2 = new Bicycle("bicycle2", 2);

        ServiceStation serviceStation = new ServiceStationImpl();

        checkVehicle(serviceStation, bicycle);
        checkVehicle(serviceStation, bicycle2);

        checkVehicle(serviceStation, car);
        checkVehicle(serviceStation, car2);

        checkVehicle(serviceStation, truck);
        checkVehicle(serviceStation, truck2);
    }

    public static void checkVehicle(ServiceStation serviceStation, Vehicle vehicle) {
        serviceStation.check(vehicle);
    }
}

