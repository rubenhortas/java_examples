package inheritance.upcasting;

// Example of inheritance.upcasting.
public class Wind extends Instrument {
    /* Tune accepts an instrument reference. Wind object is an Instrument
       object. Upcasting is always safe, but the class interface can lose
       methods. */
    public static void main(String[] args) {
        Wind flute = new Wind();
        tune(flute); // Upcasting
    }
}
