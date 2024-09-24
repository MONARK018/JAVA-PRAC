import java.util.LinkedList;
import java.util.Queue;


class Buffer{

  private int Max_size;
  private Queue<Integer>queue = new LinkedList<>();

  public Buffer(int size)
  {
    this.Max_size=size;
  }

  public synchronized void produce(int value) throws InterruptedException{
    while(queue.size() == Max_size)
    {
        wait();

        queue.add(value);
        System.out.println("Produced: " + value);

        notify();
    }
}

        public synchronized int consume() throws InterruptedException {
           
            while (queue.isEmpty()) {
                wait();  
            }
    
            int value = queue.poll();
            System.out.println("Consumed: " + value);
    
            notify();
            return value;
        }

}

class Producer implements Runnable {
    private Buffer buffer;

    public Producer(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        int value = 0;
        while (true) {
            try {
                buffer.produce(value++);
                Thread.sleep(500); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer implements Runnable {
    private Buffer buffer;

    public Consumer(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        while (true) {
            try {
                buffer.consume();
                Thread.sleep(1000);  
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class java36 {
    public static void main(String[] args) {
        
        Buffer buffer = new Buffer(5);

        Thread producerThread = new Thread(new Producer(buffer));
        Thread consumerThread = new Thread(new Consumer(buffer));


        producerThread.start();
        consumerThread.start();
    }
}
