public class Main {

	public static void main(String[] args) {
		ThreadTest thread1 = new ThreadTest('A');
		ThreadTest thread2 = new ThreadTest('B');
		ThreadTest thread3 = new ThreadTest('C');

		thread1.run();
		thread1.setPriority(Thread.MIN_PRIORITY);
		System.out.println("running thread priority is:" + thread1.getPriority());

		thread2.run();
		thread2.setPriority(Thread.NORM_PRIORITY);
		System.out.println("running thread priority is:" + thread2.getPriority());

		thread3.run();
		thread3.setPriority(Thread.MAX_PRIORITY);
		System.out.println("running thread priority is:" + thread3.getPriority());
	}
}
