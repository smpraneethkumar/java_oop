package com.interfaces;

public class PowerEngine  implements Engine{

    @Override
    public  void start(){
        System.out.println("Power Engine car start's");
    }

    @Override
    public  void stop(){
        System.out.println("Power Engine car stop's");
    }

    @Override
    public void acc(){
        System.out.println("Power Engine car accelerate");
    }
}
