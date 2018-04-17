package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Author: Sahil Mutreja
 * Date: April 15, 2018
 * Iterator is just used to navigate on the collection object entries
 */
public class IteratorExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("FIST");
        list.add("SECOND");
        list.add("THIRD");
        list.add("FOURTH");
        Iterator<String> itr = list.iterator();
        System.out.println("BEFORE DELETION");
        list.forEach(item-> {System.out.println(item);});

        // REMOVING SECOND FROM THE LIST
        while(itr.hasNext()){
            if(itr.next().equalsIgnoreCase("SECOND"))
                itr.remove();
        }

        System.out.println("AFTER DELETION");
        list.forEach(item-> {System.out.println(item);});
    }
}
