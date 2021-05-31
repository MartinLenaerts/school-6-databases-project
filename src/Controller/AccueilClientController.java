package Controller;

import Model.Client;
import View.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AccueilClientController implements ActionListener {

    private AccueilClient accueilClientView;


    public AccueilClientController(AccueilClient c) {
        this.accueilClientView = c;

        this.accueilClientView.getHomeButton().addActionListener(this);
        this.accueilClientView.getAddButton().addActionListener(this);
        this.accueilClientView.getModifButton().addActionListener(this);
        this.accueilClientView.getConsultButton().addActionListener(this);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.accueilClientView.getHomeButton()) {
            new Home((Window) this.accueilClientView.getWindow());
        } else if (e.getSource() == this.accueilClientView.getConsultButton()) {
            new ConsultClient((Client) this.accueilClientView.getListCLient().getSelectedValue(), (Window) this.accueilClientView.getWindow());
        } else if (e.getSource() == this.accueilClientView.getAddButton()) {
            // new AjoutClient((Window) this.accueilClientView.getWindow());
        }
    }
}
