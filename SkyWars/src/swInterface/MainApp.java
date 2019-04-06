package swInterface;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import swGameMechanics.GameData;
import swGameMechanics.PossibleMoves;
import swShips.BattleStar;
import swShips.MasterShip;
import swShips.Spaceship;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
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
	
	public static void mapButtonGridList(ArrayList<ArrayList<Spaceship>> gridList) {
		if(gridList.get(0) != null) {
			if(checkForInstanceOfPlayer(gridList.get(0))) {
				btnGameButton0.setBackgroundXWing();
			}
			else if(checkForInstanceOfBattleStar(gridList.get(0))) {
				btnGameButton0.setBackgroundBattleStar();
			}	
		}
		if(gridList.get(1) != null) {
			if(checkForInstanceOfPlayer(gridList.get(1))) {
				btnGameButton1.setBackgroundXWing();
			}
			else if(checkForInstanceOfBattleStar(gridList.get(1))) {
				btnGameButton1.setBackgroundBattleStar();
			}	
		}
		if(gridList.get(2) != null) {
			if(checkForInstanceOfPlayer(gridList.get(2))) {
				btnGameButton2.setBackgroundXWing();
			}
			else if(checkForInstanceOfBattleStar(gridList.get(2))) {
				btnGameButton2.setBackgroundBattleStar();
			}	
		}
		if(gridList.get(3) != null) {
			if(checkForInstanceOfPlayer(gridList.get(3))) {
				btnGameButton3.setBackgroundXWing();
			}
			else if(checkForInstanceOfBattleStar(gridList.get(3))) {
				btnGameButton3.setBackgroundBattleStar();
			}	
		}
		if(gridList.get(4) != null) {
			if(checkForInstanceOfPlayer(gridList.get(4))) {
				btnGameButton4.setBackgroundXWing();
			}
			else if(checkForInstanceOfBattleStar(gridList.get(4))) {
				btnGameButton4.setBackgroundBattleStar();
			}	
		}
		if(gridList.get(5) != null) {
			if(checkForInstanceOfPlayer(gridList.get(5))) {
				btnGameButton5.setBackgroundXWing();
			}
			else if(checkForInstanceOfBattleStar(gridList.get(5))) {
				btnGameButton5.setBackgroundBattleStar();
			}	
		}
		if(gridList.get(6) != null) {
			if(checkForInstanceOfPlayer(gridList.get(6))) {
				btnGameButton6.setBackgroundXWing();
			}
			else if(checkForInstanceOfBattleStar(gridList.get(6))) {
				btnGameButton6.setBackgroundBattleStar();
			}	
		}
		if(gridList.get(7) != null) {
			if(checkForInstanceOfPlayer(gridList.get(7))) {
				btnGameButton7.setBackgroundXWing();
			}
			else if(checkForInstanceOfBattleStar(gridList.get(7))) {
				btnGameButton7.setBackgroundBattleStar();
			}	
		}
		if(gridList.get(8) != null) {
			if(checkForInstanceOfPlayer(gridList.get(8))) {
				btnGameButton8.setBackgroundXWing();
			}
			else if(checkForInstanceOfBattleStar(gridList.get(8))) {
				btnGameButton8.setBackgroundBattleStar();
			}	
		}
		if(gridList.get(9) != null) {
			if(checkForInstanceOfPlayer(gridList.get(9))) {
				btnGameButton9.setBackgroundXWing();
			}
			else if(checkForInstanceOfBattleStar(gridList.get(9))) {
				btnGameButton9.setBackgroundBattleStar();
			}	
		}
		if(gridList.get(10) != null) {
			if(checkForInstanceOfPlayer(gridList.get(10))) {
				btnGameButton10.setBackgroundXWing();
			}
			else if(checkForInstanceOfBattleStar(gridList.get(10))) {
				btnGameButton10.setBackgroundBattleStar();
			}	
		}
		if(gridList.get(11) != null) {
			if(checkForInstanceOfPlayer(gridList.get(11))) {
				btnGameButton11.setBackgroundXWing();
			}
			else if(checkForInstanceOfBattleStar(gridList.get(11))) {
				btnGameButton11.setBackgroundBattleStar();
			}	
		}
		if(gridList.get(12) != null) {
			if(checkForInstanceOfPlayer(gridList.get(12))) {
				btnGameButton12.setBackgroundXWing();
			}
			else if(checkForInstanceOfBattleStar(gridList.get(12))) {
				btnGameButton12.setBackgroundBattleStar();
			}	
		}
		if(gridList.get(13) != null) {
			if(checkForInstanceOfPlayer(gridList.get(13))) {
				btnGameButton13.setBackgroundXWing();
			}
			else if(checkForInstanceOfBattleStar(gridList.get(13))) {
				btnGameButton13.setBackgroundBattleStar();
			}	
		}
		if(gridList.get(14) != null) {
			if(checkForInstanceOfPlayer(gridList.get(14))) {
				btnGameButton14.setBackgroundXWing();
			}
			else if(checkForInstanceOfBattleStar(gridList.get(14))) {
				btnGameButton14.setBackgroundBattleStar();
			}	
		}
		if(gridList.get(15) != null) {
			if(checkForInstanceOfPlayer(gridList.get(15))) {
				btnGameButton15.setBackgroundXWing();
			}
			else if(checkForInstanceOfBattleStar(gridList.get(15))) {
				btnGameButton15.setBackgroundBattleStar();
			}	
		}
	}
	
	public static boolean checkForInstanceOfPlayer(ArrayList<Spaceship> list) {
		 for (Spaceship s : list) {
		        if (s instanceof MasterShip) {
		            return true;
		        }
		    }
		    return false;
	}
	
	public static boolean checkForInstanceOfBattleStar(ArrayList<Spaceship> list) {
		 for (Spaceship s : list) {
		        if (s instanceof BattleStar) {
		            return true;
		        }
		    }
		    return false;
	}
	/*
	public static void renderButtonGrid(GameButton btn, Spaceship ship) {
		if(ship == null)
			btn.setBackgroundNull();
		if(ship instanceof MasterShip)
			btn.setBackgroundXWing();
		if(ship instanceof BattleStar)
			btn.setBackgroundBattleStar();
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
		if(ship instanceof BattleStar)
			btn.setBackgroundBattleStar();
	}
	*/
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

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	public static GameButton getBtnGameButton0() {
		return btnGameButton0;
	}

	public static void setBtnGameButton0(GameButton btnGameButton0) {
		MainApp.btnGameButton0 = btnGameButton0;
	}

	public static GameButton getBtnGameButton1() {
		return btnGameButton1;
	}

	public static void setBtnGameButton1(GameButton btnGameButton1) {
		MainApp.btnGameButton1 = btnGameButton1;
	}

	public static GameButton getBtnGameButton2() {
		return btnGameButton2;
	}

	public static void setBtnGameButton2(GameButton btnGameButton2) {
		MainApp.btnGameButton2 = btnGameButton2;
	}

	public static GameButton getBtnGameButton3() {
		return btnGameButton3;
	}

	public static void setBtnGameButton3(GameButton btnGameButton3) {
		MainApp.btnGameButton3 = btnGameButton3;
	}

	public static GameButton getBtnGameButton4() {
		return btnGameButton4;
	}

	public static void setBtnGameButton4(GameButton btnGameButton4) {
		MainApp.btnGameButton4 = btnGameButton4;
	}

	public static GameButton getBtnGameButton5() {
		return btnGameButton5;
	}

	public static void setBtnGameButton5(GameButton btnGameButton5) {
		MainApp.btnGameButton5 = btnGameButton5;
	}

	public static GameButton getBtnGameButton6() {
		return btnGameButton6;
	}

	public static void setBtnGameButton6(GameButton btnGameButton6) {
		MainApp.btnGameButton6 = btnGameButton6;
	}

	public static GameButton getBtnGameButton7() {
		return btnGameButton7;
	}

	public static void setBtnGameButton7(GameButton btnGameButton7) {
		MainApp.btnGameButton7 = btnGameButton7;
	}

	public static GameButton getBtnGameButton8() {
		return btnGameButton8;
	}

	public static void setBtnGameButton8(GameButton btnGameButton8) {
		MainApp.btnGameButton8 = btnGameButton8;
	}

	public static GameButton getBtnGameButton9() {
		return btnGameButton9;
	}

	public static void setBtnGameButton9(GameButton btnGameButton9) {
		MainApp.btnGameButton9 = btnGameButton9;
	}

	public static GameButton getBtnGameButton10() {
		return btnGameButton10;
	}

	public static void setBtnGameButton10(GameButton btnGameButton10) {
		MainApp.btnGameButton10 = btnGameButton10;
	}

	public static GameButton getBtnGameButton11() {
		return btnGameButton11;
	}

	public static void setBtnGameButton11(GameButton btnGameButton11) {
		MainApp.btnGameButton11 = btnGameButton11;
	}

	public static GameButton getBtnGameButton12() {
		return btnGameButton12;
	}

	public static void setBtnGameButton12(GameButton btnGameButton12) {
		MainApp.btnGameButton12 = btnGameButton12;
	}

	public static GameButton getBtnGameButton13() {
		return btnGameButton13;
	}

	public static void setBtnGameButton13(GameButton btnGameButton13) {
		MainApp.btnGameButton13 = btnGameButton13;
	}

	public static GameButton getBtnGameButton14() {
		return btnGameButton14;
	}

	public static void setBtnGameButton14(GameButton btnGameButton14) {
		MainApp.btnGameButton14 = btnGameButton14;
	}

	public static GameButton getBtnGameButton15() {
		return btnGameButton15;
	}

	public static void setBtnGameButton15(GameButton btnGameButton15) {
		MainApp.btnGameButton15 = btnGameButton15;
	}
	
}
