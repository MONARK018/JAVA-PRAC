
interface Shape {
 
    double Area();
    String Color();

   
    default void displayInfo() {
        System.out.println("Shape color: " + Color() + ", Area: " + Area());
    }
}


class Circle implements Shape {
    private double radius;
    private String color;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    @Override
    public double Area() {
        return Math.PI * radius * radius;
    }

    @Override
    public String Color() {
        return color;
    }
}


class Rectangle implements Shape {
    private double length;
    private double width;
    private String color;

    public Rectangle(double length, double width, String color) {
        this.length = length;
        this.width = width;
        this.color = color;
    }

    @Override
    public double Area() {
        return length * width;
    }

    @Override
    public String Color() {
        return color;
    }
}

// Sign class
class Sign {
    private Shape shape;
    private String text;

    public Sign(Shape shape, String text) {
        this.shape = shape;
        this.text = text;
    }

    public void displaySign() {
        shape.displayInfo();
        System.out.println("Sign text: " + text);
    }
}


public class java22 {
    public static void main(String[] args) {

        Circle circle = new Circle(5.0, "Red");
        Rectangle rectangle = new Rectangle(4.0, 6.0, "Blue");

        Sign circleSign = new Sign(circle, "Welcome to the Circle Zone!");
        Sign rectangleSign = new Sign(rectangle, "Welcome to the Rectangle Zone!");

        System.out.println("Circle Sign:");
        circleSign.displaySign();

        System.out.println("\nRectangle Sign:");
        rectangleSign.displaySign();
    }
}
