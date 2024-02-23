package com.driver;

public class Boat implements WaterVehicle{

    private String boatName;

    private int boatCapacity;

    public Boat(String boatName, int boatCapacity) {
        this.boatName = boatName;
        this.boatCapacity = boatCapacity;
    }

    public String getVehicleName() {
        return boatName;
    }

    public int getVehicleCapacity() {
        return boatCapacity;
    }
}
