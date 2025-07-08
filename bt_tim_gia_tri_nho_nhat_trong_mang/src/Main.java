import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong cua mang: ");
        int soLuongMang = sc.nextInt();
        int[] arr = new int[soLuongMang];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Phan tu thu " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Mang vua nhap la: ");
        for (int e : arr) {
            System.out.print(e + " ");
        }

        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }

        System.out.println("Gia tri nho nhat trong mang la " + min);

    }
}
