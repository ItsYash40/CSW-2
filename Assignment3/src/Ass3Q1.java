import java.util.*;
public class Ass3Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter an alphanumeric String :");
		String str = sc.nextLine();
		for (int i=0;i<str.length();i++) {
			char c = str.charAt(i);
			if (c=='0' || c=='1' || c=='2' || c=='3' || c=='4' || c=='5' || c=='6' ||c=='7' | c=='8' || c=='9') {
				System.out.println("Numeric charcaters in string :" + c);
			}
		}
		
		
        try {
        	String num = "";
        	String s = null;
        	int l = s.length();
        }
        catch (NullPointerException e) {
        	System.out.println("Null Pointer Exception :" + e.getMessage());
        }
	}
}
