import java.util.*;
public class LogicalErrorQ2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter a number to check even or odd: ");
		int num= sc.nextInt();
		
		if(num %2 ==1) {
			System.out.println("Entered number is even.  ");

		}
		else {
			System.out.println("Entered number is odd: ");

		}

	}

}
