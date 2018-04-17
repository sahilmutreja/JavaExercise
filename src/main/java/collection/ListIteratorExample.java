package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("FIRST");
        list.add("SECOND");
        list.add("THIRD");
        list.add("FOURTH");
        list.add("FIFTH");
        ListIterator<String> listItr = list.listIterator();

        System.out.println("Iterating list in forward direction");
        while(listItr.hasNext()){
            System.out.println(listItr.next());
        }
        System.out.println("Adding new element via list iterator: SIXTH");
        listItr.add("SIXTH");

        System.out.println("Iterating list in backward direction");
        while(listItr.hasPrevious()){
            System.out.println(listItr.previous());
        }
    }
}
