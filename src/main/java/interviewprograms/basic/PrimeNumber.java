package interviewprograms.basic;

public class PrimeNumber {

    public static void main(String[] args) {
        int num = 18;
        boolean flag = true;
        for (int i = 2; i <= num/2; i++) {
            if(num%i==0){
                flag = false;
                break;
            }
        }
        System.out.println("Prime Number: " + flag);
    }

}
