public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            System.out.println("*************");
        }
        System.out.println();
        for (int i = 1; i <= 5; i++) {
            System.out.println("*".repeat(i));
        }
        System.out.println();
        for (int i = 5; i >= 1; i--) {
            System.out.println("*".repeat(i));
        }
    }
}
