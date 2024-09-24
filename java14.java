import java.util.*;

class java14
{
    public static void main(String[] args)
    {
       area a1 = new area();

        double x = a1.returnarea();
        System.out.println("AREA IS : " + x);

        System.out.println("23DIT016 - MONARK HIRPARA");
    }

}


class area{
    double len;
    double bre;
    area(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Length of Rectangle");
        len = sc.nextDouble();

        System.out.println("Enter the Breadth of Rectangle");
        bre= sc.nextDouble();

    }

    double returnarea(){
        return (len*bre) ;
    }
}
