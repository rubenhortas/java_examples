package delegation;

/**
 * A third relationship, which is not supported by Java, is called delegation.
 * This is midway between inheritance and composition.
 */
@SuppressWarnings("unused")
public class SpaceShip {
    private final Controls controls = new Controls();

    // Constructor
    public SpaceShip(String name) {
    }

    // Delegation methods
    // Methods are forwarded to the underlying controls object
    @SuppressWarnings("GrazieInspection")
    public void up(int velocity) {
        controls.up(velocity);
    }

    public void down(int velocity) {
        controls.down(velocity);
    }

    public void right(int velocity) {
        controls.right(velocity);
    }

    public void left(int velocity) {
        controls.left(velocity);
    }

    public void forward(int velocity) {
        controls.forward(velocity);
    }

    public void back(int velocity) {
        controls.back(velocity);
    }
}


