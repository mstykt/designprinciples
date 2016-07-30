package com.designprinciples.openclosed;

/**
 * Created by mesut on 30.07.2016.
 */
public class Tv implements IRemoteControl {

    public void on() {
        System.out.println("tv turned on.");
    }

    public void off() {
        System.out.println("tv turned off.");
    }
}
