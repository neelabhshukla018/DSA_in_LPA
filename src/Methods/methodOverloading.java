package Methods;

public class methodOverloading {


//using diffrent parameteres
    public static int sum(int a,int b){
        int sum=a+b;
        return sum;
    }

    public static int sum(int a,int b ,int c){
        int sum=a+b+c;
        return sum;
    }

//using diffrent datatypes
public static double add(double a,double b){
    double add=a+b;
    return add;
}

    public static int add(int a,int b){
        int add=a+b;
        return add;
    }

//By changing the order of parameter
    public static int multiply(int x, int y) {
        return x * y;
    }

    public static double multiply(double y, double x) {
        return y * x;
    }

    public static void main(String[] args) {

        System.out.println(sum(10,20));
        System.out.println(sum(5,5,5));

        System.out.println(add(5.6,3.2));
        System.out.println(add(5,3));

        System.out.println(multiply(5,6));
        System.out.println(multiply(2.8,9.6));

    }
}
