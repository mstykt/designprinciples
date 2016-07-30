package com.designprinciples.liskovsubstitution;

/**
 * Created by mesut on 30.07.2016.
 */
public class Mercedes implements Car {
    @Override
    public void start() {
        System.out.println("mercedes started");
    }

    @Override
    public void stop() {
        System.out.println("mercedes stopped");
    }
}
