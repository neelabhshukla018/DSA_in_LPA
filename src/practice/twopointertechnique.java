package practice;

public class twopointertechnique {
    public static void main(String[] args) {

        String s="neelabh";
        StringBuilder nm=new StringBuilder(s);

//        int i=0;
//        int j=s.length()-1;
//
//        while(i<=j){
//            char temp1=s.charAt(i);
//            char temp2=s.charAt(j);
//
//            nm.setCharAt(i,temp2);
//            nm.setCharAt(j,temp1);
//            i++;
//            j--;
//
//        }
//        System.out.println(nm);

        //one more method to reverse the string
        nm.reverse();
        s=nm.toString();
        System.out.println(s);
    }
}
