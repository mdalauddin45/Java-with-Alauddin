class MyThread extends Thread {
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("Thread " + Thread.currentThread().getName() + " Count " + i);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

public class Thread_Example {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
    }
}
