package collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String[] args) {

        LinkedList<String> list1 = new LinkedList<>();
        addItemsToLinkedList(list1);
        System.out.println(list1);
        System.out.println("Size: " + list1.size());
        System.out.println("Is it empty: " + list1.isEmpty());
        System.out.println("Does it contain Text 3: " + list1.contains("Text 3"));
        System.out.println("Does it contain Text 6: " + list1.contains("Text 6"));

        /*Clearing the list*/
        list1.clear();
        printLinkedList(list1);

        /*Adding element at the first position*/
        System.out.println("Adding Element to First position: ");
        addItemsToLinkedList(list1);
        list1.addFirst("Add First");
        printLinkedList(list1);
        list1.offerFirst("Offer First");
        printLinkedList(list1);

        /*Adding element at last position*/
        System.out.println("Adding Element to last position: ");
        list1.addLast("Add Last");
        System.out.println(list1);
        list1.offerLast("Offer Last");
        System.out.println(list1);
        list1.offer("offer");
        System.out.println(list1);

        /*Retrieve first element from the list*/
        /*Only poll and pollFirst removes the element from list rest functions dont remove*/
        String s = list1.element();
        System.out.println("Using element(): " + s);
        System.out.println(list1);
        s = list1.getFirst();
        System.out.println("Using getFirst(): " + s);
        System.out.println(list1);
        s = list1.pollFirst();
        System.out.println("Using pollFirst(): " + s);
        System.out.println(list1);
        s= list1.poll();
        System.out.println("Using poll(): " + s);
        System.out.println(list1);
        s = list1.peekFirst();
        System.out.println("Using peekFirst(): " + s);
        System.out.println(list1);
        s = list1.peek();
        System.out.println("Using peek(): " + s);
        System.out.println(list1);

        /*Retrieve lat element from the list*/
        s = list1.getLast();
        System.out.println("Using getLast(): " + s);
        System.out.println(list1);
        s = list1.peekLast();
        System.out.println("Using peekLast(): " + s);
        System.out.println(list1);
        s = list1.pollLast();
        System.out.println("Using pollLast(): " + s);
        System.out.println(list1);

        /*Iterating in reverse order*/
        System.out.println("Iterating in reverse order: ");
        Iterator<String> iterator = list1.descendingIterator();
        iterator.forEachRemaining(s1 -> {
            System.out.print(s1  + ",");
        });
        System.out.println();

        /*Using Push and Pop operations*/
        System.out.println("Using push and pop operations: ");
        list1.push("Sahil");
        System.out.println(list1);
        list1.pop();
        System.out.println(list1); //

        /*Remove Elements from the linkedList*/
        //list = [Text 1, Text 2, Text 3, Text 4, Text 5, Add Last, Offer Last]
        list1.remove(); // Text 1: [Text 2, Text 3, Text 4, Text 5, Add Last, Offer Last]
        list1.remove("Text 2"); // Text 2: [Text 3, Text 4, Text 5, Add Last, Offer Last]
        list1.remove(1); //Text 4: [Text 3, Text 5, Add Last, Offer Last]
        list1.removeFirst(); // Text 3: [Text 5, Add Last, Offer Last]
        list1.removeLast(); // Offer Last: [Text 5, Add Last]
        list1.removeFirstOccurrence("Text 5");
        list1.removeLastOccurrence("Add Last");
        System.out.println(list1);



    }

    private static void addItemsToLinkedList(LinkedList<String> list1) {
        list1.add("Text 1");
        list1.add("Text 2");
        list1.add("Text 3");
        list1.add("Text 4");
        list1.add("Text 5");
    }

    private static void printLinkedList(LinkedList<String> list1) {
        list1.forEach(s -> {
            System.out.print(s + ",");
        });
        System.out.println();
    }

}
