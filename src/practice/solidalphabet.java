package practice;

public class solidalphabet {
    public static void main(String[] args) {
        int num=3;

        for(int r=0;r<num;r++){
            char ch='A';
            for(int c=0;c<num;c++){
                System.out.print(ch +" ");
                ch++;
            }
            System.out.println();
        }
    }
}
