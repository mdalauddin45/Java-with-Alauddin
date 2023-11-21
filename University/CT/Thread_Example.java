class MyThread extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
public class Thread_Example {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
    }
}
