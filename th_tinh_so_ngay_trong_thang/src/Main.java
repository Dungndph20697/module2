import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tháng");
        int mont = sc.nextInt();
        String daysInMonth;
        switch (mont) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                daysInMonth = "31";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                daysInMonth = "30";
                break;
            case 2:
                daysInMonth = "29 hoặc 30";
            default:
                daysInMonth = "";
        }
        if (daysInMonth.equals("")) {
            System.out.println("Tháng không chính xác");
        } else {
            System.out.println("Tháng " + mont + " có " + daysInMonth + " ngày");
        }
    }
}
