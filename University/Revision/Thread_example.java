//sala(Thread) akn(currentThread()) amr name niya dek(getName())
class MyThread extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }
}
public class Thread_example {
    public static void main(String[] args) {
        MyThread m = new MyThread();
        m.start();
    }
    
}