package OOPS.Abstarction;

public class oldversion {


    static abstract class bird {

        abstract void eat();

        abstract void fly();
    }


    static class sparrow extends bird {

        @Override
        void fly() {
            System.out.println("sparrow is flying...");
        }

        @Override
        void eat() {
            System.out.println("sparrow is eating....");
        }

    }

    static class crow extends bird {

        @Override
        void fly() {
            System.out.println("crow is flying...");
        }

        @Override
        void eat() {
            System.out.println("crow is eating....");
        }

    }
//==================================================================
    public static void dobirdstuff(bird b){
        b.fly();
        b.eat();
        b.fly();
        b.eat();
        b.fly();
        b.eat();
        b.fly();
        b.eat();
    }
//============================================================================
    public static void main(String[] args) {

//        bird b=new sparrow();
//        b.eat();
//        b.fly();
//
//        bird c=new crow();
//        c.eat();
//        c.fly();

//============================================================================
        dobirdstuff(new sparrow());


        dobirdstuff(new crow());






    }
}
