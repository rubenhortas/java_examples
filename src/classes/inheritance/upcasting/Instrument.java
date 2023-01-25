package classes.inheritance.upcasting;

public class Instrument {
	public void play() {
		System.out.println("Playing...");
	}

	static void tune(Instrument instrument) {
		instrument.play();
	}
}
