package com.designprinciples.openclosed;

/**
 * Created by mesut on 30.07.2016.
 */
public class RemoteControl {

    private IRemoteControl remoteControl;

    public RemoteControl(IRemoteControl remoteControl) {
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
    As below class can be seen the approach is useless
    and open to changing.
    But above class is Open Closed Principle compatible
    Open for develop close for changing
    It is OCP !
 */
/*
public class RemoteControl {
    public void onAction(Object obj) {
        if (obj instanceof Tv) {
            ((Tv)obj).on();
        } else if (obj instanceof Radio) {
            ((Radio)obj).on();
        }
    }

    public void offction(Object obj) {
        if (obj instanceof Tv) {
            ((Tv)obj).off();
        } else if (obj instanceof Radio) {
            ((Radio)obj).off();
        }
    }
}
 */