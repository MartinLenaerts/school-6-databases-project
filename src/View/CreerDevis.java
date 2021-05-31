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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CreerDevis {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreerDevis window = new CreerDevis();
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
	public CreerDevis() {
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
		
		JLabel label_1 = new JLabel("Client");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setForeground(Color.BLUE);
		label_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_1.setBounds(220, 21, 61, 19);
		panel.add(label_1);
		
		JButton button_3 = new JButton("Ajouter");
		button_3.setBounds(11, 325, 89, 23);
		panel.add(button_3);
		
		JButton button_4 = new JButton("Cl\u00F4turer");
		button_4.setBounds(10, 350, 89, 23);
		panel.add(button_4);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(10, 70, 94, 20);
		panel.add(textField);
		
		JButton button_5 = new JButton("Search");
		button_5.setBounds(110, 69, 83, 21);
		panel.add(button_5);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(SystemColor.controlHighlight);
		panel_1.setBounds(220, 70, 269, 311);
		panel.add(panel_1);
		
		JLabel label_2 = new JLabel("Nouveau devis");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setForeground(Color.RED);
		label_2.setBounds(75, 0, 131, 14);
		panel_1.add(label_2);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(100, 25, 156, 20);
		panel_1.add(textField_1);
		
		JLabel label_3 = new JLabel("Nom");
		label_3.setHorizontalAlignment(SwingConstants.RIGHT);
		label_3.setBounds(44, 28, 46, 14);
		panel_1.add(label_3);
		
		JLabel label_4 = new JLabel("Prenom");
		label_4.setHorizontalAlignment(SwingConstants.RIGHT);
		label_4.setBounds(44, 53, 46, 14);
		panel_1.add(label_4);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(100, 50, 156, 20);
		panel_1.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(100, 75, 156, 20);
		panel_1.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setToolTipText("");
		textField_4.setColumns(10);
		textField_4.setBounds(100, 125, 156, 20);
		panel_1.add(textField_4);
		
		JLabel label_5 = new JLabel("Email");
		label_5.setHorizontalAlignment(SwingConstants.RIGHT);
		label_5.setBounds(44, 78, 46, 14);
		panel_1.add(label_5);
		
		JLabel label_6 = new JLabel("Immatriculation");
		label_6.setHorizontalAlignment(SwingConstants.RIGHT);
		label_6.setBounds(0, 128, 90, 14);
		panel_1.add(label_6);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(100, 150, 156, 20);
		panel_1.add(textField_5);
		
		JLabel label_7 = new JLabel("Assurance");
		label_7.setHorizontalAlignment(SwingConstants.RIGHT);
		label_7.setBounds(0, 153, 90, 14);
		panel_1.add(label_7);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(100, 200, 156, 20);
		panel_1.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(100, 225, 156, 20);
		panel_1.add(textField_7);
		
		JLabel label_8 = new JLabel("Date d\u00E9but");
		label_8.setHorizontalAlignment(SwingConstants.RIGHT);
		label_8.setBounds(0, 228, 90, 14);
		panel_1.add(label_8);
		
		JButton button_6 = new JButton("G\u00E9n\u00E9rer devis");
		button_6.setBounds(44, 277, 180, 23);
		panel_1.add(button_6);
		
		JLabel label_9 = new JLabel("Date d\u00E9but");
		label_9.setHorizontalAlignment(SwingConstants.RIGHT);
		label_9.setBounds(0, 203, 90, 14);
		panel_1.add(label_9);
	}

}
