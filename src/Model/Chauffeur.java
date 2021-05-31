package Model;

public class Chauffeur extends Employe {

	private Agence agence;
	private int nbr_place_dispo;


	public Chauffeur(int ID_personne, String nom, String prenom, String email, String telephone, String login, String password,   Adresse adresse, Vehicule[] vehicules, Agence agence, Agence agence1, int nbr_place_dispo) {
		super(ID_personne, nom, prenom, email, telephone, login, password,  adresse, vehicules, agence);
		this.agence = agence1;
		this.nbr_place_dispo = nbr_place_dispo;
	}

	public Agence getAgence() {
		return agence;
	}

	public void setAgence(Agence agence) {
		this.agence = agence;
	}

	public int getNbr_place_dispo() {
		return nbr_place_dispo;
	}

	public void setNbr_place_dispo(int nbr_place_dispo) {
		this.nbr_place_dispo = nbr_place_dispo;
	}
}