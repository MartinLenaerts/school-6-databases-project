package Model;

import java.util.Date;

public class Programme_de_fidelite {


	private int ID_prog;
	private int duree;
	private String description;
	private int prix;
	private int taux_de_reduction;
	private Date date_debut;
	private Date date_fin;
	private Client[] souscriptions;
	private Client[] renouvellements;


	public Programme_de_fidelite(int ID_prog, int duree, String description, int prix, int taux_de_reduction, Date date_debut, Date date_fin, Client[] souscriptions, Client[] renouvellements) {
		this.ID_prog = ID_prog;
		this.duree = duree;
		this.description = description;
		this.prix = prix;
		this.taux_de_reduction = taux_de_reduction;
		this.date_debut = date_debut;
		this.date_fin = date_fin;
		this.souscriptions = souscriptions;
		this.renouvellements = renouvellements;
	}


	public int getID_prog() {
		return ID_prog;
	}

	public void setID_prog(int ID_prog) {
		this.ID_prog = ID_prog;
	}

	public int getDuree() {
		return duree;
	}

	public void setDuree(int duree) {
		this.duree = duree;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPrix() {
		return prix;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}

	public int getTaux_de_reduction() {
		return taux_de_reduction;
	}

	public void setTaux_de_reduction(int taux_de_reduction) {
		this.taux_de_reduction = taux_de_reduction;
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

	public Client[] getSouscriptions() {
		return souscriptions;
	}

	public void setSouscriptions(Client[] souscriptions) {
		this.souscriptions = souscriptions;
	}

	public Client[] getRenouvellements() {
		return renouvellements;
	}

	public void setRenouvellements(Client[] renouvellements) {
		this.renouvellements = renouvellements;
	}
}

