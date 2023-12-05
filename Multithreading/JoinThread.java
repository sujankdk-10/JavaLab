public class JoinThread  extends Thread{
    public void run()
    {
        for(int i=1;i<5;i++)
        {
            try
            {
                Thread.sleep(100);
            }catch(InterruptedException e){
                System.out.println(e);
            }
            System.out.println(i);
        }
    }
    public static void main(String args[])
    {
        JoinThread thread1=new JoinThread();
        JoinThread thread2=new JoinThread();
        JoinThread thread3=new JoinThread();
        thread1.start();
        try{
            thread1.join();
        }catch(Exception e)
        {
            System.out.println(e);
        }
        thread2.start();
        thread3.start();
    }
    
}
