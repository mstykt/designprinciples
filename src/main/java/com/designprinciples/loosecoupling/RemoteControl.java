package com.designprinciples.loosecoupling;

/**
 * Created by mesut on 30.07.2016.
 */
public class RemoteControl {

    private IRemoteControl remoteControl;

    public  RemoteControl(IRemoteControl remoteControl) {
        this.remoteControl = remoteControl;
    }

    public void onAction() {
        remoteControl.on();
    }

    public void offAction() {
        remoteControl.off();
    }
}

/*
    Before Loose Coupling  Principle
    Our class was like below class
    and it was useless.
    If we would like to add some approach to program
    We had to change the class
 */

/*
public class RemoteControl {

    private Tv tv = new Tv();
    private Radio radio = new Radio();

    public void onActionTv() {
        tv.on();
    }

    public void offActionRadio() {
        tv.off();
    }

    public void onActionRadio() {
        radio.on();
    }

    public void offActionRadio() {
        radio.off();
    }
}*/