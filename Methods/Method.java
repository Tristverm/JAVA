package Methods;

public class Method {

    static void myMethod() {
        System.out.println("I just got executed!");
    };
    /*
     * Example Explained
     * 
     * myMethod() is the name of the method
     * static means that the method belongs to the Main class and not an object of
     * the Main class. You will learn more about objects and how to access methods
     * through objects later in this tutorial.
     * void means that this method does not have a return value. You will learn more
     * about return values later in this chapter
     * 
     */

    // To call a method - remember that for this to work, the method should be static
    public static void main(String[] args) {
        myMethod();
    }
}
