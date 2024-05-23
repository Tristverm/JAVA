package MethodParameters;

public class MethodParameters {
    static String myMethod(String fName) {
        return "My name is " + fName;
    };

    public static void main(String[] args) {
        System.out.println(myMethod("Emmmanuel"));
        System.out.println(myMethod("Kimeu"));
        System.out.println(myMethod("Kyalo"));
        System.out.println(myMethod("Munuve"));
        System.out.println(myMethod("Kimweli"));
    }
}
