public class Multithreading_num1 extends Thread {
    
    public void run() {
        System.out.println("Thread is running....");
    }
    public static void main(String args[])
    {
        Multithreading_num1 thread1 = new Multithreading_num1();
        thread1.start();
    }
}

