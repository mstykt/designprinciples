package com.designprinciples.loosecoupling;

/**
 * Created by mesut on 30.07.2016.
 */
public class Radio implements IRemoteControl {

    public void on() {
        System.out.println("radio turned on");
    }

    public void off() {
        System.out.println("radio turned off");
    }
}
