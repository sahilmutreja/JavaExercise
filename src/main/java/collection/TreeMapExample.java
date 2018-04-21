package collection;

import java.util.HashMap;
import java.util.TreeMap;

public class TreeMapExample {

    public static void main(String[] args) {
        HashMap<Employee,String> empMap = new HashMap<>();
        empMap.put(new Employee(1,100,"A"),"employee 1");
        empMap.put(new Employee(3,300,"C"),"employee 3");
        empMap.put(new Employee(2,200,"B"),"employee 2");
        System.out.println("Adding duplicating values in hashmap.");
        empMap.put(new Employee(2,200,"B"),"employee 2");

        System.out.println("Printing the values of hash map");
        empMap.forEach((employee, s) -> System.out.println(employee + ": " + s));

        System.out.println("Printing the keys:");
        empMap.keySet().forEach(employee -> System.out.println(employee));

        System.out.println("Printing the values: ");
        empMap.values().forEach(s -> System.out.println(s));

        System.out.println("Printing the entries: ");
        empMap.entrySet().forEach(employeeStringEntry -> System.out.println(
                employeeStringEntry.getKey() + ": " + employeeStringEntry.getValue()
        ));

        TreeMap<Employee,String> empTreeMap = new TreeMap<>();
        empTreeMap.putAll(empMap);
        empTreeMap.forEach((employee, s) -> System.out.println(employee + ": " + s));

        TreeMap<Integer, String> simpleMap= new TreeMap(){{
            this.putIfAbsent(3,"three");
            this.putIfAbsent(1,"one");
            this.putIfAbsent(2,"two");
            this.putIfAbsent(5,"five");
            this.putIfAbsent(4,"four");
        }};

        simpleMap.forEach((integer, s) -> System.out.println(integer + ": " + s));
        System.out.println("simpleMap.headMap(3)" + simpleMap.headMap(3)); // Be dafault inclusive: false
        System.out.println("simpleMap.headMap(3)" + simpleMap.headMap(3,true));
        System.out.println("simpleMap.tailMap(3)" + simpleMap.tailMap(3)); // Be dafault inclusive: true
        System.out.println("simpleMap.tailMap(3)" + simpleMap.tailMap(3,false));
        System.out.println("simpleMap.subMap(3,true,5,true)" + simpleMap.subMap(3,true,5,true));
        System.out.println("simpleMap.subMap(3,5)" + simpleMap.subMap(3,5));
    }
}