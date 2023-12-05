public class CurrentThread_num4  extends Thread{
    public void run()
    {
        System.out.println(Thread.currentThread().getName());
    }
    public static void main(String args[])
    {
        CurrentThread_num4 thread1=new CurrentThread_num4();
        CurrentThread_num4 thread2=new CurrentThread_num4();
        thread1.start();
        thread2.start();
    }
    
}
