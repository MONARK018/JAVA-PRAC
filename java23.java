import java.util.*;

public class java23 {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        try {
            System.out.println("Enter first value: ");
            int x = obj.nextInt();
            System.out.println("Enter second value: ");
            int y = obj.nextInt();
            
            func(x, y);
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter integers.");
        }


    }

    static void func(int x, int y) {
        try {
            int z = x / y;
            System.out.println("Answer is: " + z);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }
    } 
    
}
