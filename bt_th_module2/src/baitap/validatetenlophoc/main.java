package baitap.validatetenlophoc;

public class main {

    public static boolean isValidClassName(String className) {
        return className.matches("^[CAP]\\d{4}[GHIK]$");
    }

    public static void main(String[] args) {
        String[] testCases = {
                "C0223G",
                "A0323K",
                "M0318G",
                "P0323A",
                "C1234@",
                "P9999I"
        };

        for (String testCase : testCases) {
            System.out.println("Tên lớp " + testCase + ": " + isValidClassName(testCase) );
        }
    }

}
