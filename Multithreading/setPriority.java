public class setPriority extends Thread {
    public void run()
    {
        System.out.println("Priority thread is :" + Thread.currentThread().getPriority());
    }
    public static void main(String args[]){
        setPriority t1=new setPriority();
        t1.setPriority(Thread.MAX_PRIORITY);
        t1.start();
    }
    
}