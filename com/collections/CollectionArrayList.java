package com.collections;

import java.util.*;

/*
METHODS :
    boolean add(element) => Appends the specifies element to the end of list
    void add(index,element) => inserts the specified element at the specified position
    void clear() => removes all elements from the list
    int lastIndexOf(element) => returns last occurrence of specified element if present or returns -1
    Object clone() => returns a shallow copy of an arrayList
    Object[] to Array() => returns an array containing all the elements in the list
    void trimToSize() => trims the capacity if this ArrayList instance to be list's current size

*/

public class CollectionArrayList {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();

        //appending to the arrayList
        //Storing Heterogeneous data
        al.add("Rahul");
        al.add("Yadav");
        al.add(22);

        //Interface itr = al.iterator() => creating object of interface Iterator
        Iterator itr =al.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        //adding element at specified index
        al.add(1,"Kumar");
        System.out.println(al);
//_______________________________________________________________________________

        ArrayList al2=new ArrayList<>();
        al2.add("Adam");al2.add("Eve");al2.add("Alice");al2.add("Adam");al2.add("Carol");al2.add("Bob");
        System.out.println(al2);

        //lastIndexOf()
        System.out.println("Last index of Adam : "+al2.lastIndexOf("Adam"));

        ArrayList cloneAl =(ArrayList) al2.clone();
        System.out.println("cloned allrayList :" + cloneAl);

        al2.trimToSize();
        System.out.println("TrimmedSize : " + al2.size());

        cloneAl.clear();
        System.out.println("Cloned arrayList after clear =>  "+cloneAl);



    }
}
