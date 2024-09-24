
public class java35
{
    public static void main(String[] args)
    {
         Mythread f = new Mythread("First");
         f.setPriority(3);

         Mythread s = new Mythread("Second");
         s.setPriority(Thread.NORM_PRIORITY);

         Mythread t = new Mythread("Third");
         t.setPriority(7);

         f.start();
         s.start();
         t.start();
    }
}

class Mythread extends Thread
{
    public Mythread(String name)
    {
        super(name);
    }
    public void run()
    {
        for(int i = 0 ; i < 10 ; i++)
        {
            Thread currentThread = Thread.currentThread();
            System.out.println("call no = "+this.getName() +currentThread.getPriority());

            try{
                sleep(1000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
