package Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

	public static void main(String[] args) {
		
		ExecutorService service = Executors.newFixedThreadPool(10);
		
		new MyThreadEx().start();
		
		MyRunnableEx runnable = new MyRunnableEx();
		Thread thread = new Thread(runnable);
		thread.start();
		
		System.out.println("Hello");
		
		service.shutdown();

	}

}
