package com.designprinciples.singleresponsibility;

import java.util.Date;

/**
 * Created by mesut on 30.07.2016.
 */
public class Customer {

    private String name;
    private String surname;
    private Date birthday;

    public Customer() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}


/*
    Previous situation is like below and its not compatible for Single Responsibility Principle
 */
/*
public class Customer {

    private String name;
    private String surname;
    private Date birthday;

    public void create() {
        System.out.println("creat method invoked");
    }

    public void delete() {
        System.out.println("delete method invoked");
    }

    public void sendEmail() {
        System.out.println("sendEmail method invoked");
    }

    public void createOrder(Object order) {
        System.out.println("createOrder method invoked");
    }
}
*/