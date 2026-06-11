package OOPS.Abstarction;

public class newversion {

    //Interface
    interface bird{
        void fly();
        void  eat();
    }


     class sparrow implements bird{

         @Override
         public void fly() {
             System.out.println("sparrow flying");
         }

         @Override
         public void eat() {
             System.out.println("sparrow eating");
         }
     }


    class parrot implements bird{

        @Override
        public void fly() {
            System.out.println("parrot flying");
        }

        @Override
        public void eat() {
            System.out.println("parrot eating");
        }
    }


    //==================================================================
    public static void dobirdstuff(oldversion.bird b){
        b.fly();
        b.eat();
        b.fly();
        b.eat();
        b.fly();
        b.eat();
        b.fly();
        b.eat();
    }

    public static void main(String[] args) {


        //        bird b=new sparrow();
//        b.eat();
//        b.fly();
//
//        bird c=new crow();
//        c.eat();
//        c.fly();

//============================================================================
        dobirdstuff(new oldversion.sparrow());


        dobirdstuff(new oldversion.crow());

    }
}
