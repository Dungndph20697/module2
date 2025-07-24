package baitap.thuattoansapxepchen;

public class InsertionSort {
    private static int[] list = {5, 2, 9, 1, 5, 6};

    public static void insertionSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int key = list[i];
            int j = i - 1;

            while (j >= 0 && list[j] > key) {
                list[j + 1] = list[j];
                j--;
            }

            list[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        System.out.println("Mảng ban đầu:");
        for (Integer i : list) {
            System.out.print(i + " ");
        }
        insertionSort(list);
        System.out.println("Mảng sau khi sap xep:");
        for (Integer i : list) {
            System.out.print(i + " ");
        }
    }
}
