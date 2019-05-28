public class Main {

	public static void main(String[] args) {
		ThreadTest thread1 = new ThreadTest('A');
		ThreadTest thread2 = new ThreadTest('B');
		ThreadTest thread3 = new ThreadTest('C');

		thread1.run();
		thread2.run();
		thread3.run();

	}
}
