import java.util.*;
public class Ass3Q3 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter a string to convert it to Integer : ");
		String s=sc.next();
		int n;
		try
		{
			n=Integer.parseInt(s);
			System.out.println("Numeric value is :" + n);
		}
		catch(NumberFormatException e)
		{
			System.out.println(e);
			System.out.println("Enter a valid numeric value");
		}
	}

}
