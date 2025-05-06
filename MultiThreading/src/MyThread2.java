// Thread Method => start()
public class MyThread2 extends Thread {

	public void run() {
		System.out.println("Thread is running.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread2 t= new MyThread2();
		t.start();
	}

}
