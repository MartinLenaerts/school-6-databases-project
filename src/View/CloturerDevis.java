package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.SystemColor;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JList;
import javax.swing.JTextPane;

public class CloturerDevis {

	private JFrame frame;
	private JTextField textField_9;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CloturerDevis window = new CloturerDevis();
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
	public CloturerDevis() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 515, 475);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		
		JLabel label = new JLabel("RentCar");
		label.setForeground(Color.BLUE);
		label.setFont(new Font("Tahoma", Font.BOLD, 15));
		label.setBounds(220, 0, 61, 19);
		panel.add(label);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 21, 499, 2);
		panel.add(separator);
		
		JButton button = new JButton("<--");
		button.setBounds(0, 21, 49, 23);
		panel.add(button);
		
		JButton button_1 = new JButton("-->");
		button_1.setBounds(51, 21, 49, 23);
		panel.add(button_1);
		
		JButton button_2 = new JButton("\u2302");
		button_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		button_2.setBounds(110, 21, 49, 23);
		panel.add(button_2);
		
		JList list = new JList();
		list.setVisibleRowCount(10);
		list.setBounds(10, 93, 196, 208);
		panel.add(list);
		
		JLabel label_9 = new JLabel("Client");
		label_9.setHorizontalAlignment(SwingConstants.CENTER);
		label_9.setForeground(Color.BLUE);
		label_9.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_9.setBounds(220, 21, 61, 19);
		panel.add(label_9);
		
		JButton btnAjouter = new JButton("Ajouter");
		btnAjouter.setBounds(11, 325, 89, 23);
		panel.add(btnAjouter);
		
		JButton btnClturer = new JButton("Cl\u00F4turer");
		btnClturer.setBounds(10, 350, 89, 23);
		panel.add(btnClturer);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(10, 70, 94, 20);
		panel.add(textField_9);
		
		JButton button_6 = new JButton("Search");
		button_6.setBounds(110, 69, 83, 21);
		panel.add(button_6);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(SystemColor.controlHighlight);
		panel_1.setBounds(212, 70, 277, 311);
		panel.add(panel_1);
		
		JLabel lblClturerDevis = new JLabel("Cl\u00F4turer devis");
		lblClturerDevis.setHorizontalAlignment(SwingConstants.CENTER);
		lblClturerDevis.setForeground(Color.RED);
		lblClturerDevis.setBounds(75, 0, 131, 14);
		panel_1.add(lblClturerDevis);
		
		JLabel lblCommentaire = new JLabel("Commentaires");
		lblCommentaire.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCommentaire.setBounds(10, 28, 90, 14);
		panel_1.add(lblCommentaire);
		
		textField_3 = new JTextField();
		textField_3.setToolTipText("");
		textField_3.setColumns(10);
		textField_3.setBounds(110, 125, 156, 20);
		panel_1.add(textField_3);
		
		JLabel lblRemiseEntat = new JLabel("Remise en \u00E9tat");
		lblRemiseEntat.setHorizontalAlignment(SwingConstants.RIGHT);
		lblRemiseEntat.setBounds(10, 128, 90, 14);
		panel_1.add(lblRemiseEntat);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(110, 150, 156, 20);
		panel_1.add(textField_4);
		
		JLabel lblNiveauCarburant = new JLabel("Niveau carburant");
		lblNiveauCarburant.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNiveauCarburant.setBounds(0, 153, 100, 14);
		panel_1.add(lblNiveauCarburant);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(110, 175, 156, 20);
		panel_1.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(110, 200, 156, 20);
		panel_1.add(textField_6);
		
		JLabel label_7 = new JLabel("Date d\u00E9but");
		label_7.setHorizontalAlignment(SwingConstants.RIGHT);
		label_7.setBounds(10, 203, 90, 14);
		panel_1.add(label_7);
		
		JButton btnTerminer = new JButton("Terminer");
		btnTerminer.setBounds(44, 277, 180, 23);
		panel_1.add(btnTerminer);
		
		JLabel label_8 = new JLabel("Date d\u00E9but");
		label_8.setHorizontalAlignment(SwingConstants.RIGHT);
		label_8.setBounds(10, 178, 90, 14);
		panel_1.add(label_8);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(110, 22, 157, 73);
		panel_1.add(textPane);
	}
}
