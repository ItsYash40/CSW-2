class Rectangle {
    private double length;
    private double width;
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public double getLength() {    return length; }
    public double getWidth() {    return width;  }
    public void setLength(double length) {  this.length = length;  }
    public void setWidth(double width) {    this.width = width; }    
    public double calculateArea() {  return length * width;  }
    public double calculatePerimeter() {  return 2 * (length + width);    }     
}

public class Rectangle_Q2 {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(5.0, 3.0);
        System.out.println("Initial Rectangle Details:");
        System.out.println("Area: " + rect.calculateArea());
        System.out.println("Perimeter: " + rect.calculatePerimeter());
        rect.setLength(7.0);
        rect.setWidth(4.0);
        System.out.println("\nUpdated Rectangle Details:");
        System.out.println("Area: " + rect.calculateArea());
        System.out.println("Perimeter: " + rect.calculatePerimeter());
    }
}

