package baithuchanh.dunghashmaplinkedhashmaptreemapluudanhsachsinhvien;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Nguyen Van A", 20);
        map.put("Nguyen Van B", 22);
        map.put("Nguyen Van C", 21);
        map.put("Nguyen Van D", 23);
        System.out.println("Display entries in the hashmap:");
        System.out.println(map + "\n");

        Map<String, Integer> treeMap = new TreeMap<>();
        System.out.println("Display entries in the ascending oder of key:");
        System.out.println(treeMap);

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
        linkedHashMap.put("Smith", 30);
        linkedHashMap.put("Anderson", 31);
        linkedHashMap.put("Lewis", 29);
        linkedHashMap.put("Cook", 29);
        System.out.println("\nThe age for " + "Lewis is " + linkedHashMap.get("Lewis"));
    }
}
