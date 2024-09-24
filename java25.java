
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}
public class java25 {

    public static void validage(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age is less than 18. Access denied.");
        } else {
            System.out.println("Access granted. You are old enough.");
        }
    }


    public static void main(String[] args) {
        try {
            validage(16);
        } catch (InvalidAgeException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }

        try {
            validage(20); 
        } catch (InvalidAgeException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }
    }
    
}