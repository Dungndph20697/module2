import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("---------------MENU---------------");
        int choice;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("1. Tim so nguyen to");
            System.out.println("2. Tim UCLN");
            System.out.println("0. Thoat");
            System.out.print("Moi chon chuc nang: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Nhap so bat ky: ");
                    int number = sc.nextInt();
                    boolean check = true;
                    for (int i = 2; i < Math.sqrt(number); i++) {
                        if (number % i == 0) {
                            check = false;
                        }
                    }
                    if (check == true) {
                        System.out.println(number + " la so nguyen to");
                    } else {

                        System.out.println(number + " khong phai la so nguyen to");
                    }
                    break;
                case 2:
                    System.out.print("Moi nhap so thu nhat: ");
                    int number1 = sc.nextInt();
                    System.out.print("Moi nhap so thu hai: ");
                    int number2 = sc.nextInt();
                    while (number2 != 0) {
                        int r = number1 % number2;
                        number1 = number2;
                        number2 = r;
                    }
                    System.out.println(number1 + " la uoc chung lon nhat");
                    break;
                case 0:
                    System.out.println("Hẹn gặp lại!");
                    break;
                default:
            }
        } while (choice != 0);
    }
}
