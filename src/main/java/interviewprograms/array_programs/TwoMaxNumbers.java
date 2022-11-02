package interviewprograms.array_programs;

/***
 * Date: May 14, 2018
 * Desc:
 * Write a program to find top two maximum numbers in the
 * given array. You should not use any sorting functions. You
 * should iterate the array only once. You should not use any
 * kind of collections in java.
 */
public class TwoMaxNumbers {
    public static void main(String a[]){
        int num[] = {5,34,78,2,45,1,99,23};
        TwoMaxNumbers tmn = new TwoMaxNumbers();
        tmn.printTwoMaxNumbers(num);
    }

    private void printTwoMaxNumbers(int[] num) {
        int max1 = 0, max2 = 0;
        for (int n: num) {
            if(max2<n) {
                if (max1 < n) {
                    max2 = max1;
                    max1 = n;
                }
                else max2 = n;
            }
        }
        System.out.println(String.format("Max1: %d, Max2: %d",max1,max2));
    }
}
