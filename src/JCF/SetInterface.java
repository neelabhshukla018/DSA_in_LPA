package JCF;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Queue;
import java.util.Set;

public class SetInterface {
    public static void main(String[] args) {

        //Set interface

//1). enumset======================================================================
        //use of set for creating integer
        Set<Integer> s1=new HashSet<>();

        s1.add(10);
        s1.add(20);
        s1.add(30);
        s1.add(40);
        s1.add(50);
        System.out.println("set1 elements (INTEGERS) are: ");
        System.out.println(s1);
        System.out.println();

        Set<Integer> s2=new HashSet<>();

        s2.add(60);
        s2.add(30);
        s2.add(80);
        s2.add(90);
        s2.add(40);
        System.out.println("set2 elements (INTEGERS) are: ");
        System.out.println(s2);
        System.out.println();

        //retainAll---> intersection of two sets
        System.out.println(s1.retainAll(s2));
        System.out.println(s1);

    }
}
