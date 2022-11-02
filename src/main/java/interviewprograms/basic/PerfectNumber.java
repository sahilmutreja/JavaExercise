package interviewprograms.basic;

public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println("Perfect Number: " + isPerfectNumber(6));
        System.out.println("Perfect Number: " + isPerfectNumber(10));
    }

    private static boolean isPerfectNumber(int num) {
        boolean flag = false;
        int sum = 0;
        for (int i =1; i <= num/2; i++)
            if(num%i==0) sum+=i;
        return (sum==num);
    }
}
