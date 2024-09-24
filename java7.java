import java.util.*;

public class java7
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        char arr[]={9,8,7,9,9,4,9,1,2,9};
        int count=0;

        for(int i=0 ; i<arr.length ; i++)
        {
             if(arr[i]==9)
             {
                count++;
             }
        }

        System.out.println( count );

        System.out.println("23DIT016 MONARK HIRPARA");
    }
}