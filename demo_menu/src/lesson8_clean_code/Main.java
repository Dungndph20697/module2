package lesson8_clean_code;

public class Main {

    public static final int ROLE_ADMIN = 1;
    public static final int ROLE_USER = 2;
    public static final int ROLE_GUEST = 3;

    public static void main(String[] args) {
        System.out.println(sum(5, 10));
        loop();
        loop();
        loop();

        int role =1 ;
        if (role== ROLE_ADMIN){
            System.out.println("Ban có quyen truy cap quan tri");
        }else if (role == ROLE_USER){
            System.out.println("Ban co quyen truy cap nguoi dung");
        }else if (role== ROLE_GUEST){
            System.out.println("Ban co quyen truy cap khach");
        }else {
            System.out.println("Ban khong co quyen truy cap");
        }
    }

    private static void loop() {
        for (int i = 0; i < 10; i++) {
            boolean isEven = i % 2 != 0;
            if (isEven) System.out.println("Odd number: " + i);
            else System.out.println("Even Number: " + i);
        }
    }

    public static int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }
}
