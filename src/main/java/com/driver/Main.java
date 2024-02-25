package com.driver;

public class Main {
    public static void main(String[] args) {
        F1 mercedes = new F1("mercedes", false);
        mercedes.move(40, 0);
        mercedes.accelerate(20);
        mercedes.accelerate(-60);

        Vehicle splendor = new Vehicle("splendor");
        splendor.move(200, 360);
        splendor.steer(270);
        splendor.stop();

        Boat cruiser = new Boat("Royale", 10);
        System.out.println(cruiser.getVehicleName());
        System.out.println(cruiser.getVehicleCapacity());
    }
}