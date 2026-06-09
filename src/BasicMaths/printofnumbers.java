package BasicMaths;

public class printofnumbers {

    public static void main(String[] args) {
        int num=789654;

        while(num!=0){

            //extract last digit
            int digit=num%10;
            System.out.print(digit +" ");

            //remove last digit
            num=num/10;

        }

    }
}
