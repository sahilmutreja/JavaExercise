package interviewprograms;

public class ReversingString {

    static String rev = "";
    static String reverse(String s){

        if(s.length()==1) {
            System.out.println("return s:" + s);
            return s;
        }
        else{
            char[] sArr = s.toCharArray();
            for (int i = sArr.length-1; i >= 0; i--)
                rev+=sArr[i];
            return rev;
        }
     }

    public static void main(String[] args) {
        String s1 = "sahil";
        System.out.println("Reverse String = " + reverse(s1));
    }
}
