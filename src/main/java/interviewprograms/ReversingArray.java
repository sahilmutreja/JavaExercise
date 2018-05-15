package interviewprograms;

import java.io.*;
import java.util.*;

public class ReversingArray {

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        for (int i = 0; i <a.length/2; i++) {
            int temp = a[i];
            a[i] = a[a.length-i-1];
            a[a.length-i-1] = temp;
        }
        for (int i:a) {
            System.out.print(i);
        }
    }

}