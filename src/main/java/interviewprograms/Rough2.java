package interviewprograms;

public class Rough2 {
    public static void main(String[] args) {
        String a = "GauravMutreja";
        System.out.println(a);
        System.out.println("Deleting char a, v ,m");

        System.out.println("String after deleting above characters: " + charRemove(a, 'a', 'v', 'M'));

    }

    private static String charRemove(String a, char a1, char a2, char a3) {
        String newA = "";
        for (char i : a.toCharArray()) {
            if (i == a1 || i == a2 || i == a3)
                continue;
            else
                newA += i;

        }
        return newA;
    }
}
