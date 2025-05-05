class MyRunnable1 implements Runnable {
	@Override
	public void run() {
		System.out.println("Thread is running using Runnable interface");
	}
	
	public static void main(String[] args) {
		MyRunnable1 myRunnable=new MyRunnable1();
		Thread thread=new Thread(myRunnable);
		thread.start();
		System.out.println("Main thread finished.");
	}

}