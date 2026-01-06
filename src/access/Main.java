package access;

public class Main{

    public static void main (String [] agsr){

        A acc = new A();
     //  System.out.println(acc.num); //we will get error because the variable is private we can't access in another class or another packages

        System.out.println(acc.getNum());

    }
}
