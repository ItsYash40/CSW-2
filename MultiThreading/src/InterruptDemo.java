
public class InterruptDemo extends Thread{
	public void run() {
		
			try {
				Thread.sleep(2000);
				System.out.println(Thread.currentThread().getName()+" Thread Completed");

			}
			catch(InterruptedException e) {
				System.out.println(Thread.currentThread().getName()+" Thread was Interrupted");

			}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InterruptDemo t1= new InterruptDemo();
		InterruptDemo t2= new InterruptDemo();

		t1.start();
		t2.start();
		
		t2.interrupt();
	}

}
