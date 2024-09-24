
public class java16
{
    public static void main(String[] args) 
    {
        Parent p = new Parent();
        Child c = new Child();

          p.message();
          c.Message();
         
          p = c;
          c.message();

          System.out.println("23DIT016 - MONARK HIRPARA");
    }
}

class Parent
{
    void message()
    {
         System.out.println("This is a Parent class.");
    }
}

class Child extends Parent {

    public void Message() {
 
        System.out.println("This is child class.");
 
    }
 
 }