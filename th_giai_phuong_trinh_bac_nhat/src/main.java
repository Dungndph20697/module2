import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a: ");
        double a = sc.nextDouble();
        System.out.print("Nhap b: ");
        double b = sc.nextDouble();
        System.out.print("Nhap c");
        double c = sc.nextDouble();

        if (a != 0) {
            double delta = (c - b) / a;
            System.out.println("Phương trình có nghiệm là " + delta);
        } else {
            if (b == c) {
                System.out.println("Phương trình có vô số nghiệm");
            } else {
                System.out.println("Phương trình vô nghiệm");
            }
        }
    }
}
