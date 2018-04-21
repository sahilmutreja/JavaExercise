package algorithms;

import java.util.Arrays;

/**
 * Author: Sahil Mutreja
 * Date: April 18, 2018
 * Description: Algorithm to search an element in an array
 */
public class SearchingAlgo {

    public static void main(String[] args) {
        int[] values = {1, 4, 5, 10, 20};
        System.out.println("Searching position of element via Sequential/Linear Search: " + sequentialSearch(2, values));
        System.out.println("Searching position of element via Binary Search: " + binarySearch(2, values));
        System.out.println("Searching position of element via Binary Search: " + recursiveBinarySearch(values,0, values.length-1,2));
    }

    public static int recursiveBinarySearch(int[] sortedArray, int start, int end, int key) {

        if (start < end) {
            int mid = start + (end - start) / 2;
            if (key < sortedArray[mid]) {
                return recursiveBinarySearch(sortedArray, start, mid, key);

            } else if (key > sortedArray[mid]) {
                return recursiveBinarySearch(sortedArray, mid+1, end , key);

            } else {
                return mid+1;
            }
        }
        return -1;
    }

    private static int binarySearch(int search, int[] values) {
        int start = 0, mid,end = values.length-1;
        Arrays.sort(values);        // Binary Search works only on sorted arrays
        while(start<=end){
            mid = (start + end)/2;
            if(search == values[mid])return mid+1;
            if(search <= values[mid]) end = mid - 1;
            if(search >= values[mid]) start = mid + 1;
        }
        return -1;
    }

    private static int sequentialSearch(int searchItem, int[] values) {
        for (int j = 0; j < values.length; j++) {
            if(values[j]==searchItem){
                return j+1;
            }
        }
        return -1;
    }
}
