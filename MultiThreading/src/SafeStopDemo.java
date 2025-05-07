
public class SafeStopDemo extends Thread {
	volatile boolean running = true;
	public void run() {
		while(running) {
			System.out.println(" Thread Running ...");
		}
		System.out.println(" Thread Stop safely.");

	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		SafeStopDemo t1= new SafeStopDemo();
		t1.start();
		Thread.sleep(1000);
		t1.running= false;

	}

}
