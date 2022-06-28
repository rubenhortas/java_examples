package inheritance.upcasting;

public class Instrument {
	public void play() {
		System.out.println("playing...");
	}

	static void tune(Instrument i) {
		i.play();
	}
}
