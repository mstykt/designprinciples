package com.designprinciples.singleresponsibility;

/**
 * Created by mesut on 30.07.2016.
 */
public class CustomerDAO implements ICustomerDAO {

    public Customer create() {
        return null;
    }

    public void delete(Customer customer) {
        System.out.println("delete method invoked");
    }

    public void update(Customer customer) {
        System.out.println("update method invoked");
    }
}
