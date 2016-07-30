package com.designprinciples.interfacesegregation;

/**
 * Created by mesut on 30.07.2016.
 */
public class JMSConnector implements IJMSConnector {

    @Override
    public void commit() {
        System.out.println("commit method invoked");
    }

    @Override
    public void rollback() {
        System.out.println("rollback method invoked");
    }
}


/*
    This is the Previous version of JMSConnector
     in this version the class implements IConnector and IConnector has some methods
     which are JMSConnector doesn't need and doesn't use them
     For this reason IConnector has divided as two interface and JMSConnector use IJMSConnector interface anymore
 */
/*
public class JMSConnector implements IConnector {
    @Override
    public void commit() {

    }

    @Override
    public void rollback() {

    }

    @Override
    public void sender(String s) {

    }

    @Override
    public void reciver() {

    }
}
*/