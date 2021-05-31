package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.SystemColor;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JList;
import javax.swing.JScrollBar;

public class AjoutClient {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField txtRue;
	private JTextField txtVille;
	private JTextField txtCodePostal;
	private JTextField txtProgrammeFidlit;
	private JTextField txtJjmmaaaa;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AjoutClient window = new AjoutClient();
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
	public AjoutClient() {
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
		panel_1.setBackground(SystemColor.controlHighlight);
		panel_1.setBounds(235, 55, 254, 327);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ajouter un client");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(75, 0, 131, 14);
		panel_1.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(60, 25, 156, 20);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Nom");
		lblNewLabel_1.setBounds(10, 28, 46, 14);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblPrenom = new JLabel("Prenom");
		lblPrenom.setBounds(10, 53, 46, 14);
		panel_1.add(lblPrenom);
		
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
		
		txtRue = new JTextField();
		txtRue.setText("Rue");
		txtRue.setToolTipText("");
		txtRue.setColumns(10);
		txtRue.setBounds(60, 125, 156, 20);
		panel_1.add(txtRue);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(10, 78, 46, 14);
		panel_1.add(lblEmail);
		
		JLabel lblNTel = new JLabel("N\u00B0 Tel");
		lblNTel.setBounds(10, 103, 46, 14);
		panel_1.add(lblNTel);
		
		JLabel lblAdresse = new JLabel("Adresse");
		lblAdresse.setBounds(10, 128, 46, 14);
		panel_1.add(lblAdresse);
		
		txtVille = new JTextField();
		txtVille.setText("Ville");
		txtVille.setColumns(10);
		txtVille.setBounds(60, 150, 156, 20);
		panel_1.add(txtVille);
		
		txtCodePostal = new JTextField();
		txtCodePostal.setText("Code postal");
		txtCodePostal.setColumns(10);
		txtCodePostal.setBounds(60, 175, 156, 20);
		panel_1.add(txtCodePostal);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Oui");
		chckbxNewCheckBox.setBounds(60, 200, 53, 23);
		panel_1.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNon = new JCheckBox("Non");
		chckbxNon.setBounds(128, 200, 53, 23);
		panel_1.add(chckbxNon);
		
		JLabel lblFidlit = new JLabel("Fid\u00E9lit\u00E9");
		lblFidlit.setBounds(10, 204, 46, 14);
		panel_1.add(lblFidlit);
		
		txtProgrammeFidlit = new JTextField();
		txtProgrammeFidlit.setText("Nom programme fid\u00E9lit\u00E9");
		txtProgrammeFidlit.setColumns(10);
		txtProgrammeFidlit.setBounds(60, 225, 156, 20);
		panel_1.add(txtProgrammeFidlit);
		
		txtJjmmaaaa = new JTextField();
		txtJjmmaaaa.setText("JJ/MM/AAAA");
		txtJjmmaaaa.setColumns(10);
		txtJjmmaaaa.setBounds(122, 250, 94, 20);
		panel_1.add(txtJjmmaaaa);
		
		JLabel lblDate = new JLabel("Date souscription");
		lblDate.setBounds(10, 253, 103, 14);
		panel_1.add(lblDate);
		
		JButton btnNewButton = new JButton("Valider");
		btnNewButton.setBounds(155, 293, 89, 23);
		panel_1.add(btnNewButton);
		
		JList list = new JList();
		list.setVisibleRowCount(10);
		list.setBounds(10, 93, 196, 208);
		panel.add(list);
		
		JLabel lblClient = new JLabel("Client");
		lblClient.setHorizontalAlignment(SwingConstants.CENTER);
		lblClient.setForeground(Color.BLUE);
		lblClient.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblClient.setBounds(220, 21, 61, 19);
		panel.add(lblClient);
		
		JButton btnModifier = new JButton("Modifier");
		btnModifier.setBounds(11, 325, 89, 23);
		panel.add(btnModifier);
		
		JButton btnConsulter = new JButton("Consulter");
		btnConsulter.setBounds(10, 350, 89, 23);
		panel.add(btnConsulter);
		
		JButton btnAjouter = new JButton("Ajouter");
		btnAjouter.setBounds(10, 375, 89, 23);
		panel.add(btnAjouter);
	}
}
