package swInterface;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import swGameMechanics.ChangeButtonImage;
import swGameMechanics.GameData;
import swGameMechanics.MoveVerification;
import swShips.Spaceship;

public class GameButton extends JButton implements ActionListener {
	
	private ImageIcon xWing;
	private int btnIndex;
	private ArrayList<Integer> possibleMoves;
	private boolean movePossible;
	
	public GameButton(int index, ArrayList<Integer> moves) {
		xWing = new ImageIcon(this.getClass().getResource("/swResources/x-wing100.png"));
		setBtnIndex(index);
		setPossibleMoves(moves);
		addActionListener(this);
	}
	public void setBackgroundXWing() {
		setIcon(xWing);
	}
	public void setBackgroundNull() {
		setIcon(null);
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		int currentLocation = GameData.getPlayer().getCurrentLocation();
		movePossible = MoveVerification.isMovePossible(currentLocation, possibleMoves);
		if(GameData.isUsersGo() && movePossible) {
			Spaceship[] grid = GameData.getGrid();
			grid[currentLocation] = null;
			grid[btnIndex] = GameData.getPlayer();
			GameData.setGrid(grid);
			MainApp.mapButtonGrid(grid);
			//setBackgroundXWing();
			ChangeButtonImage.changeBtnNull(currentLocation);
			GameData.getPlayer().setCurrentLocation(btnIndex);
		}
	}

	public int getBtnIndex() {
		return btnIndex;
	}

	public void setBtnIndex(int btnIndex) {
		this.btnIndex = btnIndex;
	}

	public ArrayList<Integer> getPossibleMoves() {
		return possibleMoves;
	}

	public void setPossibleMoves(ArrayList<Integer> possibleMoves) {
		this.possibleMoves = possibleMoves;
	}

	public boolean isMovePossible() {
		return movePossible;
	}

	public void setMovePossible(boolean movePossible) {
		this.movePossible = movePossible;
	}
}
