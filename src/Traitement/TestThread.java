package Traitement;

public class TestThread {

	public static void main(String[] args) {
		Runnable runnable = new Traitement();

		for (int i = 0; i < 10; i++) {
			Thread thread = new Thread(runnable);
			thread.start();
		}
	}
}