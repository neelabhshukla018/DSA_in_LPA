package practice;

public class method {

    public static int sumoftwo(int a,int b){
        return a+b;
    }

    public static void greet(){
        System.out.println("Good morning!");
    }

    public static void table(int m,int n){
        for (int i = 1; i <=n ; i++) {
            int result = m * i;
            System.out.println(result);
        }
    }

    public static void printsum(){
        int sum=sumoftwo(10,40);
        System.out.print(sum);
    }

    public static void main(String[] args) {
        System.out.print("sum of two numbers is: " +sumoftwo(5,9));
        System.out.println();
        greet();

        table(2,10);
        System.out.println();
        printsum();
    }
}
