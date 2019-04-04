package swInterface;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;

public class MainApp {

	private JFrame frame;

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

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 549, 408);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(12, 13, 507, 286);
		frame.getContentPane().add(panel);
		panel.setLayout(new GridLayout(4, 4, 0, 0));
		
		JButton btnGameButton0 = new JButton("New button");
		panel.add(btnGameButton0);
		
		JButton btnGameButton1 = new JButton("New button");
		panel.add(btnGameButton1);
		
		JButton btnGameButton2 = new JButton("New button");
		panel.add(btnGameButton2);
		
		JButton btnGameButton3 = new JButton("New button");
		panel.add(btnGameButton3);
		
		JButton btnGameButton4 = new JButton("New button");
		panel.add(btnGameButton4);
		
		JButton btnGameButton5 = new JButton("New button");
		panel.add(btnGameButton5);
		
		JButton btnGameButton6 = new JButton("New button");
		panel.add(btnGameButton6);
		
		JButton btnGameButton7 = new JButton("New button");
		panel.add(btnGameButton7);
		
		JButton btnGameButton8 = new JButton("New button");
		panel.add(btnGameButton8);
		
		JButton btnGameButton9 = new JButton("New button");
		panel.add(btnGameButton9);
		
		JButton btnGameButton10 = new JButton("New button");
		panel.add(btnGameButton10);
		
		JButton btnGameButton11 = new JButton("New button");
		panel.add(btnGameButton11);
		
		JButton btnGameButton12 = new JButton("New button");
		panel.add(btnGameButton12);
		
		JButton btnGameButton13 = new JButton("New button");
		panel.add(btnGameButton13);
		
		JButton btnGameButton14 = new JButton("New button");
		panel.add(btnGameButton14);
		
		JButton btnGameButton15 = new JButton("New button");
		panel.add(btnGameButton15);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(12, 300, 507, 48);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(12, 13, 97, 25);
		panel_1.add(btnNewButton);
	}
}
