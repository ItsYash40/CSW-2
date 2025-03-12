
import java.util.Arrays;
import java.util.Scanner;

public class Ass3Q6 {

	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Size: ");
		int n = sc.nextInt();
		int[]arr=new int[n];
		System.out.println("Enter Array Elements: ");

		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		try {
			//Bubble Sort
			for(int i=0;i<n-1;i++) {
				for(int j=i+1;j<n;j++) {
					if(arr[i]>arr[j]) {
						int temp= arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}
			}

			System.out.println(Arrays.toString(arr));
			//linearSearch
			System.out.println("Type the target value");
			int tar= sc.nextInt();
			for(int i=0;i<n;i++) {
				if(tar==arr[i]) {
					System.out.println("Target found at Index :"+i);
					break;
				}
			}
			System.out.println("Enter the index of required element");
			int idx=sc.nextInt();
			System.out.println("Required Element :"+arr[idx]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index Out Of Bounds Exception :"+e.getMessage());
		}

	}

}
