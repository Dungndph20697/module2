package baitap.hienthisochanle;

public class TestThread {
    public static void main(String[] args) {
        Thread t1 = new EvenThread();
        Thread t2 = new OddThread();

        try {
            t2.start();
            t2.join();
            t1.start();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
