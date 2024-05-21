package ConditionalStatements;

public class Conditional {
    /*
     * Java has the following conditional statements:
     * 
     * Use if to specify a block of code to be executed, if a specified condition is
     * true
     * Use else to specify a block of code to be executed, if the same condition is
     * false
     * Use else if to specify a new condition to test, if the first condition is
     * false
     * Use switch to specify many alternative blocks of code to be executed
     * 
     */
    public static void main(String[] args) {
        if (20 > 18) {
            System.out.println("20 is greater than 18");
        }
        ;
        int time = 20;
        if (time < 18) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        } // Outputs "Good evening."
        int number = 22;
        if (number < 10) {
            System.out.println("Good morning.");
        } else if (time < 18) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }
        // using a ternary operator
        String result = (time < 18) ? "Good day." : "Good evening.";
        System.out.println(result);
    }
}
