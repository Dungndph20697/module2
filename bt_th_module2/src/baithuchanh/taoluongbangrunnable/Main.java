package baithuchanh.taoluongbangrunnable;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main thread is running");
        RunnableDemo runnable1 = new RunnableDemo("Thread-1-HR-Database");
        runnable1.start();
        RunnableDemo runnable2 = new RunnableDemo("Thread-2-Send-Email");
        runnable2.start();
        System.out.println("Main thread is exiting");
    }
}
