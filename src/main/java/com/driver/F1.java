package com.driver;

public class F1 extends Car {

    public F1(String name, boolean isManual) {
        super(name, 4, 0, 6, isManual, "F1", 1);
        //Use arbitrary values for parameters which are not mentioned
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int getCurrentDirection() {
        return super.getCurrentDirection();
    }

    @Override
    public int getCurrentSpeed() {
        return super.getCurrentSpeed();
    }

    @Override
    public int getCurrentGear() {
        return super.getCurrentGear();
    }

    @Override
    public int getDoors() {
        return super.getDoors();
    }

    @Override
    public int getGears() {
        return super.getGears();
    }

    @Override
    public int getSeats() {
        return super.getSeats();
    }

    @Override
    public int getWheels() {
        return super.getWheels();
    }

    @Override
    public String getType() {
        return super.getType();
    }

    @Override
    public boolean isManual() {
        return super.isManual();
    }

    public void accelerate(int rate){
        int newSpeed = 0; //set the value of new speed by using currentSpeed and rate
        /*
         * speed 0: gear 1
         * speed 1-50: gear 1
         * speed 51-100: gear 2
         * speed 101-150: gear 3
         * speed 151-200: gear 4
         * speed 201-250: gear 5
         * speed more than 250: gear 6
         */

        if(newSpeed == 0) {
            //Stop the car, set gear as 1
            changeGear(1);
        }
        //for all other cases, change the gear accordingly

        if(newSpeed > 0) {
            changeGear((newSpeed>=1 && newSpeed<=50) ? 1 : ((newSpeed>=51 && newSpeed<=100) ? 2 : (newSpeed>=101 && newSpeed<=150) ? 3 : (newSpeed>=151 && newSpeed<=200) ? 4 : (newSpeed>=201 && newSpeed<=250) ? 5 : 6));
        }
    }
}
