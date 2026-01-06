package com.inheritance.properties;

public class BoxWeight extends Box {

    double weight;

    BoxWeight(){
        this.weight = -1;
    }

        BoxWeight(double h,double w, double l,double weight ){
//        used to initialise values present in parent class
        super(h,l,w); // what is this?   call the parent class constructor

        this.weight = weight;
        }

}
