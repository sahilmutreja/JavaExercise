package interviewprograms.basic;

public class FibonacciSeries {
    public static void main(String[] args) {
        int num = 5;
        int sum;
        int a = 0, b = 1;
        System.out.print(a + " " + b);
        int count = 2;
        while(count<num){
            sum = a+b;
            a = b;
            b = sum;
            System.out.print(" " + sum);
            count++;
        }

    }
}
