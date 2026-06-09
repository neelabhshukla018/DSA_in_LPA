package Methods;

public class callByValue {
    public static void change(int x){
        x=100;
    }
    public static void main(String[] args) {
        int a=10;
        change(a);
        System.out.print(a);
    }
}
