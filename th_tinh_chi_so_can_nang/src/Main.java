import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap can nang");
        double canNang = sc.nextDouble();

        System.out.print("Nhap can nang");
        double chieuCao = sc.nextDouble();

        double bmi = canNang / Math.pow(chieuCao, 2);

        if (bmi < 18) {
            System.out.println(bmi + " Underweight");
        } else if (bmi < 25.0) {

            System.out.println(bmi + " Normal");
        } else if (bmi < 30.0) {
            System.out.println(bmi + " Overweight");

        } else {
            System.out.println(bmi + " Obese");
        }

    }
}
