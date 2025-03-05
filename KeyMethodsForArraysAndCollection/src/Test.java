import java.util.*;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> arr = new ArrayList<>();
		arr.add(new Student("Rama",22,"98796",78.9));
		arr.add(new Student("Sita",21,"99796",77.9));
		System.out.println(arr);
		Collections.sort(arr);
		System.out.println(arr);
		
		

	}

}
