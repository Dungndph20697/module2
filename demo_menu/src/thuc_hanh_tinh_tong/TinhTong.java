package thuc_hanh_tinh_tong;

import java.util.ArrayList;
import java.util.List;

public class TinhTong {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(sum(numbers));
    }

    private static int sum(int[] arr) {
        int sum = 0;
        for (int element :
                arr) {
            sum += element;
        }
        return sum;
    }
}
