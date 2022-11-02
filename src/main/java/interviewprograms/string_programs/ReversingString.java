package interviewprograms.string_programs;

public class ReversingString {

    static String rev = "";
    static String reverse(String s){

        if(s.length()==1) {
            System.out.println("return s:" + s);
            return s;
        }
        else{
            char[] charArray = s.toCharArray();
            for (int i = charArray.length-1; i >= 0; i--)
                rev+=charArray[i];
            return rev;
        }
     }

    public static void main(String[] args) {
        String s1 = "sahil";
        System.out.println("Reverse String = " + reverse(s1));
    }
}
