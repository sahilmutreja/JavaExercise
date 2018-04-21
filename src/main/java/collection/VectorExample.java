package collection;

import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector<String> list = new Vector<>();
        fillVector(list);

        System.out.println("Printing all elements");
        printVector(list);

        System.out.println("Sorting the list in descending order.");
        list.sort((o1, o2) -> {
            return o2.compareTo(o1);
        });

        System.out.println("Printing all elements");
        printVector(list);

        System.out.println("Clearing the list and printing: ");
        list.clear();
        printVector(list);

        fillVector(list);
        Object[] arr = new Object[list.size()];
        list.copyInto(arr);
        System.out.println("Print the copied values in array:");
        for (Object o: arr) {
            System.out.println(o);
        }

        System.out.println("Sublist from 1 to 2");
        list.subList(0,3).forEach(e->{
            System.out.println(e);
        });

    }

    private static void fillVector(Vector<String> list) {
        list.add("FIRST");
        list.add("THIRD");
        list.add("SECOND");
    }

    private static void printVector(Vector<String> list) {
        list.forEach(s -> {
            System.out.println(s);
        });
    }
}