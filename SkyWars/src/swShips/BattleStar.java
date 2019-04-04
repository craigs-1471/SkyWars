package swShips;

public class BattleStar extends Spaceship {
	
	public BattleStar() {}
	
	public BattleStar(Spaceship[] grid) {
		grid[0] = this;
		setCurrentLocation(0);
	}
	
}
