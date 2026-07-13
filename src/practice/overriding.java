package practice;



public class overriding {

   static class animal{
        void sound(){
            System.out.println("animal makes sound");
        }
    }

   static class Dog extends animal{
        @Override
        void sound() {
            System.out.println("dog makes barking sound");
        }
    }

    public static void main(String[] args) {

//       animal cat=new animal();
//        cat.sound();

        Dog shepherd =new Dog();
        shepherd.sound();


    }
}
