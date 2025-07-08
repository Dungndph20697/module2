import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array = {10, 4, 6, 7, 8, 3, 9, 0};
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap gia tri can xoa: ");
        int x = sc.nextInt();
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                index = i;
            }
        }

        if (index == -1) {
            System.out.println("Khong tim thay gia tri can xoa: ");
        } else {
            for (int i = index; i < array.length - 1; i++) {
                array[i] = array[i + 1];
            }
            array[array.length - 1] = 0;

            System.out.print("Mang sau khi xoa la: ");
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
        }
    }
}
