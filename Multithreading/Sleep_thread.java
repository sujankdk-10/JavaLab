public class Sleep_thread  extends Thread{
    public void run()
    {
        for(int i=1;i<6;i++)
        {
            try
            {
                Thread.sleep(1000);
            }catch(InterruptedException e){
                System.out.println(e);
            }
            System.out.println(i);
        }
    }
    public static void main(String args[])
    {
        Sleep_thread thread1=new Sleep_thread();
        Sleep_thread thread2=new Sleep_thread();
        thread1.start();
        thread2.start();
    }
    
}
