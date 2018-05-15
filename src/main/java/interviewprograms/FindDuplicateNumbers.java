package interviewprograms;

import java.util.ArrayList;

public class FindDuplicateNumbers {
    static int duplicate;

    public static void main(String[] args) {
        int[] a = {1,2,3,2,5};
        ArrayList al = new ArrayList();
        for (int i = 0; i < a.length; i++) {
            if(al.contains(a[i])) {
                duplicate = a[i];
                break;
            } else
                al.add(a[i]);
        }
        System.out.println(duplicate);
    }
}
