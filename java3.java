import java.util.Scanner;

class java3
{
    public static void main(String[] args)
        {
             System.out.println("Enter the Mobile number");
             Scanner n = new Scanner(System.in);
             String j = n.nextLine();

             System.out.println("OP code: ");

                 for(int i = 0 ; i<2 ; i++)
                 {
                     System.out.print(j.charAt(i));

                 }
                 System.out.println(" ");
                 System.out.println("MSC Code");

                 for(int i = 2; i<5 ; i++)
                 {
                      System.out.print(j.charAt(i));

                 }
                 System.out.println(" ");
                 System.out.println("UNIQUE Code");

                 for(int i = 5; i<=9 ; i++)
                 {
                      System.out.print(j.charAt(i));

                 }  
                 System.out.println(" ");
                 System.out.println("23DIT016 MONARK HIRPARA");
        }    

}

 
