
public class Myrunnable implements Runnable {
	public void run() {
		System.out.println("Ruunnable thread running.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread r= new Thread( new Myrunnable());
		r.start();

	}

}
