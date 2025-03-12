import java.util.*;
public class Ass3Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("Enter the number: ");
			int n = sc.nextInt();
			if(n<0) {
				throw new ArithmeticException("Square root of negetive number ");
			}
			double sqrt = Math.sqrt(n);
			System.out.println("Square root is : "+ sqrt);
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception is :"+e.getMessage());
		}

	}

}
