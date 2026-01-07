package com.interfaces;

public class Main {

    public static void main(String[] args) {
        Car  car = new Car();

        car.Start();
        car.acc();
//        car.stop();

        car.upgradeEngine();
        car.stop();
    }
}
