package com.designprinciples.openclosed;

/**
 * Created by mesut on 30.07.2016.
 */
public class AppOCP {

    public static void main(String[] args) {
        //Useless Approach
        /*Tv tv = new Tv();
        RemoteControl control = new RemoteControl();
        control.onAction(tv);
        control.offction(tv);*/

        //OCP && Loose Coupling
        IRemoteControl irc = new Tv();
        RemoteControl remoteControl = new RemoteControl(irc);
        remoteControl.onAction();
        remoteControl.onAction();
    }
}
