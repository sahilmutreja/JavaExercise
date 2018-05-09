package codility;

public class BugFixingMaxOneSpan {
    public static void main (String[] args){
        BugFixingMaxOneSpan test = new BugFixingMaxOneSpan();

        int[] A = {0,1,1,1,0,1,1,1,0,1};
        System.out.println(test.solution(A));

        int[] B = {0,0};
        System.out.println(test.solution(B));
    }

    // returns starting position which starts the most number of 1's
    public int solution (int[] A){

        int count = 0;
        int maxcount = 0;
        int startingIndex = -1;

        for (int i = 0; i <A.length; i++){
            if (A[i] == 1){
                count++;
            } else if (A[i] == 0){
                if (maxcount < count){
                    maxcount = count;
                    startingIndex = i - count; //when i = 0, not when 1
                }
                count = 0;
            }
        }
        return startingIndex;
    }
}