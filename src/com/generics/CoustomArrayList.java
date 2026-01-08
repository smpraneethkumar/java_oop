package com.generics;

import java.util.ArrayList;

public class CoustomArrayList {

    int[] data;
    int def_data = 10;
    int size = 0;

    public  CoustomArrayList(){
        this.data = new int[def_data];
    }

    public void add(int num){
            if(isFull()){
                resize();
            }
       data[size++] = num;
        System.out.println(num);
    }

    public boolean isFull(){
        return data.length == def_data;

    }

    public void resize(){
            int[] temp = new int[def_data *2];

            for (int i=0;i <data.length;i++){
                temp[i] = data[i];
            }
            data = temp;
    }

    public int get(int i){
        return data[i];
    }

    public  int size(){
        return data.length;
    }

    public int set(int i ,int numReplace){

        return data[i] = numReplace;

    }


    public static void main (String [] agrs){

        CoustomArrayList list = new CoustomArrayList();

        list.add(23);
        list.add(34);

        System.out.println(list.size());

//        for(int i =0; i<10;i++){
//            list.add(i);
//        }
        System.out.println(list.size());
        System.out.println(list.get(0));
        list.set(0,90);
        System.out.println(list.get(0));





    }
}
