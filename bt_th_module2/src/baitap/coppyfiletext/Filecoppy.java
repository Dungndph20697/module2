package baitap.coppyfiletext;

import java.io.*;
import java.util.Scanner;

public class Filecoppy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập đường dẫn tệp nguồn: ");
        String sourcePath = scanner.nextLine();

        System.out.print("Nhập đường dẫn tệp đích: ");
        String targetPath = scanner.nextLine();

        File sourceFile = new File(sourcePath);
        File targetFile = new File(targetPath);

        if (!sourceFile.exists()) {
            System.out.println("Tệp nguồn không tồn tại.");
            return;
        }

        if (targetFile.exists()) {
            System.out.println("Tệp đích đã tồn tại. Hãy chọn tên khác hoặc xóa tệp cũ.");
            return;
        }
        int charCount = 0;
        try (
                FileReader reader = new FileReader(sourceFile);
                FileWriter writer = new FileWriter(targetFile)
        ) {
            int character;
            while ((character = reader.read()) != -1) {
                writer.write(character);
                charCount++;
            }

            System.out.println("Sao chép thành công!");
        } catch (IOException e) {
            System.out.println("Đã xảy ra lỗi khi sao chép tệp: " + e.getMessage());
        }
    }
}
