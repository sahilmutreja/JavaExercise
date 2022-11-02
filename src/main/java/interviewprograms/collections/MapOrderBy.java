package interviewprograms.collections;

import java.util.*;

public class MapOrderBy {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("java", 20);
        map.put("C++", 45);
        map.put("Java2Novice", 2);
        map.put("Unix", 67);
        map.put("MAC", 26);
        map.put("Why this kolavari", 93);

        System.out.println("Before Sorting: " + map);

        // Collections.sort() method only takes List datatype as first argument
        List<Map.Entry<String,Integer>> list = new ArrayList<>(map.entrySet());

        Collections.sort(list,(o1, o2) -> o1.getValue().compareTo(o2.getValue()));
        System.out.println("Sorted By value ascending: " + list);

        Collections.sort(list,(o1, o2) -> o2.getValue().compareTo(o1.getValue()));
        System.out.println("Sorted By value desc: " + list);

        Collections.sort(list,(o1, o2) -> o1.getKey().compareTo(o2.getKey()));
        System.out.println("Sorted By key ascending: " + list);

        Collections.sort(list,(o1, o2) -> o2.getKey().compareTo(o1.getKey()));
        System.out.println("Sorted By key desc: " + list);
    }

}
