package com.designprinciples.interfacesegregation;

/**
 * Created by mesut on 30.07.2016.
 */
public class RMIConnector implements IRMIConnector {

    @Override
    public void sender(String s) {
        System.out.println("sender method invoked");
    }

    @Override
    public void reciver() {
        System.out.println("reciver method invoked");
    }
}

/*
    This is previous version of RMIConnector class
    in this version RMIConnector implements IConnector and IConnector has some methods which are RMIConnector does not need and use them
    for this reason IConnector has divided as two interface now RMIConnector implements IRMIConnector interface
    this technique is interface segregation principle
 */
/*
public class RMIConnector implements IConnector {
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