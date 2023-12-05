public class ResumeThread  extends Thread{
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
        ResumeThread thread1=new ResumeThread();
        ResumeThread thread2=new ResumeThread();
        ResumeThread thread3=new ResumeThread();
        thread1.start();
        thread2.start();
        thread2.suspend();
        thread3.start();
        thread2.resume();
    }
    
}
