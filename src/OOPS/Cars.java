package OOPS;

public class Cars {
//==========================================================================
    //Attributes
    public int yearofmf;
    public int noofseats;
    public String nameofcar;
    public String enginename;
    public int priceofcar;


    //Methods Or Behaviour
    public void start(){
        System.out.println("Car is started.");
    }

    public void brokedown(){
        System.out.println("Car is brokedown.");
    }

    public void accident(){
        System.out.println("Car is met with an accident.");
    }


    //Default Constructor
    public Cars(){
        System.out.println("Cars default Constructor is called");
    }


    //Parameterised Constructor
    public Cars(int yearofmf,int noofseats,String nameofcar,String enginename,int priceofcar){
        System.out.println("Cars Parameterised Constructor is called");

        this.yearofmf=yearofmf;
        this.noofseats=noofseats;
        this.nameofcar=nameofcar;
       this.enginename=enginename;
        this.priceofcar=priceofcar;

    }


    //Copy Constructor

    //srcobj--->B
    public Cars(Cars srcobj){
        System.out.println("Cars copy Constructor is called");

        this.yearofmf= srcobj.yearofmf;
        this.noofseats=srcobj.noofseats;
        this.nameofcar=srcobj.nameofcar;
        this.enginename=srcobj.enginename;
        this.priceofcar=srcobj.priceofcar;

    }



//====================================================================================
    public static void main(String[] args) {

        //Default Constructor
        Cars A =new Cars();//Creating an object

        //Allocating values
//        A.nameofcar="Mercedes Benz";
//        A.yearofmf=2005;
//        A.enginename="V8";
//        A.noofseats=2;
//        A.priceofcar=500000;

        //Before allocating values
        //outpur--0
//        System.out.println(A.yearofmf);
        //outpur--null
//        System.out.println(A.nameofcar);

        //After allocating values
//        System.out.println(A.nameofcar);
//        System.out.println(A.yearofmf);
//        System.out.println(A.enginename);
//        System.out.println(A.noofseats);
//        System.out.println(A.priceofcar);
//
//        A.accident();
//        A.brokedown();
//        A.start();


        //Parametersided constructor
        Cars B=new Cars(2005,4,"Mercedes benz","v8",50000);

//        System.out.println(B.yearofmf);
//        System.out.println(B.noofseats);
//        System.out.println(B.nameofcar);
//        System.out.println(B.enginename);
//        System.out.println(B.priceofcar);
//
//        A.accident();
//        A.brokedown();
//        A.start();


        //Copy Constructor is called
        Cars C=new Cars(B);

        System.out.println(B.yearofmf);
        System.out.println(B.noofseats);
        System.out.println(B.nameofcar);
        System.out.println(B.enginename);
        System.out.println(B.priceofcar);

        A.accident();
        A.brokedown();
        A.start();


    }
}
