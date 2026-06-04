package BasicsinJAVA;

public class ASCIItoChar {
    public static void main(String[] args) {

        int ascii=122;

        System.out.println(ascii);

        char value=(char)(ascii);

        System.out.println(value);

        System.out.println((char)(value-5)); //u
        System.out.println((value-5)); //117


        //using of InBuilt java functions
        System.out.println(Character.toLowerCase('A'));
        System.out.println(Character.toUpperCase('a'));

        //If we want to iterate over it
        for (int i = 65; i <= 90; i++) {
            System.out.println(i + " : " + (char) (i));
        }

        System.out.println();

        //If we want to iterate over it
        for (char i = 'a'; i <= 'z'; i++) {
            System.out.println(i + " : " + (int) (i));
        }

    }
}
