package interviewprograms;

import java.util.*;

public class DuplicateCharInString {

    public static void main(String a[]){
        DuplicateCharInString dcs = new DuplicateCharInString();
        dcs.findDuplicateChars("Java2Novice");
    }

    private void findDuplicateChars(String s) {
        Map<Character,Integer> dupMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if(dupMap.containsKey(s.charAt(i)))
                dupMap.put(s.charAt(i),dupMap.get(s.charAt(i))+1);
            else
                dupMap.put(s.charAt(i),1);
        }
        for (Map.Entry<Character,Integer> kv:dupMap.entrySet())
            if(kv.getValue()>1) System.out.println(kv.getKey() + ": " + kv.getValue());
    }
}
