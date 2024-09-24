import java.util.*;

class java10
{
    public static void main(String[] args)

    {
       String str="CHARUSAT UNIVERSITY";
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter yor name: ");
       String s1 = sc.nextLine();

       System.out.println("The length of string are: " +str.length());
      
       for(int i=0;i<str.length();i++)
       {
          if(str.charAt(i)== 'H')
          {
            str=str.replace(str.charAt(i), s1.charAt(0));
          }
       }

        System.out.println("After replacement: "+str);

        System.out.println("Name in Lowercase: " +str.toLowerCase());
        System.out.println("23DIT016 MONARK HIRPARA");
    }

}