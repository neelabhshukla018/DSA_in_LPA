package OOPS.Transport;

public class car extends Vehicle{

    public String chesisno;
    public String enginename;
    public int challan;


    //make the constructor
    public car(String name, String model, int nooftyres,String chesisno,String enginename,int challan) {
        super(name,model,nooftyres);

        this.chesisno = chesisno;
        this.enginename=enginename;
        this.challan=challan;

//        super.startengine();
//        super.stopengine();
    }

    //make a function
    public void drifting(){
        System.out.println("Car is drifting");
    }



    public static void main(String[] args) {

    }
}
