package com.designprinciples.liskovsubstitution;

/**
 * Created by mesut on 30.07.2016.
 */
public class AppLS {
    public static void main(String[] args) {
        Client client = new Client();
        Car car = new Ford();
        client.startCar(car);
        client.stopCar(car);

        Car car1 = new Mercedes();
        client.startCar(car1);
        client.stopCar(car1);
    }
}
