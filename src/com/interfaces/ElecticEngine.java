package com.interfaces;

public class ElecticEngine  implements Engine{
    @Override
    public  void start(){
        System.out.println("Electic Engine car start's");
    }

    @Override
    public  void stop(){
        System.out.println("Electic Engine car stop's");
    }

    @Override
    public void acc(){
        System.out.println("Electic Engine car accelerate");
    }
}
