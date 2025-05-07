class Counter{
	private int count=0;
	public void increment() {
		count++;
	}
	public int getCount() {
		return count;
	}
}
public class RaceConditionExample extends Thread {
	private Counter counter;
	public RaceConditionExample(Counter counter) {
		this.counter= counter;
	}
		
		public void run(){
			for(int i=0;i<1000; i++) {
				counter.increment();
			}
		}
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Counter counter= new Counter();
		Thread t1= new RaceConditionExample(counter);
		Thread t2= new RaceConditionExample(counter);
		t1.start();
		t2.start();
		t1.join(); 
		t2.join();
		System.out.println("Final Count : "+counter.getCount());

		

		

	}

}
