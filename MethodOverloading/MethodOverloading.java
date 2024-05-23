package MethodOverloading;
/*
 * Method overloading in Java is a feature that allows a class to have more than one method with the same name, provided their parameter lists are different. 
 * This means that within the same class, you can define multiple methods that share the same name but differ in the type or number of parameters.
 * Different Parameter List: The methods must have different parameter lists (different type, number, or both)
 */

public class MethodOverloading {
    // Overloaded method with one parameter
    public static void print(String message) {
        System.out.println(message);
    }

    // Overloaded method with two parameters
    public void print(String message, int number) {
        System.out.println(message + " " + number);
    }

    // Overloaded method with different parameter types
    public void print(int number) {
        System.out.println("Number: " + number);
    }

    public static void main(String[] args) {
        // instantiating
        MethodOverloading example = new MethodOverloading();

        // Calling the overloaded methods
        print("Hello");
        example.print("Number is", 10);
        example.print(20);
        print("HY");
    }
}
