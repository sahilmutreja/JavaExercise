package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Author: Sahil Mutreja
 * Date: April 15, 2018
 * ArrayList saves the entries in the order of the insertion.
 */
public class ArrayListExample extends Employee {

    public static void main(String[] args) {

        Employee e1 = new Employee(2,200,"sahil");
        Employee e2 = new Employee(1,300,"adam");
        Employee e3 = new Employee(4,100,"Zack");
        Employee e4 = new Employee(4,100,"Zack");

        List<Employee> empList = new ArrayList<>();
        empList.add(e1);
        empList.add(e2);
        empList.add(e3);
        empList.add(e4);
        printEmployeeList(empList);

        System.out.println("Check if objects are equal:");
        System.out.println("e1=e2: " + e1.equals(e2));
        System.out.println("e3=e4: " + e3.equals(e4));

        System.out.println("Sort list by employeeID: ");
        empList.sort((o1, o2) -> {
            if(o1.emloyeeID>o2.emloyeeID) return 1;
            else if(o1.emloyeeID<o2.emloyeeID) return -1;
            else return 0;
        });
        printEmployeeList(empList);

        System.out.println("Sort list by salary: ");
        empList.sort((o1, o2) -> {
            if(o1.salary>o2.salary) return 1;
            else if(o1.salary<o2.salary) return -1;
            else return 0;
        });
        printEmployeeList(empList);

        System.out.println("Converting ArrayList to array");
        Employee[] arrEmployee = new Employee[empList.size()];
        empList.toArray(arrEmployee);
        for (Employee e: arrEmployee) {
            System.out.println(e);
        }

        System.out.println("Printing sublist of array from 1 to 3:");
        /*First reversing the list which is sorted on employeeID descending order and then getting first 3 employees*/
        Collections.reverse(empList);
        empList.subList(0,3).forEach(employee -> {
            System.out.println(employee);
        });
        System.out.println("Maximum Employee: " + Collections.max(empList));
        System.out.println("Minimum Employee: " + Collections.min(empList));

        System.out.println("Before setting employe 3");
        printEmployeeList(empList);
        empList.set(2,new Employee(3,250,"sahil250")); // Overrides the element at position 3
        System.out.println("After setting employee 3");
        printEmployeeList(empList);

    }

    private static void printEmployeeList(List<Employee> empList) {
        empList.forEach(employee -> {
            System.out.println(employee);
        });
    }
}