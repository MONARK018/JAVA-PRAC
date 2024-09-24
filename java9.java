import java.util.*;

class java9
{
    public static void main(String[] args)
    {
        System.out.println("Enter the String");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println("Enter the number");
        int a = sc.nextInt();
       switch(a)
        {
            case 1:
            System.out.println("The length is "+ str.length());
            break;

            case 2:
            System.out.println(str.toUpperCase());
            break;

            case 3:
            System.out.println(str.toLowerCase());
            break;

            case 4:
            for(int i=str.length()-1 ; i>=0 ; i--)
            {
                System.out.print(str.charAt(i));
            }
            break;
               
            case 5:
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);
            System.out.println(sorted);
            break;
        }
        System.out.println("23DIT016 MONARK HIRPARA");
    } 
}