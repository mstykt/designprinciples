package com.designprinciples.dependencyinversion;

/**
 * Created by mesut on 30.07.2016.
 */
public class AppDI {

    public static void main(String[] args) {
        Client client = new Client();
        Car merdeces = new Mercedes();
        Car ford = new Ford();

        client.startCar(merdeces);
        client.stopCar(merdeces);

        client.startCar(ford);
        client.stopCar(ford);
    }
}
