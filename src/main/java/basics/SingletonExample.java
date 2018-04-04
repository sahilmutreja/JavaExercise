package basics;

/**
 * Author: Sahil Mutreja
 * Date: April 5, 2018
 * Description: Singleton Class practicec
 */


class SingletonClass {

    private static SingletonClass obj;

    // Declare a private constructor
    private SingletonClass() {
    }

    // Static method to get instance
    public static SingletonClass getInstance() {
        if(null == obj) obj = new SingletonClass();
        return obj;
    }


    public void print() {
        System.out.println("Hello World :)");
    }
}

public class SingletonExample {

    public static void main(String[] args) {
        SingletonClass obj = SingletonClass.getInstance();
        obj.print();
    }
}
