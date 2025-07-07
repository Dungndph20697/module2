import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter money: ");
        double money = sc.nextDouble();

        System.out.print("Enter months: ");
        int month = sc.nextInt();

        System.out.print("Enter months: ");
        double interesRate = sc.nextDouble();
        ;

        double totalInterest = 0;

        for (int i = 0; i < month; i++) {
            totalInterest += money * (interesRate / 100) / 12 * month;
        }

        System.out.println("Total of interest: " + totalInterest);

    }
}
