package interviewprograms.string_programs;

/*
Remove the characters of the 2nd string from the 1st string and print
 */

public class Remove1stStringContentsFrom2ndString {
    public static void main(String[] args) {
        String s1 = "Sahil";
        String s2 = "al";
        System.out.println("S1 without s2 characters: " + resultUsingReplace(s1, s2));
        System.out.println("S1 without s2 characters: " + resultUsingSplitJoin(s1, s2));
        System.out.println("S1 without s2 characters: " + resultUsingStringBuilder(s1, s2));
    }

    static String resultUsingReplace(String s1, String s2) {
        for (char c : s2.toCharArray()) {
            s1 = s1.replace(String.valueOf(c), "");
        }
        return s1;
    }

    static String resultUsingSplitJoin(String s1, String s2) {
        for (int i = 0; i < s2.length(); i++) {
            String[] ar = s1.split(String.valueOf(s2.charAt(i)));
            s1 = String.join("", ar);
        }
        return s1;
    }

    static String resultUsingStringBuilder(String s1, String s2) {
        StringBuilder s3 = new StringBuilder(s1);
        for (int i = 0; i < s2.length(); i++) {
            char c = s2.charAt(i);
            int index = s3.indexOf(String.valueOf(c));
            if (index >= 0) {
                s3.deleteCharAt(index);
            }
        }
        return s3.toString();
    }
}
