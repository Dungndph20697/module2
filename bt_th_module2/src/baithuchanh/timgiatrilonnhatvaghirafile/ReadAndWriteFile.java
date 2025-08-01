package baithuchanh.timgiatrilonnhatvaghirafile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {

    public List<Integer> readFile(String filePath) {
        List<Integer> numbers = new ArrayList<>();
        try {
            File file = new File(filePath);

            if (!file.exists()) {
                throw new FileNotFoundException();
            }

            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = br.readLine())!= null){
                numbers.add(Integer.parseInt(line));
            }
            br.close();
        }catch (Exception e){
            System.err.println("File không tồn tại hoặc nội dung có lỗi!");
        }
        return numbers;
    }

    public void writeFile(String filePath, int max) {
        try {
            FileWriter writer = new FileWriter(filePath,true);
            BufferedWriter bw = new BufferedWriter(writer);
            bw.write("Giá trị lớn nhất là: " + max);
            bw.close();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int findMax(List<Integer> numbers){
        int max = numbers.get(0);
        for(int i = 1; i < numbers.size(); i++){
            if(numbers.get(i) > max){
                max = numbers.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> numbers = readAndWriteFile.readFile("C:\\Users\\Admin\\Desktop\\codegym\\module_2\\module2\\bt_th_module2\\src\\baithuchanh\\timgiatrilonnhatvaghirafile\\test.txt");
        int max = findMax(numbers);
        readAndWriteFile.writeFile("C:\\Users\\Admin\\Desktop\\codegym\\module_2\\module2\\bt_th_module2\\src\\baithuchanh\\timgiatrilonnhatvaghirafile\\result.txt", max);
    }
}
