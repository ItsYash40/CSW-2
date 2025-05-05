class MyRunable3 implements Runnable{
	private String thredName;
	public MyRunable3(String name) {
		this.thredName=name;
	}
	public void run() {
		for(int i=0; i<=5; i++) {
			System.out.println(thredName+" - count "+i);
			try {
				Thread.sleep(500);
			}
			catch(InterruptedException e) {
				System.out.println(thredName+" - was interupted "+i);

			}
		}
		System.out.println(thredName+" finished ");

	}
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyRunable3 r1= new MyRunable3("Thread 1");
		MyRunable3 r2= new MyRunable3("Thread 2");
		
		Thread t1= new Thread(r1);
		Thread t2= new Thread(r2);
		
		t1.start();  t2.start();
		System.out.println("Main thread started both thread");


	}

}
