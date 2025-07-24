package baithuchanh.lopnumberformatexception;

import java.util.Scanner;

public class CalculationExample {

    public static void main(String[] args) {
        Scanner scanner = new  Scanner(System.in);
        System.out.print("Nhap x:");
        int x = scanner.nextInt();
        System.out.print("Nhap y:");
        int y = scanner.nextInt();
        CalculationExample calc = new CalculationExample();
        calc.calculate(x, y);
    }

    private void calculate(int x, int y) {
        try {
            int a = x + y;
            int b = x - y;
            int c = x * y;
            int d = x / y;
            System.out.println("Tong: " + a);
            System.out.println("Hieu: " + b);
            System.out.println("Tich: " + c);
            System.out.println("Thuong: " + d);
        }catch (Exception e) {
            System.err.println("Loi: " + e.getMessage());
        }
    }
}
