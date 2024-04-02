abstract class Shape {
    abstract void draw(); // Abstract method

    void display() {
        System.out.println("Displaying Shape");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing Circle");
    }
}

class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing Rectangle");
    }
}

// Interface example
interface ShapeInterface {
    void draw();
}

class CircleInterface implements ShapeInterface {
    @Override
    public void draw() {
        System.out.println("Drawing Circle (Interface)");
    }
}

class RectangleInterface implements ShapeInterface {
    @Override
    public void draw() {
        System.out.println("Drawing Rectangle (Interface)");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        // Abstract class example
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();

        circle.draw();
        circle.display();

        rectangle.draw();
        rectangle.display();

        // Interface example
        ShapeInterface circleInterface = new CircleInterface();
        ShapeInterface rectangleInterface = new RectangleInterface();

        circleInterface.draw();
        rectangleInterface.draw();
    }
}