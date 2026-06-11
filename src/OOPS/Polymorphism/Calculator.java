package OOPS.Polymorphism;

public class Calculator {

    //using diffrent parameteres
    public static int sum(int a,int b){
       return a+b;
    }

    public static int sum(int a,int b ,int c){

        return a+b+c;
    }


    public static void main(String[] args) {
        System.out.println(sum(5,9));
        System.out.println(sum(2,2,2));
    }
}
