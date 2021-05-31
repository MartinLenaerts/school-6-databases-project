package Controller;

import Model.Client;
import View.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ModifierClientController implements ActionListener {

    private ModifierClient modifierClient;

    public ModifierClientController(ModifierClient modifierClient) {
        this.modifierClient = modifierClient;

        this.modifierClient.getPreviousButton().addActionListener(this);
        this.modifierClient.getHomeButton().addActionListener(this);
        this.modifierClient.getBtnValider().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == this.modifierClient.getPreviousButton()){
            new AccueilClient((Window) this.modifierClient.getWindow());
        } else if (e.getSource() == this.modifierClient.getHomeButton()) {
            new Home((Window) this.modifierClient.getWindow());
        }else if(e.getSource() == this.modifierClient.getBtnValider()){
            Client client = new Client(
                    this.modifierClient.getClient().getID_personne(),
                    this.modifierClient.getTextNom().getText(),
                    this.modifierClient.getTextPrenom().getText(),
                    this.modifierClient.getTextEmail().getText(),
                    this.modifierClient.getTextTel().getText(),
                    this.modifierClient.getClient().getLogin(),
                    this.modifierClient.getClient().getPassword());
            client.update();
            new AccueilClient((Window) this.modifierClient.getWindow());
        }
    }

}
