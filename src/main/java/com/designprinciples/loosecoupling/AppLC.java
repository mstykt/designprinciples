package com.designprinciples.loosecoupling;

/**
 * Created by mesut on 30.07.2016.
 */
public class AppLC {

    public static void main(String[] args) {
        //Control for TV
        IRemoteControl irc = new Tv();
        RemoteControl remoteControl = new RemoteControl(irc);
        remoteControl.onAction();
        remoteControl.offAction();

        //Control for Radio
        IRemoteControl irc1 = new Radio();
        RemoteControl remoteControl1 = new RemoteControl(irc1);
        remoteControl1.onAction();
        remoteControl1.offAction();
    }
}
