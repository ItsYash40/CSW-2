
public class ThreadNameDemo extends Thread {
	public void run() {
		System.out.println("Running thread "+getName());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadNameDemo t= new ThreadNameDemo();
		t.setName("My Thread 1");
		t.start();

	}

}
