package swInterface;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import swGameMechanics.GameData;
import swGameMechanics.PossibleMoves;
import swShips.MasterShip;
import swShips.Spaceship;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainApp {

	private JFrame frame;
	private static GameButton btnGameButton0;
	private static GameButton btnGameButton1;
	private static GameButton btnGameButton2;
	private static GameButton btnGameButton3;
	private static GameButton btnGameButton4;
	private static GameButton btnGameButton5;
	private static GameButton btnGameButton6;
	private static GameButton btnGameButton7;
	private static GameButton btnGameButton8;
	private static GameButton btnGameButton9;
	private static GameButton btnGameButton10;
	private static GameButton btnGameButton11;
	private static GameButton btnGameButton12;
	private static GameButton btnGameButton13;
	private static GameButton btnGameButton14;
	private static GameButton btnGameButton15;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainApp window = new MainApp();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainApp() {
		initialize();
	}
	
	public static void mapButtonGrid(Spaceship[] grid) {
		if(grid[0] != null)
			renderButtonGrid(btnGameButton0, grid[0]);
		if(grid[1] != null)
			renderButtonGrid(btnGameButton1, grid[1]);
		if(grid[2] != null)
			renderButtonGrid(btnGameButton2, grid[2]);
		if(grid[3] != null)
			renderButtonGrid(btnGameButton3, grid[3]);
		if(grid[4] != null)
			renderButtonGrid(btnGameButton4, grid[4]);
		if(grid[5] != null)
			renderButtonGrid(btnGameButton5, grid[5]);
		if(grid[6] != null)
			renderButtonGrid(btnGameButton6, grid[6]);
		if(grid[7] != null)
			renderButtonGrid(btnGameButton7, grid[7]);
		if(grid[8] != null)
			renderButtonGrid(btnGameButton8, grid[8]);
		if(grid[9] != null)
			renderButtonGrid(btnGameButton9, grid[9]);
		if(grid[10] != null)
			renderButtonGrid(btnGameButton10, grid[10]);
		if(grid[11] != null)
			renderButtonGrid(btnGameButton11, grid[11]);
		if(grid[12] != null)
			renderButtonGrid(btnGameButton12, grid[12]);
		if(grid[13] != null)
			renderButtonGrid(btnGameButton13, grid[13]);
		if(grid[14] != null)
			renderButtonGrid(btnGameButton14, grid[14]);
		if(grid[15] != null)
			renderButtonGrid(btnGameButton15, grid[15]);
	}
	
	public static void renderButtonGrid(GameButton btn, Spaceship ship) {
		if(ship == null)
			btn.setBackgroundNull();
		if(ship instanceof MasterShip)
			btn.setBackgroundXWing();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 549, 408);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel pnlButtonPanel = new JPanel();
		pnlButtonPanel.setBounds(12, 13, 507, 286);
		frame.getContentPane().add(pnlButtonPanel);
		pnlButtonPanel.setLayout(new GridLayout(4, 4, 0, 0));
		
		btnGameButton0 = new GameButton(0, PossibleMoves.getBtn0Moves());
		pnlButtonPanel.add(btnGameButton0);
		
		btnGameButton1 = new GameButton(1, PossibleMoves.getBtn1Moves());
		pnlButtonPanel.add(btnGameButton1);
		
		btnGameButton2 = new GameButton(2, PossibleMoves.getBtn2Moves());
		pnlButtonPanel.add(btnGameButton2);
		
		btnGameButton3 = new GameButton(3, PossibleMoves.getBtn3Moves());
		pnlButtonPanel.add(btnGameButton3);
		
		btnGameButton4 = new GameButton(4, PossibleMoves.getBtn4Moves());
		pnlButtonPanel.add(btnGameButton4);
		
		btnGameButton5 = new GameButton(5, PossibleMoves.getBtn5Moves());
		pnlButtonPanel.add(btnGameButton5);
		
		btnGameButton6 = new GameButton(6, PossibleMoves.getBtn6Moves());
		pnlButtonPanel.add(btnGameButton6);
		
		btnGameButton7 = new GameButton(7, PossibleMoves.getBtn7Moves());
		pnlButtonPanel.add(btnGameButton7);
		
		btnGameButton8 = new GameButton(8, PossibleMoves.getBtn8Moves());
		pnlButtonPanel.add(btnGameButton8);
		
		btnGameButton9 = new GameButton(9, PossibleMoves.getBtn9Moves());
		pnlButtonPanel.add(btnGameButton9);
		
		btnGameButton10 = new GameButton(10, PossibleMoves.getBtn10Moves());
		pnlButtonPanel.add(btnGameButton10);
		
		btnGameButton11 = new GameButton(11, PossibleMoves.getBtn11Moves());
		pnlButtonPanel.add(btnGameButton11);
		
		btnGameButton12 = new GameButton(12, PossibleMoves.getBtn12Moves());
		pnlButtonPanel.add(btnGameButton12);
		
		btnGameButton13 = new GameButton(13, PossibleMoves.getBtn13Moves());
		pnlButtonPanel.add(btnGameButton13);
		
		btnGameButton14 = new GameButton(14, PossibleMoves.getBtn14Moves());
		pnlButtonPanel.add(btnGameButton14);
		
		btnGameButton15 = new GameButton(15, PossibleMoves.getBtn15Moves());
		pnlButtonPanel.add(btnGameButton15);
		
		JPanel pnlOptions = new JPanel();
		pnlOptions.setBounds(12, 300, 507, 48);
		frame.getContentPane().add(pnlOptions);
		pnlOptions.setLayout(null);
		
		JButton btnNewGame = new JButton("New Game");
		btnNewGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GameData.playGame();
			}
		});
		btnNewGame.setBounds(12, 13, 97, 25);
		pnlOptions.add(btnNewGame);
	}
}
