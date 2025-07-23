package baitap.sapxepcchen;

public class InsertionSort {

    private static int[] list = {5, 2, 9, 1, 5, 6};

    public static void insertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
            System.out.print("Bước " + i + ": ");
            printArray(arr);
        }

        System.out.println("Mảng sau khi sắp xếp:");
        printArray(arr);
        System.out.println();
    }

    private static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }

    public static void main(String[] args) {
        System.out.println("Mảng ban đầu:");
        printArray(list);
        System.out.println();
        insertionSort(list);
    }
}
