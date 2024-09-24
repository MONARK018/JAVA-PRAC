
public class java19 {
    
    public static void main(String[] args)
    {
        square1 s1 = new square1();
        s1.print4();
        s1.print1();
     }
}

class shape
{
    void print1()
    {
        System.out.println("This is a shape");
        
    }
}

class rectangle1 extends shape
{
    void print2()
    {
        System.out.println("This is a rectangle shape");
    }
}

class circle extends shape
{
    void print3()
    {
        System.out.println("This is a circular shape");
    }
}

class square1 extends rectangle1
{
    void print4()
    {
        System.out.println("Square is a rectangle");
    }
}