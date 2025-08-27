public class ShapeHierarchy {
    public static void main(String[] args) {
        // Create an array of different shapes (polymorphism)
        Shape[] shapes = new Shape[] {
            new Circle(5.0),
            new Rectangle(4.0, 6.0),
            new Triangle(3.0, 4.0)
        };

        double totalArea = 0.0;
        System.out.println("Shapes info:");
        for (Shape s : shapes) {
            s.displayInfo();               // polymorphic call to calculateArea()
            totalArea += s.calculateArea();
        }

        System.out.println("\nTotal area of all shapes: " + totalArea);
    }
    
}

// Abstract base class
abstract class Shape {
    public abstract double calculateArea();

    public void displayInfo() {
        System.out.println(getClass().getSimpleName() + " - Area: " + calculateArea());
    }
}

// Circle subclass
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public void displayInfo() {
        System.out.println("Circle: radius = " + radius + ", area = " + calculateArea() + ", perimeter = " + perimeter());
    }
}

// Rectangle subclass
class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    public double perimeter() {
        return 2 * (width + height);
    }

    @Override
    public void displayInfo() {
        System.out.println("Rectangle: width = " + width + ", height = " + height + ", area = " + calculateArea() + ", perimeter = " + perimeter());
    }
}

// Triangle subclass
class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }

    @Override
    public void displayInfo() {
        System.out.println("Triangle: base = " + base + ", height = " + height + ", area = " + calculateArea());
    }
}
