import java.util.Scanner;

public class java8
{
     public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();
       

        System.out.println("Your character are");
        for(int i=0 ; i<str.length(); i++)
        {
            for(int j=0 ; j < 2 ; j++ )
            {
             System.out.print(str.charAt(i));
            }
        }
       System.out.println(" ");
       System.out.println("23DIT016 MONARK HIRPARA");
     }
      

}