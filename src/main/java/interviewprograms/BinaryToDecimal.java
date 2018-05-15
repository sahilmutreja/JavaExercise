package interviewprograms;

/***
 * Date: May 14, 2018 
 */
public class BinaryToDecimal {

    public static void main(String[] args) {
        BinaryToDecimal bd = new BinaryToDecimal();
        System.out.println("11 ===> "+bd.getDecimalFromBinary(11));
        System.out.println("110 ===> "+bd.getDecimalFromBinary(110));
        System.out.println("100110 ===> "+bd.getDecimalFromBinary(100110));
    }

    private int getDecimalFromBinary(int i) {
        String dec = String.valueOf(i);
        int num = 0;
        for (int j = 0; j < dec.length(); j++) {
            num = 2*num+Integer.parseInt(dec.substring(j,j+1));
        }
        return num;
    }

}
