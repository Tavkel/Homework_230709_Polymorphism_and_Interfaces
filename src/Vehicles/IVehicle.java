package Vehicles;

public interface IVehicle {
    String getModelName();

    int getWheelsCount();

    Vehicles getVehicleType();

    void updateTyre();
}
