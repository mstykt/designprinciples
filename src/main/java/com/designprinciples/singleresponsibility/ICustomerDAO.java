package com.designprinciples.singleresponsibility;

/**
 * Created by mesut on 30.07.2016.
 */
public interface ICustomerDAO {
    Customer create();
    void delete(Customer customer);
    void update(Customer customer);
}
