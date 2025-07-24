package baitap.lopillegaltriangleexception;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Nhập cạnh thứ nhất: ");
            double a = scanner.nextDouble();

            System.out.print("Nhập cạnh thứ hai: ");
            double b = scanner.nextDouble();

            System.out.print("Nhập cạnh thứ ba: ");
            double c = scanner.nextDouble();

            checkTriangle(a, b, c);
        } catch (InvalidTriangleException e) {
            System.err.println("Lỗi: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Đã xảy ra lỗi không xác định: " + e.getMessage());
        }
    }

    public static void checkTriangle(double a, double b, double c) throws InvalidTriangleException {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new InvalidTriangleException("Cạnh tam giác phải là số dương.");
        }
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new InvalidTriangleException("Tổng hai cạnh bất kỳ phải lớn hơn cạnh còn lại.");
        }
    }
}
