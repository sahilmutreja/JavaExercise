package interviewprograms.string_programs;

/**
 * Print string without spaces
 */
public class RemoveSpacesFromString {
    public static void main(String[] args) {
        String message = "Hello World";
        System.out.println("String without spaces = " + withoutSpaces(message));
    }

    private static String withoutSpaces(String message) {
        String[] msg = message.split(" ");
        String msg2 = "";
        for (int i = 0; i < msg.length; i++) {
            msg2 += msg[i];
        }
        return msg2;
    }
}
