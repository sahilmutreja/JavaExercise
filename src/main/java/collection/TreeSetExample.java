package collection;

import java.util.*;

/**
 * Author: Sahil Mutreja
 * Date: April 15, 2018
 * TreeSet saves and maintains the natural sorting order of the entries
 */
public class TreeSetExample {

    public static void main(String[] args) {
        TreeSet<Employee> empTreeSet = new TreeSet<>();
        empTreeSet.add(new Employee(2, 300, "A"));
        empTreeSet.add(new Employee(1, 100, "B"));
        empTreeSet.add(new Employee(4, 400, "D"));
        empTreeSet.add(new Employee(3, 200, "C"));
        System.out.println("Adding a duplicate entry in the TreeSet: for Employee A");
        empTreeSet.add(new Employee(2, 300, "A"));

        System.out.println("The entries are sorted and stored on the basis of empID " +
                "based on the implementation of equals method in Employee class, and duplicate entries are ignored.");
        empTreeSet.forEach(e -> System.out.println(e));

        /*Creating a TreeSet from ArrayList*/
        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee(2, 300, "A"));
        empList.add(new Employee(1, 100, "B"));
        empList.add(new Employee(4, 400, "D"));
        empList.add(new Employee(3, 200, "C"));
        System.out.println("Printing the list: ");
        empList.forEach(e-> System.out.println(e + ","));
        System.out.println();
        empTreeSet.clear();
        System.out.println("TreeSet size: " + empTreeSet.size());
        System.out.println("Adding the list into treeSet and printing the treeset: ");
        empTreeSet.addAll(empList);
        empTreeSet.forEach(e-> System.out.println(e));


        System.out.println("Changing the natural ordering from ascending to descending of employee id: ");
        TreeSet<Employee> newEmployeeSet = new TreeSet<>(Comparator.reverseOrder());
        newEmployeeSet.addAll(empTreeSet);
        newEmployeeSet.forEach(employee -> System.out.println(employee));

        /*Getting a subset in a TreeSet*/
        TreeSet<String> ts = new TreeSet<>();
        ts.add("RED");
        ts.add("ORANGE");
        ts.add("BLUE");
        ts.add("GREEN");
        ts.add("WHITE");
        ts.add("BROWN");
        ts.add("YELLOW");
        ts.add("BLACK");
        System.out.println(ts);
        // By default 1st element is inclusive and 2nd element is non inclusive
        Set<String> subSet = ts.subSet("GREEN", "WHITE");
        System.out.println("sub set: "+subSet);
        subSet = ts.subSet("GREEN", true, "WHITE", true);
        System.out.println("sub set: "+subSet);
        subSet = ts.subSet("GREEN", false, "WHITE", true);
        System.out.println("sub set: "+subSet);
        System.out.println("First: " + ts.first());
        System.out.println("Last: " + ts.last());
    }
}
