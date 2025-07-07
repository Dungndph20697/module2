public class Main {
    public static void main(String[] args) {
        int i = 2;
        System.out.print("Cac so nguyen to nho hon 100 la: ");
        while (true){
            i++;
            if (checkSoNguyenTo(i) == true){
                if (i < 100){
                    System.out.print(i+", ");
                }
            }
        }
    }

    private static boolean checkSoNguyenTo(int number) {
        for (int i = 2; i < Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
