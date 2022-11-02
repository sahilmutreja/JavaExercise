package interviewprograms.string_programs;

public class ReversingStringRecursive {

    static String rev = "";
    static String reverse(String s){

        if(s.length()==1) {
            System.out.println("return s:" + s);
            return s;
        }
        else{
            System.out.println("returning s:" + s + " and rev: " + rev);
            rev += s.charAt(s.length()-1) + reverse(s.substring(0,s.length()-1));
            System.out.println("returning s:" + s + " and rev: " + rev);

            return rev;
        }
     }

    public static void main(String[] args) {
        String s1 = "gaurav";
        System.out.println("Reverse String = " + reverse(s1));
    }
}
