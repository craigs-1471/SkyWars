package swGameMechanics;

import java.util.ArrayList;
import java.util.Random;

import swInterface.MainApp;
import swShips.MasterShip;
import swShips.Spaceship;

public class GameData {
	
	private static final int GRID_LENGTH = 16;
	private static Spaceship[] grid;
	private static Spaceship player;
	private static ArrayList<Spaceship> enemies;
	private static boolean gameOver;
	private static boolean usersGo;
	
	public static void playGame() {
		grid = new Spaceship[GRID_LENGTH];
		for(int i = 0; i < GRID_LENGTH; i++) {
			grid[i] = null;
		}
		player = new MasterShip();
		gameOver = false;
		usersGo = true;
		initialLocationGenerator(player);
		System.out.println(player.getCurrentLocation());
		MainApp.mapButtonGrid(grid);
	}
	
	public static void initialLocationGenerator(Spaceship player) {
		Random numGenerator = new Random();
		int randLocation = numGenerator.nextInt(GRID_LENGTH);
		grid[randLocation] = player;
		player.setCurrentLocation(randLocation);
	}

	public static Spaceship[] getGrid() {
		return grid;
	}

	public static void setGrid(Spaceship[] grid) {
		GameData.grid = grid;
	}

	public static Spaceship getPlayer() {
		return player;
	}

	public static void setPlayer(Spaceship player) {
		GameData.player = player;
	}

	public static ArrayList<Spaceship> getEnemies() {
		return enemies;
	}

	public static void setEnemies(ArrayList<Spaceship> enemies) {
		GameData.enemies = enemies;
	}

	public static boolean isGameOver() {
		return gameOver;
	}

	public static void setGameOver(boolean gameOver) {
		GameData.gameOver = gameOver;
	}

	public static boolean isUsersGo() {
		return usersGo;
	}

	public static void setUsersGo(boolean usersGo) {
		GameData.usersGo = usersGo;
	}

	public static int getGridLength() {
		return GRID_LENGTH;
	}
}
