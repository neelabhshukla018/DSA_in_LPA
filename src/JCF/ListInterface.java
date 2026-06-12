package JCF;

import java.util.*;

public class ListInterface {

    public static void main(String[] args) {

//List interface----

//1). ArrayList==================================================
        //use of ArrayList for creating integer
        ArrayList<Integer> list1=new ArrayList<>();

        list1.add(10);
        list1.add(90);
        list1.add(5);
        list1.add(532);
        list1.add(20);
        list1.add(39);
        System.out.println("Arraylist of Integers items are: ");
        System.out.println(list1);

        System.out.println();

        ArrayList<Integer> list3=new ArrayList<>();

        list3.add(100);
        list3.add(900);
        list3.add(500);
        list3.add(532);
        System.out.println("Arraylist of Integers(2) items are: ");
        System.out.println(list3);

        System.out.println();

        //use of ArrayList for creating String
        ArrayList<String> list2=new ArrayList<>();

        list2.add("Arjun");
        list2.add("Neelabh");
        list2.add("Muskaan");
        list2.add("IlOVEyOU");
        System.out.println("Arraylist of String items are: ");
        System.out.println(list2);


        System.out.println();
//uses of java collection methods=======================================

        //For remove an element
        list1.remove(3);
        System.out.println("After removing an element in arraylist: ");
        System.out.println(list1);

        System.out.println();
        //For finding the size of list
        System.out.println(list1.size());

        System.out.println();

        //from idx this to this
        System.out.println(list1.subList(1,3));

        System.out.println();

        //for add one list to another
         System.out.println(list1.addAll(list3));//true
         System.out.println(list1);//give the list 1 after adding list2

        System.out.println();

        //to remove list3 from list1
           list1.removeAll(list3);
           System.out.println(list1);

        System.out.println();

        //to clear all the elements
        list3.clear();
        System.out.println(list3);


        System.out.println();


        //if we want to traverse the list using iterator
        Iterator<Integer> iterator=list1.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println();

        //to get the value from list
        System.out.println("get the value of idx3 --> 532");
        System.out.println( list1.get(3));

        System.out.println();

        //to set tha value of list
        System.out.println("set the value of 20 to 800: ");
        System.out.println(list1.set(3,800));
        System.out.println(list1);

        System.out.println();

        //to array
        Object[] arr=list2.toArray();
        for(Object obj:arr){
            System.out.println(list2);
        }

        System.out.println();


        //contains method
        System.out.println(list1.contains(39));
        System.out.println();
        System.out.println(list1);

        System.out.println();

        //add an element to the list it added in last
        list1.add(123);
        System.out.println("printing the list after adding: " );
        System.out.println(list1);


        System.out.println();

        //sorting in increasing order
        System.out.println("After sorting in Ascending order: ");
        Collections.sort(list2); //increasing order
        System.out.println(list2);

        System.out.println();
       // Sorting in descending order
        System.out.println("After sorting in descending order: ");
        Collections.sort(list2, Collections.reverseOrder()); // descending order
        System.out.println(list2);

        System.out.println();
        //for copy the value
        ArrayList <Integer> newlist=(ArrayList<Integer>) list1.clone();
        System.out.println("Copy the previous list");
        System.out.println(newlist);


        //to allocate minimum memory
        ArrayList<Integer> marks=new ArrayList<>();
        marks.ensureCapacity(500);

        System.out.println();
        //to check list is empty
        System.out.println(list2.isEmpty());

        System.out.println();
        //to know index
        System.out.println(list1.indexOf(39));

        System.out.println();
        System.out.println();

//============================END=====================================

//2). LinkedList-------

         //Created Integer type linked list
        LinkedList<Integer> linked1=new LinkedList<>();
        linked1.add(2);
        linked1.add(4);
        linked1.add(6);
        linked1.add(8);
        linked1.add(10);
        linked1.add(12);
        System.out.println("Printing of linked list 1: ");
        System.out.println(linked1);

        System.out.println();
        //Created Integer type linked list
        LinkedList<String> linked2=new LinkedList<>();
        linked2.add("neelabh");
        linked2.add("is");
        linked2.add("a");
        linked2.add("good");
        linked2.add("boy");
        System.out.println("Printing of linked list(string) 2: ");
        System.out.println(linked2);

        System.out.println();
       //To get any idx value use get
        System.out.println("get the value of idx where value is = 2: ");
        System.out.println(linked1.get(2));

        System.out.println();


        //to get the last index
        //if not found return -1
        System.out.println("get the value of last idx: ");
        System.out.println(linked1.lastIndexOf(12));


        System.out.println();
        System.out.println();
        //addfirst---add at start leftmost
        linked1.addFirst(900);
        System.out.println(linked1);

        System.out.println();
        //addlast----last at rightmost
        linked1.addLast(1000);
        System.out.println(linked1);

        System.out.println();
        //peek-----give the first element of linked list
        System.out.println(linked1.peek());

        System.out.println();

        //poll---it gives and remove the first element
        System.out.println(linked1.poll());
        System.out.println(linked1);

        System.out.println();
        //offer----add element from last
        System.out.println(linked1.offer(2000));
        System.out.println(linked1);
        System.out.println();
        System.out.println();
//============================END===================================
//2). Vector==================================================
        //use of Vector for creating integer
        Vector<Integer> vect1=new Vector<>();

        vect1.add(100);
        vect1.add(900);
        vect1.add(500);
        vect1.add(5320);
        vect1.add(200);
        vect1.add(390);
        System.out.println("Vector of Integers items are: ");
        System.out.println(vect1);

        System.out.println();

        //use of ArrayList for creating String
        Vector<String> vect2=new Vector<>();

        vect2.add("Arjun");
        vect2.add("Neelabh");
        vect2.add("Muskaan");
        vect2.add("IlOVEyOU");
        System.out.println("vector of String items are: ");
        System.out.println(vect2);


        System.out.println();

        //left same function are same as arraylist and linked list
        //vector do more Synchroniztion that's why it increases time it less prefers
        //over arraylist

//============================END============================================
//4). Stack==================================================
        //use of Stack for creating integer
        Stack<Integer> stack1=new Stack<>();

        stack1.add(-100);
        stack1.add(-900);
        stack1.add(-500);
        stack1.add(-50);
        stack1.add(-200);
        stack1.add(-390);
        System.out.println("stack of Integers items are: ");
        System.out.println(stack1);

        System.out.println();

        //use of ArrayList for creating String
        Stack<String> stack2=new Stack<>();

        stack2.add("Arjun");
        stack2.add("Neelabh");
        stack2.add("Muskaan");
        stack2.add("IlOVEyOU");
        System.out.println("stack of String items are: ");
        System.out.println(stack2);


        System.out.println();

        //some methods for it stack

        //push--add from last
        stack1.push(956);
        System.out.println(stack1);

        System.out.println();


        //pop--delete from last
        stack1.pop();
        System.out.println(stack1);
        System.out.println();

        //empty
        System.out.println(stack1.empty());

        System.out.println();

        //peek---give teh last element
        System.out.println(stack1.peek());

        System.out.println();

        //search()---idx from 0...3
        System.out.println(stack1.search(-50));




    }
}
