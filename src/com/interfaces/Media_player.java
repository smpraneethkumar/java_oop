package com.interfaces;

public class Media_player implements Media_Contor{

    @Override
    public void start(){
        System.out.println("Media player is started....");
    }

    @Override
    public void stop(){
        System.out.println("Media player is stoping....");
    }
}
