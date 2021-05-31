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

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import java.awt.BorderLayout;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.SystemColor;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JList;
import javax.swing.JScrollBar;

public class AjoutClient extends JPanel{

	private JFrame frame;
	private JTextField Nom;
	private JTextField Prenom;
	private JTextField Email;
	private JTextField NumeroTel;
	private JTextField Rue;
	private JTextField Ville;
	private JTextField CodePostal;
	private JTextField ProgrammeFidelite;
	private JTextField DateSouscription;
	
	private JButton previousButton;
	private JButton homeButton;
	private JButton validerButton;
	private JButton btnModifier;
	private JButton btnConsulter;
	private JButton btnAjouter;

	private Window window;
	
	/**
	 * Create the application.
	 */
	public AjoutClient(Window window) {
		this.setLayout(null);
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
		
		JLabel lblClient = new JLabel("Client");
		lblClient.setHorizontalAlignment(SwingConstants.CENTER);
		lblClient.setForeground(Color.BLUE);
		lblClient.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblClient.setBounds(220, 21, 61, 19);
		this.add(lblClient);
		
		previousButton = new JButton("<--");
		previousButton.setBounds(0, 21, 49, 23);
		this.add(previousButton);
		
		homeButton = new JButton("\u2302");
		homeButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		homeButton.setBounds(110, 21, 49, 23);
		this.add(homeButton);
		
		
		JPanel this_1 = new JPanel();
		this_1.setBackground(SystemColor.controlHighlight);
		this_1.setBounds(235, 55, 254, 327);
		this.add(this_1);
		this_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ajouter un client");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(75, 0, 131, 14);
		this_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nom");
		lblNewLabel_1.setBounds(10, 28, 46, 14);
		this_1.add(lblNewLabel_1);
		
		Nom = new JTextField();
		Nom.setBounds(60, 25, 156, 20);
		this_1.add(Nom);
		Nom.setColumns(10);
		
		
		JLabel lblPrenom = new JLabel("Prenom");
		lblPrenom.setBounds(10, 53, 46, 14);
		this_1.add(lblPrenom);
		
		Prenom = new JTextField();
		Prenom.setColumns(10);
		Prenom.setBounds(60, 50, 156, 20);
		this_1.add(Prenom);
		
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(10, 78, 46, 14);
		this_1.add(lblEmail);
		
		Email = new JTextField();
		Email.setColumns(10);
		Email.setBounds(60, 75, 156, 20);
		this_1.add(Email);
		
		
		JLabel lblNTel = new JLabel("N\u00B0 Tel");
		lblNTel.setBounds(10, 103, 46, 14);
		this_1.add(lblNTel);
		
		NumeroTel = new JTextField();
		NumeroTel.setColumns(10);
		NumeroTel.setBounds(60, 100, 156, 20);
		this_1.add(NumeroTel);
		
		
		JLabel lblAdresse = new JLabel("Adresse");
		lblAdresse.setBounds(10, 128, 46, 14);
		this_1.add(lblAdresse);
		
		Rue = new JTextField();
		Rue.setText("Rue");
		Rue.setToolTipText("");
		Rue.setColumns(10);
		Rue.setBounds(60, 125, 156, 20);
		this_1.add(Rue);
		
		Ville = new JTextField();
		Ville.setText("Ville");
		Ville.setColumns(10);
		Ville.setBounds(60, 150, 156, 20);
		this_1.add(Ville);
		
		CodePostal = new JTextField();
		CodePostal.setText("Code postal");
		CodePostal.setColumns(10);
		CodePostal.setBounds(60, 175, 156, 20);
		this_1.add(CodePostal);
		
		
		JLabel lblFidlit = new JLabel("Fid\u00E9lit\u00E9");
		lblFidlit.setBounds(10, 204, 46, 14);
		this_1.add(lblFidlit);
		
		JRadioButton yesButton = new JRadioButton("Oui");
		yesButton.setBounds(60, 200, 53, 23);
		this_1.add(yesButton);
		
		JRadioButton noButton = new JRadioButton("Non");
		noButton.setBounds(128, 200, 53, 23);
		this_1.add(noButton);
		
		ButtonGroup group = new ButtonGroup();
		group.add(yesButton);
		group.add(noButton);
		
		ProgrammeFidelite = new JTextField();
		ProgrammeFidelite.setText("Nom programme fid\u00E9lit\u00E9");
		ProgrammeFidelite.setColumns(10);
		ProgrammeFidelite.setBounds(60, 225, 156, 20);
		this_1.add(ProgrammeFidelite);
		
		
		JLabel lblDate = new JLabel("Date souscription");
		lblDate.setBounds(10, 253, 103, 14);
		this_1.add(lblDate);
		
		DateSouscription = new JTextField();
		DateSouscription.setText("JJ/MM/AAAA");
		DateSouscription.setColumns(10);
		DateSouscription.setBounds(122, 250, 94, 20);
		this_1.add(DateSouscription);

		validerButton = new JButton("Valider");
		validerButton.setBounds(155, 293, 89, 23);
		this_1.add(validerButton);


		/*JList list = new JList();
		list.setVisibleRowCount(10);
		list.setBounds(10, 93, 196, 208);
		panel.add(list);
		

		
		btnModifier = new JButton("Modifier");
		btnModifier.setBounds(11, 325, 89, 23);
		panel.add(btnModifier);
		
		btnConsulter = new JButton("Consulter");
		btnConsulter.setBounds(10, 350, 89, 23);
		panel.add(btnConsulter);
		
		btnAjouter = new JButton("Ajouter");
		btnAjouter.setBounds(10, 375, 89, 23);
		panel.add(btnAjouter);*/
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	public JTextField getNom() {
		return Nom;
	}

	public void setNom(JTextField nom) {
		Nom = nom;
	}

	public JTextField getPrenom() {
		return Prenom;
	}

	public void setPrenom(JTextField prenom) {
		Prenom = prenom;
	}

	public JTextField getEmail() {
		return Email;
	}

	public void setEmail(JTextField email) {
		Email = email;
	}

	public JTextField getNumeroTel() {
		return NumeroTel;
	}

	public void setNumeroTel(JTextField numeroTel) {
		NumeroTel = numeroTel;
	}

	public JTextField getRue() {
		return Rue;
	}

	public void setRue(JTextField rue) {
		Rue = rue;
	}

	public JTextField getVille() {
		return Ville;
	}

	public void setVille(JTextField ville) {
		Ville = ville;
	}

	public JTextField getCodePostal() {
		return CodePostal;
	}

	public void setCodePostal(JTextField codePostal) {
		CodePostal = codePostal;
	}

	public JTextField getProgrammeFidelite() {
		return ProgrammeFidelite;
	}

	public void setProgrammeFidelite(JTextField programmeFidelite) {
		ProgrammeFidelite = programmeFidelite;
	}

	public JTextField getDateSouscription() {
		return DateSouscription;
	}

	public void setDateSouscription(JTextField dateSouscription) {
		DateSouscription = dateSouscription;
	}
}
