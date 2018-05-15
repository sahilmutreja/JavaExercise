package interviewprograms;

public class NumberSumRecursive {
    static int sum = 0;
    public static void main(String[] args) {
        int num = 2334;
        System.out.println("Sum of digits: " + sumOfDigits(num));
    }

    private static int sumOfDigits(int num) {
        if(num==0) return 0;
        sum += num%10+sumOfDigits(num/10);
        return sum;
    }

}
