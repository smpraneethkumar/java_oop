package com.static_example;

import java.sql.SQLOutput;

import static com.static_example.Human.population;

public class Main {

    public static void main (String []agrs){

        Human praneeth = new Human(20,"praneeth",'M',1000);
        Human praveen = new Human(50,"praveen",'M',10000);

        System.out.println(praneeth.name+praneeth.age );

//        if you use the keyword static we noneed to create object for the that to delare
        System.out.println(population);
        System.out.println(population);
        System.out.println(Human.population);

        Main s = new Main();
        s.greeting();

//        greeting();
    }
//    we know that something which is not static, belongs to an object
    void greeting(){
        System.out.println("hello world");
    }
}
