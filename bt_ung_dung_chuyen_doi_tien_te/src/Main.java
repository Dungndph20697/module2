import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int vnd = 23000;
        Scanner sc = new Scanner(System.in);
        System.out.print("Usd: ");
        int usd = sc.nextInt();
        System.out.println(usd + " usd = " + usd * vnd + " vnd");
    }
}
