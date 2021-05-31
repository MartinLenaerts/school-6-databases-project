package Controller;

import View.ConsultClient;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConsultClientController implements ActionListener {

    private ConsultClient consultClientView;

    public ConsultClientController(ConsultClient consultClientView) {
        this.consultClientView = consultClientView;

        this.consultClientView.getNomTextField().addActionListener(this);
        this.consultClientView.getPrenomTextField().addActionListener(this);
        this.consultClientView.getEmailTextField().addActionListener(this);
        this.consultClientView.getTelTextField().addActionListener(this);
        this.consultClientView.getDateSouscriptionTextField().addActionListener(this);
        this.consultClientView.getPreviousButton().addActionListener(this);
        this.consultClientView.getHomeButton().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public ConsultClient getConsultClientView() {
        return consultClientView;
    }

    public void setConsultClientView(ConsultClient consultClientView) {
        this.consultClientView = consultClientView;
    }
}
