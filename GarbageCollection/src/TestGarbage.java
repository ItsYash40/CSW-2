
public class TestGarbage {
	
	public void finalize() {
		System.out.println("Object Garbage Collection");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestGarbage t1= new TestGarbage();
		TestGarbage t2= new TestGarbage();
		TestGarbage t3= new TestGarbage();

		t1= null; // nulity of Object
		t2=t3; // Re Assign of Object
		System.gc();
	}

}
