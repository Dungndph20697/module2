package baitap.taothreaddongian;

public class NumberGenerator implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 9; i++) {
            int number = (int) (Math.random() * 100);
            System.out.println(number);
            try {
                Thread.sleep(500); // Sleep for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new NumberGenerator());
        Thread thread2 = new Thread(new NumberGenerator());
        thread1.start();
        thread2.start();
    }
}
