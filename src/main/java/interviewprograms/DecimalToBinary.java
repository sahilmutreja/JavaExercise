package interviewprograms;

public class DecimalToBinary {

    public static void main(String[] args) {
        int i = 0, num = 25;
        int[] binary = new int[30];

        while(num>0){
            binary[i++] = num%2;
            num/=2;
        }

        for (int j = 0; j <i; j++) {
            System.out.print(binary[j]);
        }
    }

}