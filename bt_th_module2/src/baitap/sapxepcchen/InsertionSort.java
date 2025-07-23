package baitap.sapxepcchen;

public class InsertionSort {

    private static int[] list = {5, 2, 9, 1, 5, 6};

    public static void insertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i]; // phần tử cần chèn
            int j = i - 1;

            // Di chuyển các phần tử lớn hơn key về phía sau
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }

        System.out.println("Mảng sau khi sắp xếp:");
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("Mảng ban đầu:");
        for (int value : list) {
            System.out.print(value + " ");
        }
        System.out.println();
        insertionSort(list);
    }
}
