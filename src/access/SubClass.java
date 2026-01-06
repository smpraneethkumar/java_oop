package access;

import polymorphism.override.Parent;

public class SubClass {

    String name = "Praneeth Kumar";
   protected int age = 20;

    public static void main (String [] agrs){

        SuperClass parent = new SuperClass();

//        System.out.println("PUBLIC: "+parent.name);
        System.out.println("PROTECTED: "+ parent.name);

        System.out.println("No-modifier "+parent.no_m);



//
    }
}
