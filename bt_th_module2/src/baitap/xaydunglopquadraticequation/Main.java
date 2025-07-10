package baitap.xaydunglopquadraticequation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a: ");
        double a = sc.nextDouble();

        System.out.print("Nhap b: ");
        double b = sc.nextDouble();

        System.out.print("Nhap c: ");
        double c = sc.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);

        if (quadraticEquation.getDiscriminant() > 0) {
            System.out.println("Nghiem thu 1 la: " + quadraticEquation.getRoot1());
            System.out.println("Nghiem thu 2 la: " + quadraticEquation.getRoot2());
        } else if (quadraticEquation.getDiscriminant() == 0) {
            System.out.println("Phuong trinh co nghiem duy nhat la: " + quadraticEquation.getRoot1());
        } else {
            System.out.println("Phuong trinh vo nghiem");
        }
    }
}
