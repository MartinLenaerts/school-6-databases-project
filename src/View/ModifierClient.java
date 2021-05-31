/**************************************************
 * 			Projet Database : RentCar
 * 
 * FADILI Farès
 * LENAERTS Martin
 * TRAN Tiffany
 * 
 * L3New - Grp I
 *************************************************/

package View;

import Model.Client;

import javax.swing.*;
import java.awt.EventQueue;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;

public class ModifierClient extends JPanel{

	private JFrame frame;
	private JTextField textNom;
	private JTextField textPrenom;
	private JTextField textEmail;
	private JTextField textTel;
	private JTextField textRue;
	private JTextField textVille;
	private JTextField textCodePostal;
	private JTextField textFidelite;
	private JTextField textDate;
	
	private JButton homeButton;
	private JButton previousButton;
	private JButton btnValider;
	private JRadioButton yesButton;
	private JRadioButton noButton;
	private JButton btnRenouveler;
	private JButton modifButton;
	private JButton consultButton;
	private JButton addButton;

	private Client client;
	private Window window;
	

	/**
	 * Create the application.
	 */
	public ModifierClient(Window window) {
		this.setLayout(null);
		this.client = client;
		initialize();
		this.window = window;
		this.window.getContentPane().removeAll();
		this.window.getContentPane().add(this);
		this.window.revalidate();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		JLabel label = new JLabel("RentCar");
		label.setForeground(Color.BLUE);
		label.setFont(new Font("Tahoma", Font.BOLD, 15));
		label.setBounds(220, 0, 61, 19);
		this.add(label);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 21, 499, 2);
		this.add(separator);
		
		JLabel label_9 = new JLabel("Client");
		label_9.setHorizontalAlignment(SwingConstants.CENTER);
		label_9.setForeground(Color.BLUE);
		label_9.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_9.setBounds(220, 21, 61, 19);
		this.add(label_9);
		
		previousButton = new JButton("<--");
		previousButton.setBounds(0, 21, 49, 23);
		this.add(previousButton);
		
		homeButton = new JButton("\u2302");
		homeButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		homeButton.setBounds(110, 21, 49, 23);
		this.add(homeButton);
		
		
		JPanel this_1 = new JPanel();
		this_1.setLayout(null);
		this_1.setBackground(SystemColor.controlHighlight);
		this_1.setBounds(235, 55, 254, 357);
		this.add(this_1);
		
		JLabel lblModifierInfoClient = new JLabel("Modifier info client");
		lblModifierInfoClient.setHorizontalAlignment(SwingConstants.CENTER);
		lblModifierInfoClient.setForeground(Color.RED);
		lblModifierInfoClient.setBounds(75, 0, 131, 14);
		this_1.add(lblModifierInfoClient);
		
		JLabel label_2 = new JLabel("Nom");
		label_2.setBounds(10, 28, 46, 14);
		this_1.add(label_2);
		
		textNom = new JTextField(client.getNom());
		textNom.setColumns(10);
		textNom.setBounds(60, 25, 156, 20);
		this_1.add(textNom);
		
		
		JLabel label_3 = new JLabel("Prenom");
		label_3.setBounds(10, 53, 46, 14);
		this_1.add(label_3);
		
		textPrenom = new JTextField(client.getPrenom());
		textPrenom.setColumns(10);
		textPrenom.setBounds(60, 50, 156, 20);
		this_1.add(textPrenom);
		
		
		JLabel label_4 = new JLabel("Email");
		label_4.setBounds(10, 78, 46, 14);
		this_1.add(label_4);
		
		textEmail = new JTextField(client.getEmail());
		textEmail.setColumns(10);
		textEmail.setBounds(60, 75, 156, 20);
		this_1.add(textEmail);
		
		
		JLabel label_5 = new JLabel("N\u00B0 Tel");
		label_5.setBounds(10, 103, 46, 14);
		this_1.add(label_5);
		
		textTel = new JTextField(client.getTelephone());
		textTel.setColumns(10);
		textTel.setBounds(60, 100, 156, 20);
		this_1.add(textTel);
		
		
		JLabel label_6 = new JLabel("Adresse");
		label_6.setBounds(10, 128, 46, 14);
		this_1.add(label_6);
		
		textRue = new JTextField(client.getAdresse().getRue());
		textRue.setColumns(10);
		textRue.setBounds(60, 125, 156, 20);
		this_1.add(textRue);
		
		textVille = new JTextField(client.getAdresse().getVille());
		textVille.setColumns(10);
		textVille.setBounds(60, 150, 156, 20);
		this_1.add(textVille);
		
		textCodePostal = new JTextField(client.getAdresse().getCode_postal());
		textCodePostal.setColumns(10);
		textCodePostal.setBounds(60, 175, 156, 20);
		this_1.add(textCodePostal);
		
		
		JLabel label_7 = new JLabel("Fid\u00E9lit\u00E9");
		label_7.setBounds(10, 204, 46, 14);
		this_1.add(label_7);
		
		JRadioButton yesButton = new JRadioButton("Oui");
		yesButton.setBounds(60, 200, 53, 23);
		this_1.add(yesButton);
		
		JRadioButton noButton = new JRadioButton("Non");
		noButton.setBounds(128, 200, 53, 23);
		this_1.add(noButton);
		
		ButtonGroup group = new ButtonGroup();
		group.add(yesButton);
		group.add(noButton);
		
		textFidelite = new JTextField();
		textFidelite.setColumns(10);
		textFidelite.setBounds(60, 225, 156, 20);
		this_1.add(textFidelite);
		
		
		JLabel label_8 = new JLabel("Date souscription");
		label_8.setBounds(10, 253, 103, 14);
		this_1.add(label_8);
		
		textDate = new JTextField();
		textDate.setColumns(10);
		textDate.setBounds(122, 250, 94, 20);
		this_1.add(textDate);
		
		
		btnValider = new JButton("Valider");
		btnValider.setBounds(155, 323, 89, 23);
		this_1.add(btnValider);
		
		JButton btnRenouveler = new JButton("Renouveler fid\u00E9lit\u00E9");
		btnRenouveler.setBounds(31, 275, 180, 23);
		this_1.add(btnRenouveler);


		/*
		JList list = new JList();
		list.setVisibleRowCount(10);
		list.setBounds(10, 93, 196, 208);
		this.add(list);
		
		
		JButton modifButton = new JButton("Modifier");
		modifButton.setBounds(11, 325, 89, 23);
		this.add(modifButton);
		
		JButton consultButton = new JButton("Consulter");
		consultButton.setBounds(10, 350, 89, 23);
		this.add(consultButton);
		
		JButton addButton = new JButton("Ajouter");
		addButton.setBounds(10, 375, 89, 23);
		this.add(addButton);*/
	}

	
	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	public JTextField getTextNom() {
		return textNom;
	}

	public void setTextNom(JTextField textNom) {
		this.textNom = textNom;
	}

	public JTextField getTextPrenom() {
		return textPrenom;
	}

	public void setTextPrenom(JTextField textPrenom) {
		this.textPrenom = textPrenom;
	}

	public JTextField getTextEmail() {
		return textEmail;
	}

	public void setTextEmail(JTextField textEmail) {
		this.textEmail = textEmail;
	}

	public JTextField getTextTel() {
		return textTel;
	}

	public void setTextTel(JTextField textTel) {
		this.textTel = textTel;
	}

	public JTextField getTextRue() {
		return textRue;
	}

	public void setTextRue(JTextField textRue) {
		this.textRue = textRue;
	}

	public JTextField getTextVille() {
		return textVille;
	}

	public void setTextVille(JTextField textVille) {
		this.textVille = textVille;
	}

	public JTextField getTextCodePostal() {
		return textCodePostal;
	}

	public void setTextCodePostal(JTextField textCodePostal) {
		this.textCodePostal = textCodePostal;
	}

	public JTextField getTextFidelite() {
		return textFidelite;
	}

	public void setTextFidelite(JTextField textFidelite) {
		this.textFidelite = textFidelite;
	}

	public JTextField getTextDate() {
		return textDate;
	}

	public void setTextDate(JTextField textDate) {
		this.textDate = textDate;
	}

	public JButton getHomeButton() {
		return homeButton;
	}

	public void setHomeButton(JButton homeButton) {
		this.homeButton = homeButton;
	}

	public JButton getPreviousButton() {
		return previousButton;
	}

	public void setPreviousButton(JButton previousButton) {
		this.previousButton = previousButton;
	}

	public JButton getBtnValider() {
		return btnValider;
	}

	public void setBtnValider(JButton btnValider) {
		this.btnValider = btnValider;
	}

	public JRadioButton getYesButton() {
		return yesButton;
	}

	public void setYesButton(JRadioButton yesButton) {
		this.yesButton = yesButton;
	}

	public JRadioButton getNoButton() {
		return noButton;
	}

	public void setNoButton(JRadioButton noButton) {
		this.noButton = noButton;
	}

	public JButton getBtnRenouveler() {
		return btnRenouveler;
	}

	public void setBtnRenouveler(JButton btnRenouveler) {
		this.btnRenouveler = btnRenouveler;
	}

	public JButton getModifButton() {
		return modifButton;
	}

	public void setModifButton(JButton modifButton) {
		this.modifButton = modifButton;
	}

	public JButton getConsultButton() {
		return consultButton;
	}

	public void setConsultButton(JButton consultButton) {
		this.consultButton = consultButton;
	}

	public JButton getAddButton() {
		return addButton;
	}

	public void setAddButton(JButton addButton) {
		this.addButton = addButton;
	}

	public Window getWindow() {
		return window;
	}

	public void setWindow(Window window) {
		this.window = window;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
}
