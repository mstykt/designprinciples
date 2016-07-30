package com.designprinciples.liskovsubstitution;

/**
 * Created by mesut on 30.07.2016.
 */
public class Client {

    public void startCar(Car car) {
        car.start();
    }

    public void stopCar(Car car) {
        car.stop();
    }
}
