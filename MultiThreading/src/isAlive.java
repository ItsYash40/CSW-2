
public class isAlive extends Thread{
	public void run() {
		System.out.println("Running thread "+getName());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		isAlive t1= new isAlive();
		System.out.println("Before start "+t1.isAlive());
		t1.start();
		System.out.println("After start "+t1.isAlive());

		isAlive t2= new isAlive();
		System.out.println("Before start "+t2.isAlive());
		t2.start();
		System.out.println("After start "+t2.isAlive());
	
	}
}
