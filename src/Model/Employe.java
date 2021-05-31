package Model;

public class Employe extends Personne {

	private Vehicule[] vehicules;
	private Agence agence;

	public Employe(int ID_personne, String nom, String prenom, String email, String telephone, String login, String password, Adresse attribute, Adresse adresse, Vehicule[] vehicules, Agence agence) {
		super(ID_personne, nom, prenom, email, telephone, login, password, attribute, adresse);
		this.vehicules = vehicules;
		this.agence = agence;
	}

	public Vehicule[] getVehicules() {
		return vehicules;
	}

	public void setVehicules(Vehicule[] vehicules) {
		this.vehicules = vehicules;
	}

	public Agence getAgence() {
		return agence;
	}

	public void setAgence(Agence agence) {
		this.agence = agence;
	}
}