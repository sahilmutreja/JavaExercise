package interviewprograms;

public class Singleton2 {
    public static void main(String[] args) {
        Abc obj1 = Abc.getInstance();
        Abc obj2 = Abc.getInstance();

    }
}

class Abc {
    int a =0;
    static Abc obj = new Abc();

    private Abc(){}

    public static Abc getInstance(){
        obj.a+=10;
        System.out.println("a = " + obj.a);
        return obj;
    }
}
/*

        Abc obj1 = Abc.getInstance(); // even though we create a different obj,
        System.out.println("a: " + obj1.a);

        Abc obj2 = Abc.getInstance(); // everytime we get the same instance as new keyword is not being used.
        System.out.println("a: " + obj2.a);
    }
}

class Abc {
    int a = 0;
    static Abc obj = new Abc();

    private Abc() { }

    public static Abc getInstance() {
        obj.a = obj.a + 10;
        return obj;
    }
}
*/


