package baitap.demsolanxuathiencuamoitutrongchuoi;

import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập chuỗi: ");
        String input = sc.nextLine();

        input = input.toLowerCase();

        StringTokenizer tokenizer = new StringTokenizer(input, " ,.!?;:-()[]{}\"'");

        TreeMap<String, Integer> wordMap = new TreeMap<>();

        while (tokenizer.hasMoreTokens()) {
            String word = tokenizer.nextToken();

            if (wordMap.containsKey(word)) {
                wordMap.put(word, wordMap.get(word) + 1);
            } else {
                wordMap.put(word, 1);
            }
        }

        System.out.println("Tần suất xuất hiện của các từ:");
        for (Map.Entry<String, Integer> entry : wordMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
