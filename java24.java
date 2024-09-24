
public class java24 {

    public static int divide(int num , int demo)
    {
            if(demo == 0)
            {
                throw new ArithmeticException("cannot divide by zero");
            }
            return num/demo;
    }
    
    public static void main(String[] args) {

        try{
            int result = divide(10,0);
            System.out.println("Result" + result);
        } catch (ArithmeticException e)
        {
            System.out.println("Exception caught: " + e.getMessage());
        }

        System.out.println("Program will run after exception handling");
    }
}
