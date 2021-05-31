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

public class CreerDevis extends JPanel{

	private JFrame frame;
	private JTextField textSearch;
	private JTextField textNom;
	private JTextField textPrenom;
	private JTextField textEmail;
	private JTextField textImmat;
	private JTextField textAssu;
	private JTextField dateDeb;
	private JTextField dateFin;
	
	private JButton homeButton;
	private JButton previousButton;
	private JButton searchButton;
	private JButton addButton;
	private JButton cloturerButton;
	private JButton genererButton;
	
	private Window window;

	/**
	 * Create the application.
	 */
	public CreerDevis(Window window) {
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
		
		JButton previousButton = new JButton("<--");
		previousButton.setBounds(0, 21, 49, 23);
		this.add(previousButton);
		
		JButton homeButton = new JButton("\u2302");
		homeButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		homeButton.setBounds(110, 21, 49, 23);
		this.add(homeButton);
		
		JList list = new JList();
		list.setVisibleRowCount(10);
		list.setBounds(10, 93, 196, 208);
		this.add(list);
		
		JLabel label_1 = new JLabel("Devis & Locations");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setForeground(Color.BLUE);
		label_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_1.setBounds(169, 21, 186, 19);
		this.add(label_1);
		
		JButton addButton = new JButton("Ajouter");
		addButton.setBounds(11, 325, 89, 23);
		this.add(addButton);
		
		JButton cloturerButton = new JButton("Cl\u00F4turer");
		cloturerButton.setBounds(10, 350, 89, 23);
		this.add(cloturerButton);
		
		textSearch = new JTextField();
		textSearch.setColumns(10);
		textSearch.setBounds(10, 70, 94, 20);
		this.add(textSearch);
		
		JButton searchButton = new JButton("Search");
		searchButton.setBounds(110, 69, 83, 21);
		this.add(searchButton);
		
		JPanel this_1 = new JPanel();
		this_1.setLayout(null);
		this_1.setBackground(SystemColor.controlHighlight);
		this_1.setBounds(220, 70, 269, 311);
		this.add(this_1);
		
		JLabel label_2 = new JLabel("Nouveau devis");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setForeground(Color.RED);
		label_2.setBounds(75, 0, 131, 14);
		this_1.add(label_2);
		
		JLabel label_3 = new JLabel("Nom");
		label_3.setHorizontalAlignment(SwingConstants.RIGHT);
		label_3.setBounds(44, 28, 46, 14);
		this_1.add(label_3);
		
		textNom = new JTextField();
		textNom.setColumns(10);
		textNom.setBounds(100, 25, 156, 20);
		this_1.add(textNom);
		
		
		JLabel label_4 = new JLabel("Prenom");
		label_4.setHorizontalAlignment(SwingConstants.RIGHT);
		label_4.setBounds(44, 53, 46, 14);
		this_1.add(label_4);
		
		textPrenom = new JTextField();
		textPrenom.setColumns(10);
		textPrenom.setBounds(100, 50, 156, 20);
		this_1.add(textPrenom);
		
		
		JLabel label_5 = new JLabel("Email");
		label_5.setHorizontalAlignment(SwingConstants.RIGHT);
		label_5.setBounds(44, 78, 46, 14);
		this_1.add(label_5);
		
		textEmail = new JTextField();
		textEmail.setColumns(10);
		textEmail.setBounds(100, 75, 156, 20);
		this_1.add(textEmail);
		
		
		JLabel label_6 = new JLabel("Immatriculation");
		label_6.setHorizontalAlignment(SwingConstants.RIGHT);
		label_6.setBounds(0, 128, 90, 14);
		this_1.add(label_6);
		
		textImmat = new JTextField();
		textImmat.setToolTipText("");
		textImmat.setColumns(10);
		textImmat.setBounds(100, 125, 156, 20);
		this_1.add(textImmat);
		
		
		JLabel label_7 = new JLabel("Assurance");
		label_7.setHorizontalAlignment(SwingConstants.RIGHT);
		label_7.setBounds(0, 153, 90, 14);
		this_1.add(label_7);
		
		textAssu = new JTextField();
		textAssu.setColumns(10);
		textAssu.setBounds(100, 150, 156, 20);
		this_1.add(textAssu);
		

		JLabel label_8 = new JLabel("Date d\u00E9but");
		label_8.setHorizontalAlignment(SwingConstants.RIGHT);
		label_8.setBounds(0, 203, 90, 14);
		this_1.add(label_8);
		
		dateDeb = new JTextField();
		dateDeb.setColumns(10);
		dateDeb.setBounds(100, 200, 156, 20);
		this_1.add(dateDeb);
		
		
		JLabel label_9 = new JLabel("Date fin");
		label_9.setHorizontalAlignment(SwingConstants.RIGHT);
		label_9.setBounds(0, 228, 90, 14);
		this_1.add(label_9);
		
		dateFin = new JTextField();
		dateFin.setColumns(10);
		dateFin.setBounds(100, 225, 156, 20);
		this_1.add(dateFin);
		
		
		JButton genererButton = new JButton("G\u00E9n\u00E9rer devis");
		genererButton.setBounds(44, 277, 180, 23);
		this_1.add(genererButton);
	}

	
	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	public JTextField getTextSearch() {
		return textSearch;
	}

	public void setTextSearch(JTextField textSearch) {
		this.textSearch = textSearch;
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

	public JTextField getTextImmat() {
		return textImmat;
	}

	public void setTextImmat(JTextField textImmat) {
		this.textImmat = textImmat;
	}

	public JTextField getTextAssu() {
		return textAssu;
	}

	public void setTextAssu(JTextField textAssu) {
		this.textAssu = textAssu;
	}

	public JTextField getDateDeb() {
		return dateDeb;
	}

	public void setDateDeb(JTextField dateDeb) {
		this.dateDeb = dateDeb;
	}

	public JTextField getDateFin() {
		return dateFin;
	}

	public void setDateFin(JTextField dateFin) {
		this.dateFin = dateFin;
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

	public JButton getSearchButton() {
		return searchButton;
	}

	public void setSearchButton(JButton searchButton) {
		this.searchButton = searchButton;
	}

	public JButton getAddButton() {
		return addButton;
	}

	public void setAddButton(JButton addButton) {
		this.addButton = addButton;
	}

	public JButton getCloturerButton() {
		return cloturerButton;
	}

	public void setCloturerButton(JButton cloturerButton) {
		this.cloturerButton = cloturerButton;
	}

	public JButton getGenererButton() {
		return genererButton;
	}

	public void setGenererButton(JButton genererButton) {
		this.genererButton = genererButton;
	}

	public Window getWindow() {
		return window;
	}

	public void setWindow(Window window) {
		this.window = window;
	}

}
