package Controller;

import View.AccueilClient;
import View.Home;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AccueilClientController implements ActionListener {

    private AccueilClient accueilClientView;


    public AccueilClientController(AccueilClient c) {
        this.accueilClientView = c;

        this.accueilClientView.getHomeButton().addActionListener(this);
        this.accueilClientView.getAddButton().addActionListener(this);
        this.accueilClientView.getModifButton().addActionListener(this);
        this.accueilClientView.getHomeButton().addActionListener(this);
        this.accueilClientView.getHomeButton().addActionListener(this);
        this.accueilClientView.getHomeButton().addActionListener(this);


    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
