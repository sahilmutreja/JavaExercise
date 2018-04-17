package collection;

import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

/**
 * Author: Sahil Mutreja
 * Date: April 15, 2018
 * Hashtable saves the entries in any random order.
 */
public class HashtableExample {

    public static void main(String[] args) {
        Hashtable<Integer,String> studentTable = new Hashtable<>();
        addValueInHashtable(studentTable);
        printTable(studentTable);

        /*Retrieve value based on key*/
        System.out.println(studentTable.get(0));

        /*Check if hashtable is empty*/
        System.out.println("Hashtable is empty: " + studentTable.isEmpty());

        /*Removing an element from hashtable*/
        studentTable.remove(2);
        System.out.println("Size of hashtable: " + studentTable.size());
        System.out.println("Printing a hashtable after removing studentid 2");
        printTable(studentTable);

        /*Iterating through the keyset*/
        System.out.println("Iterating through the keyset");
        Set<Integer> studentIDSet = studentTable.keySet();
        studentIDSet.forEach(s -> {
            System.out.println(s);
        });

        /*Iterating through the entrySet*/
        System.out.println("Iterating through the entrySet");
        Set<Map.Entry<Integer,String>> studentEntries =  studentTable.entrySet();
        studentEntries.forEach(entry -> {
            System.out.println(entry.getKey() + "," + entry.getValue());
        });

        /*Adding a map into map*/
        System.out.println("Adding a table into another hashtable");
        studentTable.putAll(new Hashtable<Integer,String>(){{
            this.put(5,"student5");
            this.put(6,"student6");
        }});
        printTable(studentTable);

        System.out.println("Checking if student table contains key for student 4: " + studentTable.containsKey(4));
        System.out.println("Checking if student table contains value for student4: " + studentTable.containsValue("student4"));

        Hashtable<Employee,String> employeeTable = new Hashtable(){{
            this.put(new Employee(1,100,"emp1"),"employee 1");
            this.put(new Employee(2,200,"emp2"),"employee 2");
            this.put(new Employee(3,300,"emp3"),"employee 3");
        }};
        printTable(employeeTable);

        System.out.println("Adding Employee 3 with vlaue as emp4:");
        /*Due to hashcode and equals function the following object is not added to the table as the key already exist
        * and only the value of the key is overridden "employee 3" becomes "employee 4" */
        employeeTable.put(new Employee(3,300,"emp3"),"employee 4");
        printTable(employeeTable);

        /*Getting the value for emp3*/
        System.out.println("Getting the value for emp3: ");
        System.out.println("Value for Employee object 3: " + employeeTable.get(new Employee(3,300,"emp3")));
    }

    static <K,V> void printTable(Hashtable<K,V> studentTable) {
        studentTable.forEach((k,v)->{
            System.out.println(k+ ": " + v);
        });
    }

    static void addValueInHashtable(Hashtable<Integer, String> student) {
        for (int i = 0; i < 5; i++) {
            student.put(i,"student" + i);
        }
    }
}
