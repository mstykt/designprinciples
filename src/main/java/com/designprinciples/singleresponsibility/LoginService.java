package com.designprinciples.singleresponsibility;

/**
 * Created by mesut on 30.07.2016.
 */
public class LoginService implements ILoginService {

    public void login(Customer customer) {
        System.out.println("login method invoked");
    }
}
