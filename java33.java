import java.util.*;

class java33
{
    public static void main(String[] args) {
        
        mythread t1 = new mythread();
        t1.start();

        mythread t3 = new mythread();
        t3.start();
    }
}

class mythread extends Thread
{
    public void run()
    {
        Random ran = new Random();

        for (int i = 0; i < 10; i++) {
            int ranint = ran.nextInt();
            System.out.println("Random Interger Generated:" +ranint);

            if(ranint%2 ==0)
            {
               Square t2 = new Square(ranint);
               t2.start();
            }
            else{
                    Cube t3 = new Cube(ranint);
                    t3.start();
            }
            try {
                Thread.sleep(1000);
                } catch (InterruptedException ex) {
                System.out.println(ex);
            
            }
        }
    }
}

class Square extends Thread
{
    int x;
    Square(int n)
    {
        x=n;
    }
    public void run()
    {
        int square = x*x;
        System.out.println("Square of "+x+"="+square);
    }
}

class Cube extends Thread
{
    int x;

    Cube(int n)
    {
      x=n;  
    }
    public void run()
    {
        int cube= x*x*x;
        System.out.println("Cube of"+x+"="+cube);
    }

} 
