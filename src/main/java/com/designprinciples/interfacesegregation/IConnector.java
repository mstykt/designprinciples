package com.designprinciples.interfacesegregation;

/**
 * Created by mesut on 30.07.2016.
 *
 * This interface does not compatible for Single Responsibility Principle for this reason
 * This interface has divided as IJMSConnector and IRMIConnector
 * So two new interfaces are compatible for Interface Segregation Principle
 */
public interface IConnector {
    void commit();
    void rollback();
    void sender(String s);
    void reciver();
}
