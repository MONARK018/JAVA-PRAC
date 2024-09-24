
public class java18 
{

    public static void main(String[] args)
    {
         rectangle rec = new rectangle(10.5, 25.3);
         square squ = new square(10);

         rec.area();
         rec.perimeter();

         System.out.println(" ");

         squ.area();
         squ.perimeter();

         System.out.println("23DIT016 - MONARK HIRPARA");
    }
    
}

class rectangle
{
        double len, bre;

        public rectangle(double len, double bre)
        {
            this.len = len;
            this.bre = bre;
        }

        public void area()
        {
            System.out.println("The area of Rectangle:- "+(bre*len));
        }

        public void perimeter()
        {
            System.out.println("The perimeter of Rectangle:- "+(2*(len*bre)));
        }
}


class square extends rectangle {
    public square(double side) {
        super(side, side);
    }
}