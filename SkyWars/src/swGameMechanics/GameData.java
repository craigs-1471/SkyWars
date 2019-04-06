package swGameMechanics;

import java.util.ArrayList;
import java.util.Random;

import swInterface.MainApp;
import swShips.BattleStar;
import swShips.MasterShip;
import swShips.Spaceship;

public class GameData {
	
	private static final int GRID_LENGTH = 16;
	private static ArrayList<ArrayList<Spaceship>> gridList;
	private static Spaceship[] grid;
	private static Spaceship player;
	private static ArrayList<Spaceship> enemies;
	private static boolean gameOver;
	private static boolean usersGo;
	
	public static void playGame() {
		//grid = new Spaceship[GRID_LENGTH];
		gridList = new ArrayList<ArrayList<Spaceship>>(GRID_LENGTH);
		GridList.setGridList(gridList);
		player = new MasterShip();
		initialPlayerListLocation(player);
		enemies = new ArrayList<Spaceship>();
		gameOver = false;
		usersGo = true;
		MainApp.mapButtonGridList(gridList);
		/*
		for(int i = 0; i < GRID_LENGTH; i++) {
			grid[i] = null;
		}
		player = new MasterShip();
		enemies = new ArrayList<Spaceship>();
		gameOver = false;
		usersGo = true;
		initialLocationGenerator(player);
		System.out.println(player.getCurrentLocation());
		MainApp.mapButtonGrid(grid);
		*/
	}
	
	public static void initialPlayerListLocation(Spaceship player) {
		Random numGenerator = new Random();
		int randLocation = numGenerator.nextInt(GRID_LENGTH);
		gridList.get(randLocation).add(player);
		player.setCurrentLocation(randLocation);
	}
	/*
	public static void initialLocationGenerator(Spaceship player) {
		Random numGenerator = new Random();
		int randLocation = numGenerator.nextInt(GRID_LENGTH);
		grid[randLocation] = player;
		player.setCurrentLocation(randLocation);
	}
	*/
	public static void randomEnemyShip() {
		int possibleEnemy = 3; // i.e. one in three chance of spawning enemy
		Random numGenerator = new Random();
		int randNumber = numGenerator.nextInt(possibleEnemy);
		if(randNumber == 0)
			spawnEnemyShip();
	}
	
	public static void spawnEnemyShip() {
		int typesOfShip = 3; 
		//Random numGenerator = new Random();
		//int randNumber = numGenerator.nextInt(typesOfShip);
		int randNumber = 1;
		if(randNumber == 1) {
			gridList.get(0).add(new BattleStar());
			//enemies.add(new BattleStar(grid));
		}
		MainApp.mapButtonGridList(gridList);
	}
	/*
	public static void moveEnemyShips() {
		EnemyMovements.moveEnemies(grid, enemies);
		MainApp.mapButtonGrid(grid);
	}
	*/
	
	public static Spaceship[] getGrid() {
		return grid;
	}

	public static ArrayList<ArrayList<Spaceship>> getGridList() {
		return gridList;
	}

	public static void setGridList(ArrayList<ArrayList<Spaceship>> gridList) {
		GameData.gridList = gridList;
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
