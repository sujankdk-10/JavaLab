
public class Multithreading_num2 implements Runnable {
    
    public void run() {
        System.out.println("Thread is running....");
    }
    public static void main(String args[])
    {
        Multithreading_num2 r1 = new Multithreading_num2();
        Thread thread1 = new Thread(r1);
        thread1.start();
    }
}

