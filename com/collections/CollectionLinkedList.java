package com.collections;

import java.util.*;


public class CollectionLinkedList {
    public static void main(String[] args) {
        LinkedList<String>ll = new LinkedList<String>();
        ll.add("Rahul");
        ll.add("Kalyan");
        ll.add("Apoorv");
        ll.add("Jitendra");

        Iterator itr = ll.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        //remove()
        ll.remove("Apoorv");
        System.out.println("After remove : "+ll);

        /*
            OTHER METHODS:
                contains(Object o)
                add(index,element)
                addFirst(element)
                addLast(element)
                indexOf(element)
                lastIndexOf(element)
                ...etc
         */
    }
}
