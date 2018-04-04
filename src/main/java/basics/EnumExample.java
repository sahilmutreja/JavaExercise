package basics;

public class EnumExample {
    enum Enum1{
        FIRST,SECOND; // CONSTANTS are by default public static final
    }

    enum Enum2{
        FIRST(1),SECOND(2);

        int number;
        Enum2(int i) {
            number = i * i;
        }
    }

    enum Enum3 {
        FIRST {
            public int getNumber() {
                return 100;
            }
        },
        SECOND{
            public int getNumber() {
                return 200;
            }
        };
        abstract int getNumber();
    }

    public static void main(String[] args) {

        // Prints the constant string FIRST, SECOND
        System.out.println(Enum1.FIRST);
        System.out.println(Enum1.SECOND);

        // Initialzes the constant and returns the value
        System.out.println("i: " + Enum2.FIRST.number);
        System.out.println("i: " + Enum2.SECOND.number);

        // Initialzes the constant and executes the function and returns value
        System.out.println(Enum3.valueOf("FIRST").getNumber());
        System.out.println(Enum3.valueOf("SECOND").getNumber());

    }
}
