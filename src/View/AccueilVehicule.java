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

public class AccueilVehicule extends JPanel{

	private JFrame frame;
	private JTextField textSearch;
	private JButton searchButton;
	private JButton previousButton;
	private JButton homeButton;
	private JButton modifButton;
	private JButton consultButton;
	private JButton addButton;
	private JButton suppButton;
	
	private Window window;

	/**
	 * Create the application.
	 */
	public AccueilVehicule(Window window) {
			this.setLayout(null);
			initialize();
			this.window = window;
			window.getContentPane().removeAll();
			window.getContentPane().add(this);
			window.revalidate();
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
		
		JLabel label_10 = new JLabel("Ressources");
		label_10.setHorizontalAlignment(SwingConstants.CENTER);
		label_10.setForeground(Color.BLUE);
		label_10.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_10.setBounds(152, 21, 186, 19);
		this.add(label_10);
		
		JButton modifButton = new JButton("Modifier");
		modifButton.setBounds(11, 325, 89, 23);
		this.add(modifButton);
		
		JButton consultButton = new JButton("Consulter");
		consultButton.setBounds(10, 350, 89, 23);
		this.add(consultButton);
		
		JButton addButton = new JButton("Ajouter");
		addButton.setBounds(10, 375, 89, 23);
		this.add(addButton);
		
		JButton suppButton = new JButton("Supprimer");
		suppButton.setBounds(10, 402, 89, 23);
		this.add(suppButton);
		
		textSearch = new JTextField();
		textSearch.setColumns(10);
		textSearch.setBounds(10, 62, 94, 20);
		this.add(textSearch);
		
		JButton searchButton = new JButton("Search");
		searchButton.setBounds(110, 61, 83, 21);
		this.add(searchButton);
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

	public JButton getSearchButton() {
		return searchButton;
	}

	public void setSearchButton(JButton searchButton) {
		this.searchButton = searchButton;
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

	public JButton getSuppButton() {
		return suppButton;
	}

	public void setSuppButton(JButton suppButton) {
		this.suppButton = suppButton;
	}

	public Window getWindow() {
		return window;
	}

	public void setWindow(Window window) {
		this.window = window;
	}


}
