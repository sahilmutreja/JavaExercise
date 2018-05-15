package interviewprograms;

public class SingletonClass {

    private static SingletonClass instance;

    private SingletonClass(){}

    static {
        instance = new SingletonClass();
    }

    public static void main(String[] args) {
        SingletonClass obj = SingletonClass.getInstance();
        obj.print();
    }

    private void print() {
        System.out.println("hello from singleton");
    }

    public static SingletonClass getInstance() {
        if(null!=instance) return instance;
        return null;
    }
}
