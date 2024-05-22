package Arrays;

public class Array {
    public static void main(String[] args) {
        String[] students = { "Emmanuel", "Kimani", "Zipo", "Mutinda" };
        // To change an array element
        students[0] = "Kimeu";
        // Acessing array length;
        System.out.println(students.length);

        // Looping through an array using for loop
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
        // looping through using for each loop
        for (String student : students) {
            if (student == students[3]) {

                break;
            } else {
                System.out.println(student);
                continue;
            }
        }
    };

}
