package com.maps;


import java.util.HashMap;
import java.util.Iterator;

/*
    Object that maps with key value pairs
    Duplicate keys are not allowed

    EXCEPTIONS:
    1. Null Pointer Exception = null object
    2. No Such Exception = get an element which doesn't exist
    3. Class Cast Exception = object is incompatible
    4. Unsupported exception = unmodifiable map
*/
public class HashMap_Interface {
    public static void main(String[] args) {
        //HashMap
        //Stores key value pair =. no duplicate keys
        HashMap<String,Integer>hMap=new HashMap<>();

        //adding element
        hMap.put("one",1);
        hMap.put("two",2);
        hMap.put("three",3);
        hMap.put("four",4);
        System.out.println("HashMap : "+hMap);

        //access keys
        System.out.println("keys : "+hMap.keySet());

        //access values
        System.out.println("values : "+hMap.values());

        //iterating the values
        Iterator itr=hMap.entrySet().iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        /*
             METHODS:
                 merge()
                 ...etc
         */

    }
}
