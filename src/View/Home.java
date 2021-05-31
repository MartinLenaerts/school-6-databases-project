package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;

public class Home extends JPanel {
    private JButton devisLocationButton;
    private JButton ressourcesButton;
    private JButton clientButton;
    private JButton nextButton;
    private JButton homeButton;
    private JButton previousButton;
    private JFrame window;
    /**
     * Create the application.
     */
    public Home(JFrame window) {
        this.window = window;
        initialize();
        window.getContentPane().removeAll();
        window.getContentPane().add(this);
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        this.setLayout(null);
        devisLocationButton = new JButton("Devis & Locations");
        devisLocationButton.setBounds(22, 183, 138, 32);
        this.add(devisLocationButton);

        JLabel lblNewLabel = new JLabel("RentCar");
        lblNewLabel.setForeground(Color.BLUE);
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblNewLabel.setBounds(220, 0, 100, 19);
        this.add(lblNewLabel);

        ressourcesButton = new JButton("Ressources");
        ressourcesButton.setBounds(180, 183, 138, 32);
        this.add(ressourcesButton);

        clientButton = new JButton("Client");
        clientButton.setBounds(337, 183, 138, 32);
        this.add(clientButton);

        JSeparator separator = new JSeparator();
        separator.setBounds(0, 21, 497, 2);
        this.add(separator);

        nextButton = new JButton("-->");
        nextButton.setBounds(51, 21, 49, 23);
        this.add(nextButton);

        homeButton = new JButton("\u2302");
        homeButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
        homeButton.setBounds(110, 21, 49, 23);
        this.add(homeButton);

        previousButton = new JButton("<--");
        previousButton.setBounds(0, 21, 49, 23);
        this.add(previousButton);
    }


    public JButton getDevisLocationButton() {
        return devisLocationButton;
    }

    public void setDevisLocationButton(JButton devisLocationButton) {
        this.devisLocationButton = devisLocationButton;
    }

    public JButton getRessourcesButton() {
        return ressourcesButton;
    }

    public void setRessourcesButton(JButton ressourcesButton) {
        this.ressourcesButton = ressourcesButton;
    }

    public JButton getClientButton() {
        return clientButton;
    }

    public void setClientButton(JButton clientButton) {
        this.clientButton = clientButton;
    }

    public JButton getNextButton() {
        return nextButton;
    }

    public void setNextButton(JButton nextButton) {
        this.nextButton = nextButton;
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

    public JFrame getWindow() {
        return window;
    }

    public void setWindow(JFrame window) {
        this.window = window;
    }
}
