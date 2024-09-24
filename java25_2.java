
import java.io.FileNotFoundException;
import java.io.FileReader;


public class java25_2{

    public static void check() throws InterruptedException
    {
        System.out.println("Sleeping for 1 second...");
        Thread.sleep(1000); 
        System.out.println("Woke up!");
        System.out.println(" ");
    }
    public static int Arithmeticexception(int x, int y)
    {
      if(y == 0)
      {
        throw new ArithmeticException("cannot divide by zero");
      }
      return x/y;
    }


    public static void main(String[] args) {
        
        try {
            Arithmeticexception(5,0);
        } catch (ArithmeticException e) {
            System.out.println("Unchecked Exception"+e.getMessage());
        }

        System.out.println(" ");

        try {
            int arr[]={10,20,30};
            System.out.println(arr[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Unchecked Exception"+e.getMessage());
        }

        System.out.println(" ");

        try {
            FileReader file = new FileReader("somefile.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Checked Exception"+e.getMessage());
        }

        System.out.println(" ");

        try {
            check();
            
        } catch (InterruptedException e) {
            {
                System.out.println("Checked Exception"+e.getMessage());
            }
        }
     }
}