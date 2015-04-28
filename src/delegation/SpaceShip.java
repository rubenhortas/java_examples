package delegation;

/**
 * Java 
 * 
 * @author	 Rubén Hortas Astariz <http://rubenhortas.blogspot.com.es>
 * @contact  rubenhortas at gmail.com
 * @web 	 http://www.rubenhortas.blogspot.com.es
 * @github:  http://github.com/rubenhortas
 * @license: CC BY-NC-SA 3.0 <http://creativecommons.org/licenses/by-nc-sa/3.0/>
 * @file: 	 SpaceShip.java
 */

/*
 * A third relationship, which is not supported by Java, is called delegation.
 * This is midway between inheritance and composition.
 */

public class SpaceShip {

	@SuppressWarnings("unused")
	private String name;
	private Controls controls  = new Controls();
	
	// Constructor
	public SpaceShip(String name) {
		this.name = name;
	}
	
	// Delegation methods
	// Methods are forwarded to the underlying controls object
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


