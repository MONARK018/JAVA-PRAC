
class Complex {
 
    int real, image;
    Complex()
    {
    }

    Complex(int tempReal, int tempImage)
    {
        real = tempReal;
        image = tempImage;
    }

    Complex addComp(Complex C1, Complex C2)
    {
        Complex temp = new Complex();
 
        temp.real = C1.real + C2.real;
 
        temp.image = C1.image + C2.image;
 
        return temp;
    }

    Complex subtractComp(Complex C1, Complex C2)
    {
        Complex temp = new Complex();
 
        temp.real = C1.real - C2.real;
 
        temp.image = C1.image - C2.image;

        return temp;
    }

    Complex multipleComp(Complex C1, Complex C2)
    {
        Complex temp = new Complex();
        temp.real = (this.real*C2.real) - (this.image*C2.image);    
        temp.image = (this.real*C2.image) + (this.image*C2.real);
       return temp;

    }

    void printComplexNumber()
    {
        System.out.println("Complex number: "+ real + " + " + image + "i");
    }
}
 
public class java15 {

    public static void main(String[] args)
    {
        Complex C1 = new Complex(3, 2);
 
        Complex C2 = new Complex(9, 5);
 
        Complex C3 = new Complex();
 
        C3 = C3.addComp(C1, C2);
 
        System.out.print("Sum of ");
        C3.printComplexNumber();
 
        C3 = C3.subtractComp(C1, C2);

        System.out.print("Difference of ");
        C3.printComplexNumber();

        C3 = C3.multipleComp(C1, C2);
 
        System.out.print("Multiply of ");
        C3.printComplexNumber();

        System.out.println("23DIT016 - MONARK HIRPARA");
    }
}