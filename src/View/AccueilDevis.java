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

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class AccueilDevis extends JPanel {

	private JFrame frame;
	
	private JButton homeButton;
	private JButton previousButton;
	private JTextField textSearch;
	private JButton searchButton;
	private JButton addButton;
	private JButton cloturerButton;
	
	private Window window;
	
	/**
	 * Create the application.
	 */
	public AccueilDevis(Window window) {
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
	}

	
	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
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

	public Window getWindow() {
		return window;
	}

	public void setWindow(Window window) {
		this.window = window;
	}

}
