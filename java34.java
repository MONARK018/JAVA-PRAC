
class java34
{
    public static void main(String[] args)
    {
        mythread t = new mythread();
        t.start();

    }
}

class mythread extends Thread
{
    public void run()
    {
        int a = 41;
        System.out.println("Enter number is:-"+a);

        try{
            sleep(1000);
        }catch(InterruptedException e)
        {
            e.printStackTrace();
        }

        a++;
        System.out.println("After the increment:-"+a);

    }
}