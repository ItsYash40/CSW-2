class Point {
    private int x;
    private int y;
    public Point(int x, int y) { this.x = x;    this.y = y;   }
    public Point(Point other) {  this.x = other.x;   this.y = other.y;  }
    public int getX() {  return x;  }
    public int getY() {  return y;  }
    public void setX(int x) { this.x = x;    }
    public void setY(int y) {   this.y = y;   }
    public void displayPoint() {
        System.out.println("Point coordinates: (" + x + ", " + y + ")"); }
}
public class PointTester_Q3 {
    public static void main(String[] args) {
        Point p1 = new Point(3, 4);
        System.out.println("Original Point p1:");
        p1.displayPoint();        Point p2 = new Point(p1);
        System.out.println("\nCopied Point p2:");
        p2.displayPoint();
        p1.setX(7);     p1.setY(8);
        System.out.println("\nModified Original Point p1:");
        p1.displayPoint();
        System.out.println("\nCopied Point p2 remains unchanged:");
        p2.displayPoint();
    }
}
