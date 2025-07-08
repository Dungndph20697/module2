import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong mang thu nhat: ");
        int soLuongMang1 = sc.nextInt();
        int[] arr = new int[soLuongMang1];

        for (int i = 0; i < soLuongMang1; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Nhap so luong mang thu hai: ");
        int soLuongMang2 = sc.nextInt();
        int[] arr2 = new int[soLuongMang2];

        for (int i = 0; i < soLuongMang2; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
            arr2[i] = sc.nextInt();
        }

        int soLuongMang3 = soLuongMang1 + soLuongMang2;
        int[] arr3 = new int[soLuongMang3];
        for (int i = 0; i < arr.length; i++) {
            arr3[i] = arr[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arr3[soLuongMang1 + i] = arr2[i];
        }

        System.out.print("Mang 3 sau khi gop mang 1 va 2 la: ");
        for (int element : arr3) {
            System.out.print(element + " ");
        }
    }
}
