package OOPS.Transport;

public class bike extends Vehicle {

    public String handlestyle;
    public String category;
    public String helmet;


    //make the constructor
    public bike(String name, String model, int nooftyres,String handlestyle,String category,String helmet) {
        super(name, model, nooftyres);

            this.handlestyle = handlestyle;
            this.category = category;
            this.helmet = helmet;

//            super.startengine();
//            super.stopengine();
        }

//make a function
        public void thrustinbike(){
            System.out.println("bike produces a massive thrust");
        }

   //======================================================================
        public static void main (String[]args){



        }
    }


