package interviewprograms.string_programs;

public class Rough {

    public static void main(String[] args) {
        occOfChar("gauravG");
        int ar[] = { 1, 2, 2, 3, 4, 5, 5, 5, 6};
        findMaxRepeated(ar);

    }

    static boolean isDuplicateOrSpaceCharacter(char searchChar, char[] charArray) {
        for (char eachChar : charArray) {
            if (eachChar == searchChar || searchChar == ' ')
                return true;
        }
        return false;
    }

    private static void occOfChar(String s1) {
        int occCount[] = new int[s1.length()];
        char visited[] = new char[s1.length()];

        for (int i = 0; i < s1.length() - 1; i++) {
            //check duplicate
            if (isDuplicateOrSpaceCharacter(s1.charAt(i), visited))
                continue;

            //initialize both arrays
            for (int k = i; k < s1.length(); k++) {
                if (String.valueOf(s1.charAt(i)).equalsIgnoreCase
                        (String.valueOf(s1.charAt(k)))) {
                    occCount[i]++;
                    visited[i] = s1.charAt(i);
                }
            }

            // use both arrays to answer the question
            if (occCount[i] > 1)
                System.out.println("Count of char " + s1.charAt(i) + " = " + occCount[i]);
        }
    }

    private static void findMaxRepeated(int ar[]) {
        int maxOcc = 0, mostReapeated = 0;
        int[] freq = new int[1000];
        for (int i = 0; i < ar.length; i++) {
            int index = ar[i];
            freq[index]++;
            if(maxOcc < freq[index]) {
                maxOcc = freq[index];
                mostReapeated = index;
            }
        }
        System.out.println("Most Repeated: "+mostReapeated);
    }
}


