package com.interfaces;

public class Car {

    public Engine engine;


    public  Car(){
        engine =  new PowerEngine();
    }
    public  Car(Engine engine){
        this.engine = engine;
    }

    public void Start(){
         engine.start();
    }

    public  void stop(){
        engine.stop();

    }
    public  void acc(){
        engine.acc();
    }

    public void upgradeEngine(){
        engine =  new ElecticEngine();
    }


}
