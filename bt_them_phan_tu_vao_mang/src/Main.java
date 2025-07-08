import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = {10, 4, 6, 7, 8, 0, 0, 0, 0, 0};
        int size = 5;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap gia tri can them: ");
        int value = sc.nextInt();
        System.out.print("Nhap vi tri can them: ");
        int index = sc.nextInt();


        if (index < 0 || index >= arr.length) {
            System.out.println("Vi tri khong hop le");
        } else {
            for (int i = size; i > index; i--) {
                arr[i] = arr[i - 1];
            }
            arr[index] = value;
            size++;

            System.out.print("Mang sau khi them la: ");
            for (int element : arr) {
                System.out.print(element + " ");
            }
        }
    }
}
