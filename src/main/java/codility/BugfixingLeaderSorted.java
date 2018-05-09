package codility;

public class BugfixingLeaderSorted {

    public static void main(String[] args) {
        int[] a = {1,1,1,2,2,2,2};
        System.out.println(new BugfixingLeaderSorted().solution(a));
    }

    int solution(int[] A) {
        int n = A.length;
        int[] L = new int[n + 1];
        L[0] = -1;
        for (int i = 0; i < n; i++) {
            L[i + 1] = A[i];
        }
        int count = 0;
        int pos = (n+1) / 2;
        int candidate = L[pos];
        for (int i = 1; i <= n; i++) {
            if (L[i] == candidate)
                count = count + 1;
        }
        System.out.println("N: " + n);
        System.out.println("Candidate: " + candidate);
        System.out.println(String.format("Count: %d, Pos: %d",count,pos));
        if ((count*2) > n) // Incorrect Part: if (count > pos)
            return candidate;
        return (-1);
    }
}