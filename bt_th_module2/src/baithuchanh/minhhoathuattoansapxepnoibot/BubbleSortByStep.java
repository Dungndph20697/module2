package baithuchanh.minhhoathuattoansapxepnoibot;

import java.util.Scanner;

public class BubbleSortByStep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter list size:");
        int size = scanner.nextInt();
        int[] list = new int[size];
        System.out.println("Enter " + list.length + " values:");
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }
        System.out.print("Your input list: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println("\nBegin sort processing...");
        bubbleSort(list);
    }

    public static void bubbleSort(int[] arr) {
        boolean neddNextPass = true;
        for (int k = 1; k < arr.length && neddNextPass; k++) {
            neddNextPass = false;
            for (int i = 0; i < arr.length - k; i++) {
                if (arr[i] > arr[i + 1]) {
                    System.out.println("Swap " + arr[i] + " and " + arr[i + 1]);
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    neddNextPass = true;
                }
            }

            if (neddNextPass == false) {
                System.out.println("Aray may be sorted and next pass not needed");
                break;
            }
            System.out.print("List after the " + k + " sort: ");
            for (int j = 0; j < arr.length; j++) {
                System.out.println(arr[j] + " ");
            }
            System.out.println();
        }
    }
}
