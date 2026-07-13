package practice;

public class overlaoding {

    public static int sumoftwo(int a,int b){
        return a+b;
    }

    public static double sumoftwo(double b,double a){
        return b+a;
    }



    public static void main(String[] args) {
        System.out.println(sumoftwo(5,9));



        System.out.println(sumoftwo(2,4));
    }
}
