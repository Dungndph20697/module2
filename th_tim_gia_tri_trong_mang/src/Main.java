import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a name's student: ");
        String input = sc.nextLine();

        boolean check = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(input)) {
                System.out.println("Position of the students in the list " + input + " is: " + i);
                check = true;
                break;
            }
        }
        if (!check) {
            System.out.println("Not found" + input + " in the list.");
        }
    }
}
