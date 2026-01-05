package inheritance.properties;

public class Main {

    public static void main(String[] args) {

        Box box1 = new Box();
        System.out.println(box1.h + " "+ box1.l +" "+ box1.w);
        box1.l = 3.0;
        System.out.println(box1.h + " "+ box1.l+" "+ box1.w);

        Box box2 = new Box(23);
        System.out.println(box2.h + " "+ box2.l+" "+ box2.w);

        Box box3 = new Box(4.2,1.2,3.4);
        System.out.println(box3.h + " "+ box3.l+" "+ box3.w);

        Box box4 = new Box(box3);
        System.out.println(box4.h + " "+ box4.l+" "+ box4.w);

    }
}
