package interviewprograms;

class A {
    int x;
    static A obj;
    private A() {
    }

    public static A getInstance() {
        if (obj == null) obj = new A();
        obj.x += 10;
        return obj;
    }
}

class PracticeSingleton {
    public static void main(String[] args) {
        new PracticeSingleton().print1();
        new PracticeSingleton().print1();
        new PracticeSingleton().print1();
    }

    public void print1() {
        System.out.println("PracticeSingleton.getInstance().a="
                + A.getInstance().x);
    }
}

