package Task1;

public interface Shape {
    /*
    Create an Interface 'Shape' with undefined methods as calculateArea and calculatePerimiter.
    Create 2 classes Circle & Square that implements functionality defined in the Shape Interface. Test your code.
     */
    double calculateArea();

    double calculatePerimeter();

}

class Square implements Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public double calculatePerimeter() {
        return 4*side;
    }
}
class Circle implements Shape{
    private double radius;

    public Circle(double radius){
        this.radius=radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI*radius*radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2*Math.PI*radius;
    }
}
class ShapeTester{
    public static void main(String[] args) {
        Circle circle=new Circle(7.2);
        Square square=new Square(7.5);
        System.out.println("Circle area: " + circle.calculateArea());
        System.out.println("Circle perimeter: " + circle.calculatePerimeter());
        System.out.println("Square area: " + square.calculateArea());
        System.out.println("Square perimeter: " + square.calculatePerimeter());
    }
}
