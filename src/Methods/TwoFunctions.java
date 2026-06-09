package Methods;

public class TwoFunctions {

    //first method
    public static int add(int a,int b){
        return a+b;
    }

    //second method
    public static void  printsum(){
        int result=add(50,50);//calling the above function
        System.out.println(result);
    }

    public static void main(String[] args) {
       printsum();
    }
}
