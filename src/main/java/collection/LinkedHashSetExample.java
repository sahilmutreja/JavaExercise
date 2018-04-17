package collection;

import java.util.LinkedHashSet;

/**
 * Author: Sahil Mutreja
 * Date: April 15, 2018
 * LinkedHashSet saves and maintains the insertion order of the entries
 */
public class LinkedHashSetExample {
    public static void main(String[] args) {
        LinkedHashSet<Employee> empLinkHSet= new LinkedHashSet<>();
        empLinkHSet.add(new Employee(2, 200, "B"));
        empLinkHSet.add(new Employee(1, 100, "A"));
        empLinkHSet.add(new Employee(4, 400, "D"));
        empLinkHSet.add(new Employee(3, 300, "C"));

        System.out.println("Printing all employees: ");
        empLinkHSet.forEach(employee -> System.out.println(employee + ","));
        System.out.println("Size: " + empLinkHSet.size());
        System.out.println("Is it empty: " + empLinkHSet.isEmpty());
        System.out.println("Contains Employee 4: " + empLinkHSet.contains(new Employee(4, 400, "D")));
        System.out.println("Removing emplohyee 4:");
        empLinkHSet.remove(new Employee(1,400,"D"));
        System.out.println("Printing all employees:");
        empLinkHSet.forEach(employee -> System.out.println(employee + ","));
    }
}
