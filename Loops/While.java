package Loops;

public class While {
    public static void main(String[] args) {
        boolean loop = true;
        int i = 0;
        while (loop == true && i < 10) {
            System.out.println(loop);
            loop = !loop;
            ++i;
        }
    }
}
