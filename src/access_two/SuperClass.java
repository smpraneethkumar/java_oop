package access_two;

import access.SubClass;
public class SuperClass extends SubClass {

    public void display(){
        System.out.println(age);
        System.out.println();
    }

    public static void main(String[] args) {

            SuperClass c = new SuperClass();
            c.display();

    }
}
