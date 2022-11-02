package interviewprograms;

public class ReverseNumber {
    public static void main(String[] args) {
        int a = 12345;
        int sum = 0;
        System.out.println("Number is " + a);
        while(a>0){
            sum = (sum*10) + a%10;
            a = a/10;
        }
        System.out.println("Reversed Number is " + sum);
    }
}
