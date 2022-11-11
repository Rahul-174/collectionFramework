package com.collections;

import java.util.HashSet;
import java.util.Iterator;

        /*
         HASH_SET :
            Allows Null
            Doesn't allow duplicates
            Iteration Order of the set is not guaranteed
            Constant time performance (add,remove contains and size)



          METHODS :
            boolean add(element)
            void clear()
            boolean contains()
            boolean isEmpty()
            boolean remove()
            int size()
            Iterator iterator()
         */

public class CollectionHashSet {
    public static void main(String[] args) {
        HashSet<String>hs=new HashSet<>();
        hs.add("Rahul");
        hs.add("Apoorva");
        hs.add("Rohit");

        Iterator itr=hs.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("IsEmpty ? => "+hs.isEmpty());
        System.out.println("size : "+hs.size());
        System.out.println("Contains Rohit ? => "+hs.contains("Rohit"));
    }
}
