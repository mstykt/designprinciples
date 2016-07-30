package com.designprinciples.interfacesegregation;

/**
 * Created by mesut on 30.07.2016.
 */
public interface IJMSConnector {
    void commit();
    void rollback();
}
