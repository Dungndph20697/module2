package file;

import java.io.File;
import java.io.FileWriter;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("hello.txt");
            writer.write("Hello, World!");
            writer.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
