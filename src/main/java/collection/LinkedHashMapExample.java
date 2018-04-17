package collection;

import java.util.LinkedHashMap;

/**
 * Author: Sahil Mutreja
 * Date: April 16, 2018
 * LinkedHashMap saves the entries in the order of insertion.
 */
public class LinkedHashMapExample {

    public static void main(String[] args) {
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
        map.put(3,"three");
        map.put(4,"four");
        map.put(5,"five");
        map.put(2,"two");
        map.put(1,"one");

        /*LinkedHashMap maintains the insertion order*/
        System.out.println("Printing the values of LinkedHashMap: ");
        map.forEach((i,s)-> System.out.println(i +" :" + s));
    }



}
