
public class JoinExample extends Thread{
	public void run() {
		for(int i=1; i<=2; i++) {
			System.out.println(getName()+" running ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JoinExample t1= new JoinExample();
		JoinExample t2= new JoinExample();
		JoinExample t3= new JoinExample();

		t1.start();
		try {
			t1.join(1000);  // Wait until t1 finished
		}catch(InterruptedException e) {
			t2.start();
		}
		t2.start(); 
		t3.start();
	}
}
