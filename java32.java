import java.util.*;

public class java32 {

    static class SumTask implements Runnable {
        private int start;
        private int end;
        private long partialSum;

        public SumTask(int start, int end) {
            this.start = start;
            this.end = end;
            this.partialSum = 0;
        }
            public long getPartialSum() {
                return partialSum;
            }

            public void run() {
                for (int i = start; i <= end; i++) {
                    partialSum += i;
                }
            }
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of N:-");
        int N = sc.nextInt();

        System.out.print("Enter the number of threads: ");
        int no_threads = sc.nextInt();

        SumTask[] tasks = new SumTask[no_threads];
        Thread[] threads = new Thread[no_threads];

        int chunkSize = N / no_threads;
        int rem = N % no_threads;

        int start = 1;

        for(int i = 0 ; i<no_threads ; i++)
        {
            int end = start + chunkSize - 1;

            if(i == no_threads - 1)
            {
                end += rem;
            }

            tasks[i] = new SumTask(start,end);
            threads[i] = new Thread(tasks[i]);
            threads[i].start();

            start = end + 1;
        }

        long totalSum = 0;

        for (int i = 0; i < no_threads; i++) {
            try {
                threads[i].join();
                totalSum += tasks[i].getPartialSum();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
           }
           System.out.println("Total Sum: " + totalSum);
        }   
    }