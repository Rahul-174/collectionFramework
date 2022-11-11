package com.collections;

import java.util.*;


/*
METHODS :
    boolean add(element)
    void add(index,element)
    void clear()
    boolean contains()
    int size()
    int indexOfObject(element)
    int lastIndexOf(element)

*/

public class CollectionVector {
    public static void main(String[] args) {
        Vector<String>v1 = new Vector<String>();
        v1.add("Rahul");
        v1.add("Kalyan");
        v1.add("Apoorv");
        v1.add("Jitendra");
        System.out.println(v1);

        System.out.println("Does it contains 'Apoorv' ? => "+v1.contains("Apoorv"));
        System.out.println("size : "+v1.size());
    }

}
