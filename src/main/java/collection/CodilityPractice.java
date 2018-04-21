package collection;
//Expectation: To get minimum count of sub groups to sort the array
//[1, 5, 4, 9, 8, 7, 12, 13, 14] = 6:  {1,(5,4),(9,8,7),12,13,14}
//[4, 3, 2, 6, 1] = 1 : (Full array cause 1 is at the end)

import java.util.Arrays;

//Sort giraffes in a sorting order with minimal number of groups
public class CodilityPractice {


    public static void main(String[] args) {
        int[] A = {1, 5, 4, 9, 8, 7, 12, 13, 14};
        System.out.println("Answer: " + new CodilityPractice().solution(A));
    }

    public int solution(int[] A) {
        int groupCount = 0;
        int minHeight, maxHeight = 0;
        for (int i = 0; i < A.length; i++) {

            if (i == A.length-1){
                if(A[i] > maxHeight)
                    groupCount++;
                continue;
            }

            if (maxHeight > A[i])
                continue;
            if (A[i] <= A[i + 1]) {
                groupCount++;
                maxHeight = A[i + 1];
                continue;
            }
            if (A[i] > A[i + 1]) {
                maxHeight = A[i];
                minHeight = A[i + 1];
                groupCount++;
                int[] B = Arrays.copyOfRange(A, i + 1, A.length);
                for (int j = i + 1; j < B.length; j++) {
                    if (B[j] < minHeight) i = j;
                }
            }
        }
        return groupCount;
    }
}
