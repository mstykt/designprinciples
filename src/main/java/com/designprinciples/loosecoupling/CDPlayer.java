package com.designprinciples.loosecoupling;

/**
 * Created by mesut on 30.07.2016.
 */
public class CDPlayer implements IRemoteControl {

    public void on() {
        System.out.println("cd player turned on");
    }

    public void off() {
        System.out.println("cd player turned off");
    }
}
