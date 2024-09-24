import java.util.*;

class java11
{
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the currency");
       int a = sc.nextInt();
       
       if(a<0)
       {
        System.out.println("Enter the positive currency");
       }
       else
       {
        a=a*100;
        System.out.println("Currency in pound:-");
        System.out.println(+a);
       }

       System.out.println("23DIT016 MONARK HIRPARA");
    }

}