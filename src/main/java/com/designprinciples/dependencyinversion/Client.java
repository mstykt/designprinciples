package com.designprinciples.dependencyinversion;


/**
 * Created by mesut on 30.07.2016.
 */
public class Client {

    public void startCar(Car car) {
        car.start();
    }

    public void stopCar(Car car) {
        car.stop();
    }
}

/*
    Previous version of class like below
    In this version of Client, Client depends on Mercedes and Ford
    all changes of Mercedes and Ford effect Client class
    Client has to depend on just an Interface and it should be Car.
 */
/*
public class Client1 {

    public void start(Car car) {
        if(car instanceof Mercedes) {
            ((Mercedes)car).start();
        } else if (car instanceof Ford) {
            ((Ford)car).start();
        }
    }

    public void stopCar(Car car) {
        if (car instanceof Mercedes) {
            ((Mercedes)car).stop();
        } else if (car instanceof Ford) {
            ((Ford)car).stop();
        }
    }
}*/

