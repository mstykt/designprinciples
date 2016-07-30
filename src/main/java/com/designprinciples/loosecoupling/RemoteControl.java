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
