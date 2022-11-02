package interviewprograms;

/**
 * Checking if two strings are rotations of each other
 */
public class RotationOfString {
    public static void main(String[] args) {
        System.out.println("Is Rotation: " + isRotation("xyza", "azxy"));
    }

    private static boolean isRotation(String original, String rotated) {
        int startIndex = 0;
        for (int i = 0; i < original.length(); i++) {
            if (rotated.charAt(0) == original.charAt(i)) {
                startIndex = i;
                break;
            }
        }

        StringBuilder newStringBuilder = new StringBuilder();
        while (newStringBuilder.length() < original.length()) {
            newStringBuilder.append(original.charAt(startIndex++));
            if (startIndex >= original.length()) startIndex = 0;
        }
        System.out.println("newStringBuilder = " + newStringBuilder);
        return newStringBuilder.toString().equals(rotated);
    }
}
