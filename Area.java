//package jan29;
	
	class Shape {
	    
	    public void calculateArea(int side) {
	        double area = side * side;
	        System.out.println("Area of Square: " + area);
	    }

	    public void calculateArea(int length, int breadth) {
	        double area = length * breadth;
	        System.out.println("Area of Rectangle: " + area);
	    }

	    public void calculateArea(double radius) {
	        double area = Math.PI * radius * radius;
	        System.out.println("Area of Circle: " + area);
	    }

	    public void calculateArea(double base, double height) {
	        double area = 0.5 * base * height;
	        System.out.println("Area of Triangle: " + area);
	    }
	}

	public class Area{
	    public static void main(String[] args) {
	        Shape s = new Shape();
	        
	        s.calculateArea(10); 
	        s.calculateArea(9, 5);
	        s.calculateArea(13.0); 
	        s.calculateArea(42.0, 58.0); 
	    }
	}

