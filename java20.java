
public class java20 {
    public static void main(String[] args)
    {
        Degree d = new Degree();
        Undergraduate u = new Undergraduate();
        Postgraduate p = new Postgraduate();

        d.getDegree();
        u.prints();
        p.prints();
    }
    
}

class Degree
{
    void getDegree()
    {
        System.out.println("I got a degree");
    }
}

class Undergraduate extends Degree
{
    void prints()
    {
        System.out.println("I am an Undergraduate");

    }
}

class Postgraduate extends Degree
{
    void prints()
    {
        System.out.println("I am a Postgraduate");
    }
}