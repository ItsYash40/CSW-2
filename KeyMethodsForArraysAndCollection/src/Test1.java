import java.util.*;
public class Test1 {
	public static void main(String[] args)
	{
		int roll=0;String name=null;
		ArrayList<Student1> arr= new ArrayList<Student1>();
		arr.add(new Student1 ("Rama ", 22 , "98796" , 78.9));
		arr.add(new Student1 ("Sita ", 21 , "99796" , 77.9));
System.out.println(arr);
Collections.sort(arr);
System.out.println(arr);

	}

}
