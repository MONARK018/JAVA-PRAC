
import java.util.Scanner;


interface AdvancedArithmetic
{
    int divisorsum(int n);
}

class MyCalculator implements AdvancedArithmetic
{

    @Override
    public int divisorsum(int n) {
        
        int sum=0;

        for(int k=1;k<=n;k++)
        {
            if(n%k == 0)
            {
            sum += k;
            }
        }
        return sum;
    }  
}

class java21
{
    public static void main(String[] args) {
        int n;
        MyCalculator cal = new MyCalculator();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        n = sc.nextInt();
        sc.nextLine();
        System.out.println("Answer :::" +cal.divisorsum(n));
    }
}