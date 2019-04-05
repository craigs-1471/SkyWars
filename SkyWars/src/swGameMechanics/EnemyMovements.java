package swGameMechanics;

import java.util.ArrayList;
import java.util.Random;

import swShips.Spaceship;

public class EnemyMovements {
	
	public static void moveEnemies(Spaceship[] grid, ArrayList<Spaceship> enemies) {
		int currentLocation;
		ArrayList<Integer> possibleMoves = null;
		int newLocation;
		for(Spaceship s: enemies) {
			currentLocation = s.getCurrentLocation();
			possibleMoves = PossibleMoves.getPossibleMoves(currentLocation);
			newLocation = getRandomMove(possibleMoves);
			while(grid[newLocation] != null) {
				newLocation = getRandomMove(possibleMoves);
			}
			grid[currentLocation] = null;
			grid[newLocation] = s;
		}
	}
	
	public static int getRandomMove(ArrayList<Integer> possibleMoves) {
		Random numGenerator = new Random();
		int numOfPossibleMoves = possibleMoves.size();
		int randomMove = numGenerator.nextInt(numOfPossibleMoves);
		int randMoveLocation = possibleMoves.get(randomMove);
		return randMoveLocation;
	}
	
}	
