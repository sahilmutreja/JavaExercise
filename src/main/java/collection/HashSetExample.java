package collection;

import java.util.HashSet;

/**
 * Author: Sahil Mutreja
 * Date: April 15, 2018
 * HashSet saves the entries in any random order.
 */
public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> productSet = new HashSet(){{
            this.add("p2");
            this.add("p1");
            this.add("p4");
            this.add("p3");
        }};
        productSet.forEach(s -> System.out.print(s + ","));

        System.out.println("Is product set empty: " + productSet.isEmpty());

        System.out.println("Removing product 4 from set:");
        productSet.remove("p4");
        System.out.println(productSet);

        System.out.println("Current product size: " + productSet.size());

        System.out.println("Does p3 exist: " + productSet.contains("p3"));

        System.out.println("HashSet to an Array: ");
        String[] productArray= new String[productSet.size()];
        productSet.toArray(productArray);
        for (String p:productArray ) System.out.println(p);

        System.out.println("Retaining only the common objects in 2 HashSet: ");
        HashSet<String> subSet = new HashSet<>();
        subSet.add("p1");
        subSet.add("p2");
        productSet.retainAll(subSet);
        System.out.println(productSet);
    }
}
