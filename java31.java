
public class java31 {
    
        static class helloThread extends Thread {
            public void run()
            {
                System.out.println("Hello World by thread");
            }
        }

        static class helloRunnable implements Runnable {
            public void run()
            {
                System.out.println("Hello World by Runnable");
            }
        }



   public static void main(String[] args) {
       
         helloThread thread1 = new helloThread();
         thread1.start();

        Thread thread2 = new Thread(new helloRunnable());
        thread2.start();
    }
}
