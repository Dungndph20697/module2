import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        float width;
        float heitght;
        Scanner sc = new Scanner(System.in);
        System.out.print("width: ");
        width = sc.nextFloat();
        System.out.print("height: ");
        heitght = sc.nextFloat();

        float area = width * heitght;
        System.out.println("Area is: " + area);

    }
}
