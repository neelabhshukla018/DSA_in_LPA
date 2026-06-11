package OOPS.Polymorphism;

public class Main {

    public static void main(String[] args) {

         Calculator c=new Calculator();

        System.out.println(c.sum(5,9));

        System.out.println(c.sum(8,6,4));


        circle e=new circle();
//        e.draw();

        //upcasting
        dodrawingstuff(e);

        shape s=new shape();
        dodrawingstuff(s);

        System.out.println();
        rectangle r=new rectangle();
        dodrawingstuff(r);

    }

    //upcasting
    public static void dodrawingstuff(shape s){
        s.draw();
    }
}
