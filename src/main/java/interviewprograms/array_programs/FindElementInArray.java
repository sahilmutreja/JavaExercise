package interviewprograms.array_programs;

class FindElementInArray {
    public static void main(String[] args) {
        // Find an element in the 2D array.
        // Keep sepearate functions for 1D and 2D

        int a[] = { 33, 20, 30, 40, 50 };
        System.out.println("Does the given element exit: " + findElementin1Darray(33, a));

        int b[][] = { { 0 }, { 10, 20 }, { 30, 40, 50 }, { 60, 50 } };
        System.out.println("Does the given element exist: " + findElementin2Darray(50, b));
    }

    private static boolean findElementin1Darray(int num, int[] ar) {
        for (int i = ar.length - 1; i >= 0; i--) {
            if (num == ar[i]) {
                System.out.println("ELement exist at:Row " + i );
                return true;
            }
        }
        return false;
    }

    private static boolean findElementin2Darray(int num, int[][] ar) {
        for (int i = ar.length - 1; i >= 0; i--) {
            for (int j = ar[i].length - 1; j >= 0; j--) {
                if (num == ar[i][j]) {
                    System.out.println("ELement exist at:Row " + i + ", Coloumn:" + j);
                    return true;
                }
            }
        }
        return false;
    }
}
