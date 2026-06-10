package OOPS.Transport;

public class Vehicle {

    public String name;
    public String model;
    public int nooftyres;


    //without this extends not work
    public Vehicle (){
        System.out.println(" default constructor");
    }


    //Parameterised Constructor
    public Vehicle(String name,String model,int nooftyres){
//        System.out.println("Cars Parameterised Constructor is called");

        this.name=name;
        this.model=model;
        this.nooftyres=nooftyres;

    }


    //methods of vehicles
    public void startengine(){
        System.out.println("Vehicle engine has been started");
    }

    public void stopengine(){
        System.out.println("Vehicle engine has been stopped");
    }


    public static void main(String[] args) {

    }
}
