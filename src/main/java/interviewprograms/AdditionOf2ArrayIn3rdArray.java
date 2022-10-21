package interviewprograms;

public class AdditionOf2ArrayIn3rdArray {
    public static void main(String[] args) {
        int a1[] = {1, 2, 3, 4, 5};
        int a2[] = {6, 7, 8, 9, 10};
        int a3[] = new int[a1.length + a2.length];
        int i;
        int k = 0;

        for (i = 0; i < a1.length; i++) {
            a3[i] = a1[i];
        }

        for (; i < a3.length; i++) {
            a3[i] = a2[k];
            k++;
        }

        for(int j: a3)
        { System.out.print(j+" ");}

    }
}
