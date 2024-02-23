package com.driver;

public class Main {
    public static void main(String[] args) {
        F1 mercedes = new F1("mercedes", false);
        mercedes.move(40, 0);
        mercedes.accelerate(20);
        mercedes.accelerate(-60);

        Vehicle splendor = new Vehicle("splend");
        splendor.move(200, 360);
        splendor.steer(270);
        splendor.stop();

        Boat bota = new Boat("Mercedes", 10);
        System.out.println(bota.getVehicleName());
        System.out.println(bota.getVehicleCapacity());
    }
}