package Strings;

//A String in Java is actually an object, which contain methods that can perform certain operations on strings

public class StringMethods {
    public static void main(String[] args) {
        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("The length of the txt string is: " + txt.length());
        System.out.println(txt.toUpperCase()); // Outputs "HELLO WORLD"
        System.out.println(txt.toLowerCase()); // Outputs "hello world"
        System.out.println(txt.indexOf("locate")); // Outputs 7

    }
}
