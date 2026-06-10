package OOPS.Student;

public class Student {

    //data(ATTRIBUTES)
    public int id;
    public int nos;
    public String name;
    public int age;

    //For the encapsulation part
    private String gf;
    private String laptop;


    //adding one more layer security
    //getter function
    public String getgf(){

        return this.gf;
    }

    //setter function---> to set the function means name
    public void setgf(String nameofgf){

        //we can add extra layer of authentication
        if (this.age < 22) {
            this.gf = nameofgf;
        }
        else {
            System.out.println("GF name cannot be changed after age 22.");
        }
    }

//Behaviiour(Methods)

    public void study(){
        System.out.println("Student is studying");
    }

    public void sleep(){
        System.out.println("Student is sleeping");
    }

    public void coding(){
        System.out.println("Student is coding");
    }

    public void gaming(){
        System.out.println("Student is gaming");
    }

    //for encapsulation function
    private void gfchatting(){
        System.out.println("studnet is chatting with his gf");
    }

    private void laptopwork(){
        System.out.println("student has many secret files");
    }



    //Default constructor
    public Student (){
        System.out.println(" default constructor");
    }



    //Parameterised Constructor
    public Student(int id,int nos,String name,int age,String gf){
        System.out.println("Cars Parameterised Constructor is called");


        this.id=id;
        this.nos=nos;
        this.name=name;
        this.age=age;
        this.gf=gf;

    }


    //copy constructor  //srcobj---->A
    public Student(Student srcobj){
        this.id= srcobj.id;
        this.nos=srcobj.nos;
        this.name= srcobj.name;
        this.age= srcobj.age;
        this.gf=srcobj.gf;
    }


//================================================================

public static void main(String[] args) {

    Student A=new Student(120,6,"Neelabh Shukla",21,"Muskaan");

    System.out.println(A.id);
    System.out.println(A.nos);
    System.out.println(A.name);
    System.out.println(A.age);

    System.out.println(A.gf); //can be accesss inside of that class

    A.study();
    A.coding();
    A.gaming();
    A.sleep();

    //try to call encapsulation part
     A.gfchatting(); //can be accesss inside of that class
}

}

