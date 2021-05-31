package Model;

import java.util.Date;

public class Location {

    private Date date_debut;
    private Date date_fin;
    private Date date_rendu;
    private Client client;
    private Facture facture;
    private Assurance assurance;
    private Vehicule vehicule;

    public Location(Date date_debut, Date date_fin, Date date_rendu, Client client, Facture facture, Assurance assurance, Vehicule vehicule) {
        this.date_debut = date_debut;
        this.date_fin = date_fin;
        this.date_rendu = date_rendu;
        this.client = client;
        this.facture = facture;
        this.assurance = assurance;
        this.vehicule = vehicule;
    }


    public Date getDate_debut() {
        return date_debut;
    }

    public void setDate_debut(Date date_debut) {
        this.date_debut = date_debut;
    }

    public Date getDate_fin() {
        return date_fin;
    }

    public void setDate_fin(Date date_fin) {
        this.date_fin = date_fin;
    }

    public Date getDate_rendu() {
        return date_rendu;
    }

    public void setDate_rendu(Date date_rendu) {
        this.date_rendu = date_rendu;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Facture getFacture() {
        return facture;
    }

    public void setFacture(Facture facture) {
        this.facture = facture;
    }

    public Assurance getAssurance() {
        return assurance;
    }

    public void setAssurance(Assurance assurance) {
        this.assurance = assurance;
    }

    public Vehicule getVehicule() {
        return vehicule;
    }

    public void setVehicule(Vehicule vehicule) {
        this.vehicule = vehicule;
    }
}
