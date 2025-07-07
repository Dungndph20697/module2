public class Main {
    public static void main(String[] args) {
        int count = 1;
        int i = 2;
        while (count<=20){
            i++;
            if (checkSoNguyenTo(i)==true){
                System.out.println("So nguyen to thu "+ count+":" +i);
                count++;
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
