package interviewprograms.basic;

/***
 * Date: May 14, 2018
 * Desc:
 * Armstrong numbers are the sum of their own digits to the power of
 * the number of digits. It is also known as narcissistic numbers.
 */
public class ArmstrongNumber {

    public static void main(String[] args) {
        ArmstrongNumber man = new ArmstrongNumber();
        System.out.println("Is 371 Armstrong number? "+man.isArmstrongNumber(371));
        System.out.println("Is 523 Armstrong number? "+man.isArmstrongNumber(523));
        System.out.println("Is 153 Armstrong number? "+man.isArmstrongNumber(153));
    }

    private boolean isArmstrongNumber(int num) {
        int power = String.valueOf(num).length();
        int sum = 0;
        int oNum = num;
        while(num>0){
            int t = num%10;
            num/=10;
            sum+= Math.pow(t,power);
        }
        return (sum==oNum);
    }

}
