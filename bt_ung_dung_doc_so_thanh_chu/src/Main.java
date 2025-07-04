import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so can doc: ");
        int number = sc.nextInt();
        if (number < 10) {
            System.out.println(number + ": " + docSo(number));
        }
        if (number >= 20) {
            String str = String.valueOf(number);
            String result = "";
            for (int i = 0; i < str.length(); i++) {

            }
        }

    }

    private static String docSo(int number) {
        String str = "";
        switch (number) {
            case 1:
                str += "one";
                break;
            case 2:
                str += "two";
                break;
            case 3:
                str += "three";
                break;
            case 4:
                str += "four";
                break;
            case 5:
                str += "fine";
                break;
            case 6:
                str += "six";
                break;
            case 7:
                str += "seven";
                break;
            case 8:
                str += "eight";
                break;
            case 9:
                str += "nine";
                break;
            case 0:
                str += "teen";
                break;
            default:
                str = "";
        }
        return str;
    }
}
