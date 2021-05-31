package Controller;

import View.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomeController implements ActionListener {
    private Home homeView;

    public HomeController(Home homeView) {
        this.homeView = homeView;

        this.homeView.getDevisLocationButton().addActionListener(this);
        this.homeView.getClientButton().addActionListener(this);
        this.homeView.getRessourcesButton().addActionListener(this);


        this.homeView.getNextButton().addActionListener(this);
        this.homeView.getPreviousButton().addActionListener(this);
        this.homeView.getHomeButton().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.homeView.getClientButton()) {
            new AccueilClient((Window) this.homeView.getWindow());
        }
    }
}
