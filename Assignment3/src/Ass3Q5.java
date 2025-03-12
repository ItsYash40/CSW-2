	import java.util.*;

public class Ass3Q5 {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			try {
				System.out.print("Enter a String to convert it to Number: ");
				String a = sc.next();
				System.out.println("String to Integer: "+Integer.valueOf(a));
				try {
					System.out.println("Divison 100 by that Number: "+(double)100/Integer.valueOf(a));
				}catch (ArithmeticException e) {
					System.out.println("Can\'t Divide it by 0: "+e.getMessage());
				}
			} catch (NumberFormatException e) {
				System.out.println("Can only convert digits: "+e.getMessage());
			}
		}
	}



