package baitap.btdaonguocphantutrongstack;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
//        ReverseArrayUsingStack();

        ReverseWordsUsingStack ();
    }

    private static void ReverseWordsUsingStack () {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuoi: ");
        String input = sc.nextLine();

        String[] words = input.split("\\s+");
        Stack<String> wStack = new Stack<>();

        for (String word : words) {
            wStack.push(word);
        }

        StringBuilder outp = new StringBuilder();
        while (!wStack.isEmpty()) {
            outp.append(wStack.pop()).append(" ");
        }

        System.out.println("Chuỗi sau khi đảo thứ tự từ:");
        System.out.println(outp.toString().trim());
    }

    private static void ReverseArrayUsingStack() {
        Stack<Integer> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong phan tu: ");
        int n = sc.nextInt();
        int[] a = new int[n];

        System.out.println("Nhập các phần tử:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            stack.push(a[i]);
        }

        for (int i = 0; i < n; i++) {
            a[i] = stack.pop();
        }

        System.out.println("Mảng sau khi đảo ngược:");
        for (int num : a) {
            System.out.print(num + " ");
        }
    }
}
