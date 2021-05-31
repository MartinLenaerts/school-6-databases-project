package Controller;

import View.ConsultClient;
import View.Home;
import View.Window;

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
        System.out.println(e.getSource().toString());
        if (e.getSource() == this.homeView.getClientButton()) {
           new ConsultClient((Window) this.homeView.getWindow(),false);
        }
    }
}
