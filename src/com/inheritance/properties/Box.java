package com.inheritance.properties;

public class Box {

    double h ;
    double l;
    double w;


    Box(){
        this.h = -2;
        this.l = -1;
        this.w = -1;
    }

    Box(double size){
        this.h = size;
        this.l = size;
        this.w = size;
    }

    Box(double h, double l,double w){
    this.h = h;
    this.l =l;
    this.w =w;
    }


    Box(Box old){
        this.h = old.h;
        this.l = old.l;
        this.w = old.w;
    }
}
