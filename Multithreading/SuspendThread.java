public class SuspendThread  extends Thread{
    public void run()
    {
        for(int i=1;i<5;i++)
        {
            try
            {
                sleep(100);
                System.out.println(Thread.currentThread().getName());
            }catch(InterruptedException e){
                System.out.println(e);
            }
            System.out.println(i);
        }
    }
    public static void main(String args[])
    {
        SuspendThread thread1=new SuspendThread();
        SuspendThread thread2=new SuspendThread();
        SuspendThread thread3=new SuspendThread();
        thread1.start();
        thread2.start();
        thread2.suspend();
        thread3.start();
    }
    
}
