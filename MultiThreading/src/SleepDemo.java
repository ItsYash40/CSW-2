
public class SleepDemo extends Thread {
	public void run() {
		for(int i=1; i<=5; i++) {
			try {
				Thread.sleep(1500);
			}
			catch(InterruptedException e) {
				System.out.println(e);

			}
			System.out.println(Thread.currentThread().getName()+" - "+i);

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SleepDemo().start();
		new SleepDemo().start();
		

	}

}
