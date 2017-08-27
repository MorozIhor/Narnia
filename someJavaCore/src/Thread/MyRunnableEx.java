package Thread;

public class MyRunnableEx implements Runnable {

	@Override
	public void run() {
		for (int i = 10; i >= 0 ; i--) {
			System.out.print(i+" ");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
