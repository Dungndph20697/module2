package baitap.docfilecsv;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Country> list = readFile("C:\\Users\\Admin\\Desktop\\codegym\\module_2\\module2\\bt_th_module2\\src\\baitap\\docfilecsv\\countries.csv");
        for (Country country : list) {
            System.out.println(country.toString());
        }
    }

    private static List<Country> readFile(String filePath) {
        List<Country> result = new ArrayList<>();
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new Exception();
            }

            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");
                if (parts.length == 3) {
                    int id = Integer.parseInt(parts[0].trim());
                    String code = parts[1].replaceAll("\"", "").trim();
                    String name = parts[2].replaceAll("\"", "").trim();
                    Country country = new Country(id, code, name);
                    result.add(country);
                }
            }
            br.close();
            System.out.println("Thành công");
        } catch (Exception e) {
            System.err.println("File không tồn tại!");
            e.printStackTrace();
        }
        return result;
    }
}
