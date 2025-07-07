import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number: ");
        int number = sc.nextInt();
        if (number < 2) {
            System.out.println(number + " is not a prime");
        } else {
            boolean check = true;
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    check = false;
                }
            }
            if (check == true) {
                System.out.println(number + " is a prime");
            } else {
                System.out.println(number + " is not a prime");
            }

        }

    }
}
