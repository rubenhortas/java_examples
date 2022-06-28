package delegation;

/* Delegation is midway between inheritance and composition. */
@SuppressWarnings("unused")
public class SpaceShip {
    private final Control control = new Control();

    // Constructor
    public SpaceShip(String name) {
    }

    // Delegation methods
    // Methods are forwarded to the underlying controls object
    @SuppressWarnings("GrazieInspection")
    public void up(int velocity) {
        control.up(velocity);
    }

    public void down(int velocity) {
        control.down(velocity);
    }

    public void right(int velocity) {
        control.right(velocity);
    }

    public void left(int velocity) {
        control.left(velocity);
    }

    public void forward(int velocity) {
        control.forward(velocity);
    }

    public void back(int velocity) {
        control.back(velocity);
    }
}
