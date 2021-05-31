package View;

import java.awt.EventQueue;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ConsultClient extends JPanel{

	private JFrame frame;
	private JTextField nomTextField;
	private JTextField prenomTextField;
	private JTextField emailTextField;
	private JTextField telTextField;
	private JTextField addresseTextField;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField dateSouscriptionTextField;
	private JTextField textField_9;
	private JButton previousButton;
	private JButton homeButton;

	private Window w;
	/**
	 * Create the application.
	 */
	public ConsultClient(Window w,boolean add) {
		this.setLayout(null);
		initialize();
		this.w = w;
		if(add)w.getContentPane().add(this);
		else{
			w.setContentPane(this);
			w.revalidate();
		}
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		JLabel label = new JLabel("RentCar");
		label.setForeground(Color.BLUE);
		label.setFont(new Font("Tahoma", Font.BOLD, 15));
		label.setBounds(220, 0, 100, 19);
		this.add(label);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 21, 499, 2);
		this.add(separator);
		
		previousButton = new JButton("<--");
		previousButton.setBounds(0, 21, 49, 23);
		this.add(previousButton);

		
		homeButton= new JButton("\u2302");
		homeButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		homeButton.setBounds(110, 21, 49, 23);
		this.add(homeButton);
		
		JPanel this_1 = new JPanel();
		this_1.setLayout(null);
		this_1.setBackground(SystemColor.controlHighlight);
		this_1.setBounds(235, 55, 254, 327);
		this.add(this_1);
		
		JLabel lblInformationsClient = new JLabel("Informations client");
		lblInformationsClient.setHorizontalAlignment(SwingConstants.CENTER);
		lblInformationsClient.setForeground(Color.RED);
		lblInformationsClient.setBounds(75, 0, 131, 14);
		this_1.add(lblInformationsClient);


		JLabel label_2 = new JLabel("Nom");
		label_2.setBounds(10, 28, 46, 14);
		this_1.add(label_2);

		nomTextField = new JTextField();
		nomTextField.setColumns(10);
		nomTextField.setBounds(60, 25, 156, 20);
		this_1.add(nomTextField);


		JLabel label_3 = new JLabel("Prenom");
		label_3.setBounds(10, 53, 46, 14);
		this_1.add(label_3);

		prenomTextField = new JTextField();
		prenomTextField.setColumns(10);
		prenomTextField.setBounds(60, 50, 156, 20);
		this_1.add(prenomTextField);
		



		JLabel label_4 = new JLabel("Email");
		label_4.setBounds(10, 78, 46, 14);
		this_1.add(label_4);
		emailTextField = new JTextField();
		emailTextField.setColumns(10);
		emailTextField.setBounds(60, 75, 156, 20);
		this_1.add(emailTextField);



		JLabel label_5 = new JLabel("N\u00B0 Tel");
		label_5.setBounds(10, 103, 46, 14);
		this_1.add(label_5);
		telTextField = new JTextField();
		telTextField.setColumns(10);
		telTextField.setBounds(60, 100, 156, 20);
		this_1.add(telTextField);


		JLabel label_6 = new JLabel("Adresse");
		label_6.setBounds(10, 128, 46, 14);
		this_1.add(label_6);

		addresseTextField = new JTextField();
		addresseTextField.setToolTipText("");
		addresseTextField.setColumns(10);
		addresseTextField.setBounds(60, 125, 156, 20);
		this_1.add(addresseTextField);



		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(60, 150, 156, 20);
		this_1.add(textField_5);

		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(60, 175, 156, 20);
		this_1.add(textField_6);


		JLabel label_7 = new JLabel("Fid\u00E9lit\u00E9");
		label_7.setBounds(10, 204, 46, 14);
		this_1.add(label_7);
		
		JCheckBox checkBox = new JCheckBox("Oui");
		checkBox.setBounds(60, 200, 53, 23);
		this_1.add(checkBox);

		JCheckBox checkBox_1 = new JCheckBox("Non");
		checkBox_1.setBounds(128, 200, 53, 23);
		this_1.add(checkBox_1);

		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(60, 225, 156, 20);
		this_1.add(textField_7);



		JLabel label_8 = new JLabel("Date souscription");
		label_8.setBounds(10, 253, 103, 14);
		this_1.add(label_8);

		dateSouscriptionTextField = new JTextField();
		dateSouscriptionTextField.setColumns(10);
		dateSouscriptionTextField.setBounds(122, 250, 94, 20);
		this_1.add(dateSouscriptionTextField);

		ButtonGroup bg = new ButtonGroup();
		bg.add(new JRadioButton("Oui"));
		bg.add(new JRadioButton("Non"));
		
		JList list = new JList();
		list.setVisibleRowCount(10);
		list.setBounds(10, 93, 196, 208);
		this.add(list);
		
		JLabel label_9 = new JLabel("Client");
		label_9.setHorizontalAlignment(SwingConstants.CENTER);
		label_9.setForeground(Color.BLUE);
		label_9.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_9.setBounds(220, 21, 61, 19);
		this.add(label_9);
		
		JButton button_4 = new JButton("Modifier");
		button_4.setBounds(11, 325, 89, 23);
		this.add(button_4);
		
		JButton button_5 = new JButton("Consulter");
		button_5.setBounds(10, 350, 89, 23);
		this.add(button_5);
		
		JButton button_6 = new JButton("Ajouter");
		button_6.setBounds(10, 375, 89, 23);
		this.add(button_6);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(10, 70, 94, 20);
		this.add(textField_9);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.setBounds(110, 69, 74, 21);
		this.add(btnSearch);
	}


	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	public JTextField getNomTextField() {
		return nomTextField;
	}

	public void setNomTextField(JTextField nomTextField) {
		this.nomTextField = nomTextField;
	}

	public JTextField getPrenomTextField() {
		return prenomTextField;
	}

	public void setPrenomTextField(JTextField prenomTextField) {
		this.prenomTextField = prenomTextField;
	}

	public JTextField getEmailTextField() {
		return emailTextField;
	}

	public void setEmailTextField(JTextField emailTextField) {
		this.emailTextField = emailTextField;
	}

	public JTextField getTelTextField() {
		return telTextField;
	}

	public void setTelTextField(JTextField telTextField) {
		this.telTextField = telTextField;
	}

	public JTextField getAddresseTextField() {
		return addresseTextField;
	}

	public void setAddresseTextField(JTextField addresseTextField) {
		this.addresseTextField = addresseTextField;
	}

	public JTextField getTextField_5() {
		return textField_5;
	}

	public void setTextField_5(JTextField textField_5) {
		this.textField_5 = textField_5;
	}

	public JTextField getTextField_6() {
		return textField_6;
	}

	public void setTextField_6(JTextField textField_6) {
		this.textField_6 = textField_6;
	}

	public JTextField getTextField_7() {
		return textField_7;
	}

	public void setTextField_7(JTextField textField_7) {
		this.textField_7 = textField_7;
	}

	public JTextField getDateSouscriptionTextField() {
		return dateSouscriptionTextField;
	}

	public void setDateSouscriptionTextField(JTextField dateSouscriptionTextField) {
		this.dateSouscriptionTextField = dateSouscriptionTextField;
	}

	public JTextField getTextField_9() {
		return textField_9;
	}

	public void setTextField_9(JTextField textField_9) {
		this.textField_9 = textField_9;
	}

	public JButton getPreviousButton() {
		return previousButton;
	}

	public void setPreviousButton(JButton previousButton) {
		this.previousButton = previousButton;
	}

	public JButton getHomeButton() {
		return homeButton;
	}

	public void setHomeButton(JButton homeButton) {
		this.homeButton = homeButton;
	}

	public Window getW() {
		return w;
	}

	public void setW(Window w) {
		this.w = w;
	}
}
