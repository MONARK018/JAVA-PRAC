import java.util.Scanner;
import java.util.Random;


class java5
{
      public static void main(String[] args)
        {
            int i=5,guess=100;
            //System.out.println("Choose the number");
            Random R_no = new Random();
            int x=R_no.nextInt(guess);
   
            do
            {
              System.out.println("Enter the number");
              Scanner sc = new Scanner(System.in);
              int num = sc.nextInt();
             

                   if(num == x)
                      {
                         System.out.println("You choose the correct number");    
                         break;    
                      }
                    else
                      {
                         if(num<x)
                            {
                               System.out.println("Oops! choose again");
                               System.out.println("You are very close");
                            }
                         else                       
                            {
                               System.out.println("Oops! choose again");
                               System.out.println("You are very high");
                            }
                      }
                 
             }while(true);

             System.out.println("23DIT016 MONARK HIRPARA");
        }
}