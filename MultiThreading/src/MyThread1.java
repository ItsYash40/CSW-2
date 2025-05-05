
public class MyThread1 extends Thread {

	public void run() {
		System.out.println(" Thread is running using thread class.");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread1 m= new MyThread1();
		m.start();
		System.out.println(" main thread finished");


	}

}
