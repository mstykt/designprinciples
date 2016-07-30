package com.designprinciples.liskovsubstitution;

/**
 * Created by mesut on 30.07.2016.
 */
public class Ford implements Car {

    @Override
    public void start() {
        System.out.println("ford started.");
    }

    @Override
    public void stop() {
        System.out.println("ford stopped.");
    }
}
