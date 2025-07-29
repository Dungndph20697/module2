package baithuchanh.docghidanhsachsinhvienrafilenhiphan;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void writeDataToFile(String path, List<Student> students) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(students);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Nguyen Van A", "Ha Noi"));
        students.add(new Student(2, "Tran Thi B", "Ho Chi Minh City"));
        students.add(new Student(3, "Le Van C", "Da Nang"));
        students.add(new Student(4, "Pham Thi D", "Hai Phong"));
        students.add(new Student(5, "Ngo Van E", "Can Tho"));
        writeDataToFile("students.txt", students);
        List<Student> readStudents = readDataFromFile("students.txt");
        for (Student student : readStudents) {
            System.out.println(student);
        }
    }
    public static List<Student> readDataFromFile(String path) {
        List<Student> students = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            students = (List<Student>) ois.readObject();
            ois.close();
            fis.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return students;
    }
}
