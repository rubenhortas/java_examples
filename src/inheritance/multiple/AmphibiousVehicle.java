package inheritance.multiple;

/* In Java you can do Multiple Inheritance implementing interfaces. If you do
   inherit from a non-interface, you can inherit from only one.
   You can have as many interfaces as you want. You can upcast to each
   interface. */
@SuppressWarnings({"unused", "GrazieInspection"})
public class AmphibiousVehicle implements ICar, IShip {
    @Override
    public void canFloat() {
        System.out.println("I can float");
    }

    @Override
    public void canRun() {
        System.out.println("I can run");
    }
}
