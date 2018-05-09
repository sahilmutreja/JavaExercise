package codility;

public class BugFixConsecutiveIntegers {
    /*public static void main(String[] args) {
        int[] A = {1,200,450,5,900,10000,350,9};
        int K = 10000;
        //solution PhoneBillCallLogs;
        boolean s = BugFixConsecutiveIntegers.solution(A, K);
        System.out.println("Output is "+s);
    }

    public static boolean solution (int[] A, int K) {
        int n = A.length;
        int s = 0;
		*//*for (int i = 0; i <= n - 1; i++) {
			if (A[i] + 1 < A[i + 1])
				return false;
			}
		if (A[0] != 1 && A[n - 1] != K)
			return false;
		else
			return true;*//*
        for (int i = 0; i <= n - 1; i++) {
            if(A[i]==K)
                s=A[i];
        }
        if(s==K)
            return true;
        else
            return false;
    }*/
}
