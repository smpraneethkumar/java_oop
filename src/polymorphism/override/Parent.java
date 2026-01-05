package polymorphism.override;

public class Parent{
    //@Override
    void matter(){
        System.out.println(" hi i am from parent class !!! ");
    }
    public static void
    main (String [] agrs){

//        Child c = new Child();
//        c.matter();
//        Parent p = new Parent();
//        p.matter();

        Parent o = new Child();
        o.matter();
    }
}
