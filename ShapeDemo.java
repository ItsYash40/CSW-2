package OOPs;

class Shape {
    void draw() {
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }
}

class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a rectangle");
    }
}

class Triangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a triangle");
    }
}

public class ShapeDemo {
    public static void main(String[] args) {
        Shape shape1 = new Circle();
        Shape shape2 = new Rectangle();
        Shape shape3 = new Triangle();
        Shape shape4 = new Shape();

        shape1.draw();
        shape2.draw();
        shape3.draw();
        shape4.draw();
    }
}
