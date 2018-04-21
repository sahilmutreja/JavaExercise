package algorithms;

/**
 * Author: Sahil Mutreja
 * Date: April 21, 2018
 * Description: Algorithm to sort an an array
 */
public class SortingAlgo {

    public static void main(String[] args) {
        int[] values = {20, 1, 10, 4, 5};

        System.out.println("Sorting via Bubble Sort:");
        bubbleSort(values);
        printArray(values);

        System.out.println("Sorting via Selection Sort:");
        values = new int[]{20, 1, 10, 4, 5};
        selectionSort(values);
        printArray(values);

        System.out.println("Sorting via Insertion Sort:");
        values = new int[]{20, 1, 10, 4, 5};
        insertionSort(values);
        printArray(values);

    }

    private static void insertionSort(int[] values) {
        for (int i = 1; i < values.length; i++) {
            for (int j = i; j > 0 ; j--) {
                if(values[j]<values[j-1]){
                    int temp = values[j];
                    values[j] = values[j-1];
                    values[j-1] = temp;
                }
            }
        }
    }

    private static void selectionSort(int[] values) {
        int index;
        for (int i = 0; i < values.length; i++) {
            index = i;
            //Finding the location of the smallest element
            for (int j = i+1; j < values.length; j++) {
                if(values[index]>values[j]) index = j;
            }
            //Swapping the value of the current element with the smallest element
            int temp = values[i];
            values[i] = values[index];
            values[index] = temp;
        }
    }

    /**
     * @param values is the array to be sorted
     * @return sorted array
     */
    private static void bubbleSort(int[] values) {
        for (int count = 0; count < values.length; count++) {
            for (int j = 0; j < values.length-1; j++) {
                if (values[j] > values[j+1]) {
                    int temp = values[j];
                    values[j] = values[j+1];
                    values[j+1] = temp;
                }
            }
        }
    }

    private static void printArray(int[] values) {
        for (int a : values)
            System.out.print(a + "," );
        System.out.println();
    }

}
