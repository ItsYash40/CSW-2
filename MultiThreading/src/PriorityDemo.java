
public class PriorityDemo extends Thread{
	public void run() {
		System.out.println(getName()+ " With priority value "+getPriority());
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityDemo t1= new PriorityDemo();
		PriorityDemo t2= new PriorityDemo();
		PriorityDemo t3= new PriorityDemo();

		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		t3.setPriority(Thread.NORM_PRIORITY);

		t1.start();
		t2.start();
		t3.start();

	}

}
