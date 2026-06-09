package BitwiseOperator;

public class Bitwise {

    //And operator
    public static int andoperator(int a,int b){
        return a&b;
    }

    //OR operator
    public static int oroperator(int a,int b){
        return a|b;
    }

    //XOR operator
    public static int xoroperator(int a,int b){
        return a^b;
    }

    //NOT operator
    public static int notroperator(int a){
        return ~a;
    }

    //LEFT Shift----->(a*2^b)
    public static int Leftshift(int a,int b){
        return a<<b;
    }

    //RIGHT Shift-----> (a/2^b)
    public static int Rightshift(int a,int b){
        return a>>b;
    }

    public static void main(String[] args) {

        System.out.println(andoperator(4,6));

        System.out.println(oroperator(4,6));

        System.out.println(xoroperator(4,6));

        System.out.println(notroperator(4));

        System.out.println(Leftshift(2,3));

        System.out.println(Rightshift(2,3));
    }
}
