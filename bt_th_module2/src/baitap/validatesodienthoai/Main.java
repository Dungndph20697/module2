package baitap.validatesodienthoai;

public class Main {
    public static boolean isValidPhoneNumber(String phoneNumber) {
        return phoneNumber.matches("^\\(\\d{2}\\)-\\(0\\d{9}\\)$");
    }

    public static void main(String[] args) {
        String[] testCases = {
                "(84)-(0978489648)",
                "(a8)-(22222222)",
                "(a8)-(222222222)",
                "(24)-(0978489648)"
        };

        for (String testCase : testCases) {
            System.out.println("Số điện thoại " + testCase + ": " + isValidPhoneNumber(testCase));
        }
    }
}
