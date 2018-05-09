package codility;

public class Bugfixingconsecutiveintegers {

    public static void main(String[] args) {

        Bugfixingconsecutiveintegers test = new Bugfixingconsecutiveintegers();
        int[] A = {1,1,2,3,3};
        int K = 2;
        System.out.println(test.solution(A, K));
        int[] AA = {1,1,3};
        int KK = 2;
        System.out.println(test.solution(AA, KK));

        int[] AAA = {1,2,3,4,5,6,7,8,9};
        int KKK = 8;
        System.out.println(test.solution(AAA, KKK));
    }
    public boolean solution (int[] A, int K){
        boolean isFound = false;
        for (int i = 1; i<= K ; i++){
            isFound = false;
            for (int j = 0; j < A.length; j++){
                if (A[j] == i){
                    isFound = true;
                }
            }
            if (!isFound){
                return isFound;
            }
        }
        return isFound;
    }

}

