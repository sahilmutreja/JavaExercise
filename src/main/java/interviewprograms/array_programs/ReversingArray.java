package interviewprograms.array_programs;

import java.io.*;
import java.util.*;

public class ReversingArray {

    /* Reversing in the same array

        for (int i = 0; i < a.length / 2; i++) {
                int temp = a[i];
                a[i] = a[a.length - i - 1];
                a[a.length - i - 1] = temp;
            }
        System.out.println();
            for (int i : a) {
                System.out.print(i+" ");
            }
    */

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 2, 1};
        int[] b = new int[a.length];
        int k = 0;

        for (int i : a) {
            System.out.print(i + " ");
        }
        for (int i = a.length - 1; i >= 0; i--) {

            b[k] = a[i];
            k++;
        }
        System.out.println();
        for (int i : b) {
            System.out.print(i + " ");
        }

        //Check for Palindrome
        System.out.println();
        if (eq(a, b)) {
            System.out.println("Palindrome");
        } else
            System.out.println("Not a Palindrome");
    }

    private static boolean eq(int a[], int b[]) {

        if (a.length != b.length)
            return false;

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i])
                return false;
        }
        return true;
    }

}