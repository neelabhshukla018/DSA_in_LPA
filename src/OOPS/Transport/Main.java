package OOPS.Transport;

public class Main {

    public static void main(String[] args) {

        car c=new car("Mercedes AMG","2022",4,"2514523","v8",4);

        System.out.println(c.name);
        System.out.println(c.model);
        System.out.println(c.nooftyres);
        System.out.println(c.chesisno);
        System.out.println(c.enginename);
        System.out.println(c.challan);

        c.startengine();
        c.drifting();
        c.stopengine();

        System.out.println();
        System.out.println("below are bike data------------");
        System.out.println();


        bike b=new bike("hero","HF",2,"Tilt","daily uses","no");

        System.out.println(b.name);
        System.out.println(b.model);
        System.out.println(b.nooftyres);
        System.out.println(b.handlestyle);
        System.out.println(b.category);
        System.out.println(b.helmet);

        b.thrustinbike();
        b.startengine();









    }




}
