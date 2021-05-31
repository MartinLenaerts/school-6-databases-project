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

import Controller.ConsultClientController;
import Model.Client;

import javax.swing.*;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;

public class ConsultClient extends JPanel {

    private JFrame frame;
    private JTextField nomTextField;
    private JTextField prenomTextField;
    private JTextField emailTextField;
    private JTextField telTextField;
    private JTextField textRue;
    private JTextField textVille;
    private JTextField codePostal;
    private JTextField fidelite;
    private JTextField dateSouscriptionTextField;
    private JTextField textSearch;
    private JButton previousButton;
    private JButton homeButton;
    private JButton btnSearch;


    private JButton modifButton;
    private JButton consultButton;
    private JButton addButton;


    private Client client;
    private Window window;

    /**
     * Create the application.
     */
    public ConsultClient(Client client, Window window) {
        this.setLayout(null);
        this.client = client;
        initialize();
        this.window = window;
        this.window.getContentPane().removeAll();
        this.window.getContentPane().add(this);
        this.window.revalidate();
        new ConsultClientController(this);
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

        nomTextField = new JTextField(client.getNom());
        nomTextField.setColumns(10);
        nomTextField.setBounds(60, 25, 156, 20);
        this_1.add(nomTextField);


        JLabel label_3 = new JLabel("Prenom");
        label_3.setBounds(10, 53, 46, 14);
        this_1.add(label_3);

        prenomTextField = new JTextField(client.getPrenom());
        prenomTextField.setColumns(10);
        prenomTextField.setBounds(60, 50, 156, 20);
        this_1.add(prenomTextField);


        JLabel label_4 = new JLabel("Email");
        label_4.setBounds(10, 78, 46, 14);
        this_1.add(label_4);
        emailTextField = new JTextField(client.getEmail());
        emailTextField.setColumns(10);
        emailTextField.setBounds(60, 75, 156, 20);
        this_1.add(emailTextField);


        JLabel label_5 = new JLabel("N\u00B0 Tel");
        label_5.setBounds(10, 103, 46, 14);
        this_1.add(label_5);
        telTextField = new JTextField(client.getTelephone());
        telTextField.setColumns(10);
        telTextField.setBounds(60, 100, 156, 20);
        this_1.add(telTextField);


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

        codePostal = new JTextField(client.getAdresse().getCode_postal());
        codePostal.setColumns(10);
        codePostal.setBounds(60, 175, 156, 20);
        this_1.add(codePostal);


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

        fidelite = new JTextField();
        fidelite.setColumns(10);
        fidelite.setBounds(60, 225, 156, 20);
        this_1.add(fidelite);


        JLabel label_8 = new JLabel("Date souscription");
        label_8.setBounds(10, 253, 103, 14);
        this_1.add(label_8);

        dateSouscriptionTextField = new JTextField();
        dateSouscriptionTextField.setColumns(10);
        dateSouscriptionTextField.setBounds(122, 250, 94, 20);
        this_1.add(dateSouscriptionTextField);

/*
        JList list = new JList();
        list.setVisibleRowCount(10);
        list.setBounds(10, 93, 196, 208);
        this.add(list);


        modifButton = new JButton("Modifier");
        modifButton.setBounds(11, 325, 89, 23);
        this.add(modifButton);

        consultButton = new JButton("Consulter");
        consultButton.setBounds(10, 350, 89, 23);
        this.add(consultButton);

        addButton = new JButton("Ajouter");
        addButton.setBounds(10, 375, 89, 23);
        this.add(addButton);

        textSearch = new JTextField();
        textSearch.setColumns(10);
        textSearch.setBounds(10, 70, 94, 20);
        this.add(textSearch);

        JButton btnSearch = new JButton("Search");
        btnSearch.setBounds(110, 69, 74, 21);
        this.add(btnSearch);*/
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

    public JTextField getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(JTextField codePostal) {
        this.codePostal = codePostal;
    }

    public JTextField getFidelite() {
        return fidelite;
    }

    public void setFidelite(JTextField fidelite) {
        this.fidelite = fidelite;
    }

    public JTextField getDateSouscriptionTextField() {
        return dateSouscriptionTextField;
    }

    public void setDateSouscriptionTextField(JTextField dateSouscriptionTextField) {
        this.dateSouscriptionTextField = dateSouscriptionTextField;
    }

    public JTextField getTextSearch() {
        return textSearch;
    }

    public void setTextSearch(JTextField textSearch) {
        this.textSearch = textSearch;
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

    public Window getWindow() {
        return window;
    }

    public void setWindow(Window window) {
        this.window = window;
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
}
