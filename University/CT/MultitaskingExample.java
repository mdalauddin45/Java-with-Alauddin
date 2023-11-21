class MyTask implements Runnable{
    String name;
    public MyTask(String name){
        this.name = name;
    }
    public void run(){
        System.out.println(Thread.currentThread().getName() + " " + name);
    }

}
public class MultitaskingExample {
    public static void main(String[] args) {
        MyTask task1 = new MyTask("test-1");
        MyTask task2 = new MyTask("test-2");
        MyTask task3 = new MyTask("test-3");

        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);
        Thread thread3 = new Thread(task3);
        
        thread1.start();
        thread2.start();
        thread3.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("All tasks completed");
    }
}
