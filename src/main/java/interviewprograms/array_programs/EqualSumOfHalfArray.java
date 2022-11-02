package interviewprograms.array_programs;

public class EqualSumOfHalfArray {
    public static void main(String[] args) {
        int[] num = { 2, 4, 4, 5, 4, 1 };
        try {
            System.out.println("Starting from index 0, adding numbers till index "
                    + findMiddleIndex(num) + " and");
            System.out.println("adding rest of the numbers can be equal");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    private static String findMiddleIndex(int[] num) {
        int startIndex = 0;
        int endIndex = num.length-1;
        int leftSum = 0;
        int rightSum = 0;

        while(true){
            if(leftSum<rightSum)
                leftSum+=num[startIndex++];
            else
                rightSum+=num[endIndex--];
            if(startIndex>endIndex){
                if(leftSum==rightSum) break;
                else {
                    return "Not proper values passed";
                }
            }
        }
        return String.valueOf(endIndex);
    }
}
