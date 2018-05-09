package codility;

import static org.junit.Assert.assertEquals;

public class BugfixingNails {

    static int solution(int[] A, int K) {
        int n = A.length;
        int best = 1;
        int count = 1;
        for (int i = 0; i < n - K - 1; i++) {
            if (A[i] == A[i + 1])
                count = count + 1;
            else
                count = 1;
            if (count > best)
                best = count;
        }
        int result = best + K;

        return (result > n) ? n : result;
    }

    public static void main(String[] args) {
        assertEquals(5, solution(new int[]{1, 1, 3, 3, 3, 4, 5, 5, 5, 5}, 2));
        assertEquals(4, solution(new int[]{1, 1, 3, 3, 3, 4, 5, 5, 5, 5}, 0));
        assertEquals(5, solution(new int[]{5, 5, 5, 5, 5}, 5));
        assertEquals(5, solution(new int[]{5, 5, 5, 5, 5}, 2));
        assertEquals(5, solution(new int[]{5, 5, 5, 5, 5}, 0));
        assertEquals(1, solution(new int[]{1, 2, 3, 4, 5}, 0));
        assertEquals(2, solution(new int[]{1, 2, 3, 4, 5}, 1));
        assertEquals(3, solution(new int[]{1, 2, 3, 4, 5}, 2));
        assertEquals(4, solution(new int[]{1, 2, 3, 4, 5}, 3));
        assertEquals(5, solution(new int[]{1, 2, 3, 4, 5}, 4));
        assertEquals(5, solution(new int[]{1, 2, 3, 4, 5}, 5));
        assertEquals(4, solution(new int[]{5, 5, 5, 5, 6}, 0));
        assertEquals(5, solution(new int[]{5, 5, 5, 5, 6}, 1));
        assertEquals(3, solution(new int[]{1, 2, 5, 5, 5}, 1));
        assertEquals(3, solution(new int[]{1, 2, 5, 5, 5}, 0));
        assertEquals(4, solution(new int[]{1, 2, 5, 5, 5}, 3));
    }
}

