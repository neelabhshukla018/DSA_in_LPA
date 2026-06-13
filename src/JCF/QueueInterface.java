package JCF;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueInterface {
    public static void main(String[] args) {

//Queuue interface

//1). Arraydeque======================================================================
        //use of Arraydeque for creating integer
        Queue<Integer> q1=new ArrayDeque<>();

        q1.offer(10);
        q1.offer(20);
        q1.offer(30);
        q1.offer(40);
        q1.offer(50);
        System.out.println("Arraydeque elements (INTEGERS) are: ");
        System.out.println(q1);
        System.out.println();

        //to see the element---from top very first element
        System.out.println(q1.peek());

        System.out.println();
        //TO return and remove the first ellement of quueue
        System.out.println(q1.poll());
        System.out.println(q1);


        System.out.println();
        //use of Arraydeque for creating integer
        ArrayDeque<String> q2=new ArrayDeque<>();

        q2.offer("Hii");
        q2.offer("Muskaan");
        q2.offer("I love you");
        q2.offer("so so much");
        System.out.println("Arraydeque elements(STRINGS) are: ");
        System.out.println(q2);

        System.out.println("===============================================");
//========================END==============================================================================
        System.out.println();
//2). LinkedList======================================================================
        //use of LinkedList for creating integer
        Queue<Integer> l1=new LinkedList<>();
        l1.offer(1);
        l1.offer(2);
        l1.offer(3);
        l1.offer(4);
        l1.offer(5);
        System.out.println("Linked list elements (INTEGERS) are: ");
        System.out.println(l1);
        System.out.println();
        System.out.println();






        //use of LinkedList for creating integer
        Queue<String> l2=new LinkedList<>();
        l2.offer("You");
        l2.offer("Know");
        l2.offer("How much");
        l2.offer("I miss you");
        l2.offer("everyday");
        System.out.println("Linked list elements (Strings) are: ");
        System.out.println(l2);
        System.out.println("=================================================");





//========================END==============================================================================
        System.out.println();
//3). PriorityQueue======================================================================
        //use of Priorityqueue for creating integer
//        Queue<Integer> p1=new PriorityQueue<>();
        Queue<Integer> p1=new PriorityQueue<>((a,b)->b-a);
        p1.offer(100);
        p1.offer(200);
        p1.offer(300);
        p1.offer(400);
        p1.offer(500);
        System.out.println("Priority Queue elements (INTEGERS) are: ");
        System.out.println(p1);
        System.out.println();
        System.out.println();


        //deftult behaviour less value---->hisghest priority--->minheap//100
        //if we want high value---->hisghest priority--->maxheap //500
        System.out.println(p1.poll());
        System.out.println(p1);






        //use of Arraydeque for creating integer
        Queue<String> p2=new PriorityQueue<>();
        p2.offer("every");
        p2.offer("single");
        p2.offer("day");
        p2.offer("I lied");
        p2.offer("i can't do wtht you");
        System.out.println("PriorityQueue elements (Strings) are: ");
        System.out.println(p2);
        System.out.println();


    }
}
