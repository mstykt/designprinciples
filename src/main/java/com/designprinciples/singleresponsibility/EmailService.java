package com.designprinciples.singleresponsibility;

/**
 * Created by mesut on 30.07.2016.
 */
public class EmailService implements IEmailService {

    public void sendEmail(Customer customer) {
        System.out.println("sendEmail method invoked");
    }
}
