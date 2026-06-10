package OOPS;

public class Studentclass {

    public static void main(String[] args) {

        Student A=new Student(120,6,"Neelabh Shukla",21,"Muskaan");

        System.out.println(A.id);
        System.out.println(A.nos);
        System.out.println(A.name);
        System.out.println(A.age);

        //after adding one more layer security
        //cant be accesed through (A.name)
        //getter function
        System.out.println(A.getgf());

        //settter function------> we can change the value but only after applying conditions
        A.setgf("Simran");
        System.out.println(A.getgf());


        //System.out.println(A.gf); //cant be accesss outside of the class

        A.study();
        A.coding();
        A.gaming();
        A.sleep();



        //try to call encapsulation part
       // A.gfchatting(); //cant be accesss outside of the class
//
//        System.out.println("below is copy of A using copy constructor");
//        System.out.println();


        //copy constructor used
//        Student B=new Student(A);
//
//        System.out.println(B.id);
//        System.out.println(B.nos);
//        System.out.println(B.name);
//        System.out.println(B.age);
//
//        B.study();
//        B.coding();
//        B.gaming();
//        B.sleep();




    }

}

