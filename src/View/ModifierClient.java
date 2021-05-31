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

public class ModifierClient {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ModifierClient window = new ModifierClient();
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
	public ModifierClient() {
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
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(SystemColor.controlHighlight);
		panel_1.setBounds(235, 55, 254, 357);
		panel.add(panel_1);
		
		JLabel lblModifierInfoClient = new JLabel("Modifier info client");
		lblModifierInfoClient.setHorizontalAlignment(SwingConstants.CENTER);
		lblModifierInfoClient.setForeground(Color.RED);
		lblModifierInfoClient.setBounds(75, 0, 131, 14);
		panel_1.add(lblModifierInfoClient);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(60, 25, 156, 20);
		panel_1.add(textField);
		
		JLabel label_2 = new JLabel("Nom");
		label_2.setBounds(10, 28, 46, 14);
		panel_1.add(label_2);
		
		JLabel label_3 = new JLabel("Prenom");
		label_3.setBounds(10, 53, 46, 14);
		panel_1.add(label_3);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(60, 50, 156, 20);
		panel_1.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(60, 75, 156, 20);
		panel_1.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(60, 100, 156, 20);
		panel_1.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setToolTipText("");
		textField_4.setColumns(10);
		textField_4.setBounds(60, 125, 156, 20);
		panel_1.add(textField_4);
		
		JLabel label_4 = new JLabel("Email");
		label_4.setBounds(10, 78, 46, 14);
		panel_1.add(label_4);
		
		JLabel label_5 = new JLabel("N\u00B0 Tel");
		label_5.setBounds(10, 103, 46, 14);
		panel_1.add(label_5);
		
		JLabel label_6 = new JLabel("Adresse");
		label_6.setBounds(10, 128, 46, 14);
		panel_1.add(label_6);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(60, 150, 156, 20);
		panel_1.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(60, 175, 156, 20);
		panel_1.add(textField_6);
		
		JCheckBox checkBox = new JCheckBox("Oui");
		checkBox.setBounds(60, 200, 53, 23);
		panel_1.add(checkBox);
		
		JCheckBox checkBox_1 = new JCheckBox("Non");
		checkBox_1.setBounds(128, 200, 53, 23);
		panel_1.add(checkBox_1);
		
		JLabel label_7 = new JLabel("Fid\u00E9lit\u00E9");
		label_7.setBounds(10, 204, 46, 14);
		panel_1.add(label_7);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(60, 225, 156, 20);
		panel_1.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(122, 250, 94, 20);
		panel_1.add(textField_8);
		
		JLabel label_8 = new JLabel("Date souscription");
		label_8.setBounds(10, 253, 103, 14);
		panel_1.add(label_8);
		
		JButton button_3 = new JButton("Valider");
		button_3.setBounds(155, 323, 89, 23);
		panel_1.add(button_3);
		
		JButton btnRenouveler = new JButton("Renouveler fid\u00E9lit\u00E9");
		btnRenouveler.setBounds(31, 275, 180, 23);
		panel_1.add(btnRenouveler);
		
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
		
		JButton button_4 = new JButton("Modifier");
		button_4.setBounds(11, 325, 89, 23);
		panel.add(button_4);
		
		JButton button_5 = new JButton("Consulter");
		button_5.setBounds(10, 350, 89, 23);
		panel.add(button_5);
		
		JButton button_6 = new JButton("Ajouter");
		button_6.setBounds(10, 375, 89, 23);
		panel.add(button_6);
	}

}
