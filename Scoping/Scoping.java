package Scoping;

public class Scoping {
    static final int age = 20;

    public void myMethod() {
        System.out.println(age);
    }

    public static void main(String[] args) {
        System.out.println(age);
        Scoping obj = new Scoping();
        obj.myMethod();
    }

}
