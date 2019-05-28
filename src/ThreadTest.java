
public class ThreadTest extends Thread {

	private char id;

	public ThreadTest(char id) {
		super();
		this.id = id;
	}

	public void run() {
		try {
			for (int i = 0; i < 3; i++) {
				Thread.sleep(500);
				System.out.println(getName() + " Thread entry: " + this.id + " is running");
			}
		} catch (

		InterruptedException e) {
			System.out.println(" Error ");
		}
	}
}
