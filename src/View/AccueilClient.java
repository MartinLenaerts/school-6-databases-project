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

import Controller.AccueilClientController;
import Model.Client;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JSeparator;
import java.awt.SystemColor;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JList;

public class AccueilClient extends JPanel {

    private Object[] clients;
    private JButton homeButton;
    private JButton previousButton;
    private JButton modifButton;
    private JButton consultButton;
    private JButton addButton;
    private JList<Object> listCLient;
    private Window window;

    /**
     * Create the application.
     */
    public AccueilClient(Window window) {
        this.setLayout(null);
        initialize();
        this.window = window;
        this.window.getContentPane().removeAll();
        this.window.getContentPane().add(this);
        this.window.revalidate();
        new AccueilClientController(this);
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

        previousButton = new JButton("<--");
        previousButton.setBounds(0, 21, 49, 23);
        this.add(previousButton);

        homeButton = new JButton("\u2302");
        homeButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
        homeButton.setBounds(110, 21, 49, 23);
        this.add(homeButton);



        clients = Client.getAll().toArray();
        listCLient = new JList<Object>(clients);
        listCLient.setVisibleRowCount(10);
        listCLient.setBounds(10, 93, 196, 208);
        this.add(listCLient);

        JLabel label_9 = new JLabel("Client");
        label_9.setHorizontalAlignment(SwingConstants.CENTER);
        label_9.setForeground(Color.BLUE);
        label_9.setFont(new Font("Tahoma", Font.BOLD, 15));
        label_9.setBounds(220, 21, 61, 19);
        this.add(label_9);

        modifButton = new JButton("Modifier");
        modifButton.setBounds(11, 325, 89, 23);
        this.add(modifButton);

        consultButton = new JButton("Consulter");
        consultButton.setBounds(10, 350, 89, 23);
        this.add(consultButton);

        addButton = new JButton("Ajouter");
        addButton.setBounds(10, 375, 89, 23);
        this.add(addButton);
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


    public Object[] getClients() {
        return clients;
    }

    public void setClients(Object[] clients) {
        this.clients = clients;
    }

    public JList<Object> getListCLient() {
        return listCLient;
    }

    public void setListCLient(JList<Object> listCLient) {
        this.listCLient = listCLient;
    }
}
