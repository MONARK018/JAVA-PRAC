import java.util.*;

class java13
{
    public static void main(String[] args)
    {
        Date date = new Date(0,0,0);
        Scanner sc = new Scanner(System.in);
    
        System.out.println("Enter Date:-");
        int d = sc.nextInt();

        System.out.println("Enter Month:-");
        int m = sc.nextInt();

        System.out.print("Enter year:-");
        int y = sc.nextInt();

        Data da = new Data(d,m,y);

        da.display();

        System.out.println("23DIT016 - MONARK HIRPARA");
    }
        
}

class Data
{
    int date;
    int month;
    int year;

    public Data(int d, int m, int y )
    {
        date = d;
        month = m;
        year = y; 
    }

    public void setmydate(int dates)
    {
       date = dates;
       //return date;
    }
    public int getmydate()
    {
        return date;
    }

    public void setmymonth(int months)
    {
        month = months;
    }
    public int getmymonth()
    {
        return month;
    }

    
    public void setmyyear(int years)
    {
        year = years;
    }
    public int getmyyear()
    {
        return year;
    }

    public void display()
    {
            System.out.println(date+"/"+month+"/"+year);

    }
};