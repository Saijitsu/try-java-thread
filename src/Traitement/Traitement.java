package Traitement;

public class Traitement implements Runnable {
	private int id = 0;

	@Override
	public void run() {
		System.out.println("Mon traitement: " + this.id);
		this.id++;
	}
}
