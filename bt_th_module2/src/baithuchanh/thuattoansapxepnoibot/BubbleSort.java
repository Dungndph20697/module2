package baithuchanh.thuattoansapxepnoibot;

public class BubbleSort {

    static int[] list = {5, 1, 4, 2, 8, -3, -5, -1, 9, 0, 6, 7, 3, 10, -2, -4};

    public static void bubbleSort(int[] arr) {
        boolean neddNextPass = true;
        for (int k = 1; k < list.length && neddNextPass; k++) {
            neddNextPass = false;
            for (int i = 0; i < list.length - k; i++) {
                if (list[i] > list[i + 1]) {
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;
                    neddNextPass = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        bubbleSort(list);
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }
}
