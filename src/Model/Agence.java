package Model;

public class Agence {

	private int ID_agence;
	private String nom;
	private int telephone;
	private int nbr_place;
	private String coordonnes_gps;
	private int recette;
	private Vehicule[] vehicules;
	private Adresse adresse;
	private Employe[] employes;


	public Agence(int ID_agence, String nom, int telephone, int nbr_place, String coordonnes_gps, int recette, Vehicule[] vehicules, Adresse adresse, Employe[] employes) {
		this.ID_agence = ID_agence;
		this.nom = nom;
		this.telephone = telephone;
		this.nbr_place = nbr_place;
		this.coordonnes_gps = coordonnes_gps;
		this.recette = recette;
		this.vehicules = vehicules;
		this.adresse = adresse;
		this.employes = employes;
	}

	public int getID_agence() {
		return ID_agence;
	}

	public void setID_agence(int ID_agence) {
		this.ID_agence = ID_agence;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getTelephone() {
		return telephone;
	}

	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}

	public int getNbr_place() {
		return nbr_place;
	}

	public void setNbr_place(int nbr_place) {
		this.nbr_place = nbr_place;
	}

	public String getCoordonnes_gps() {
		return coordonnes_gps;
	}

	public void setCoordonnes_gps(String coordonnes_gps) {
		this.coordonnes_gps = coordonnes_gps;
	}

	public int getRecette() {
		return recette;
	}

	public void setRecette(int recette) {
		this.recette = recette;
	}

	public Vehicule[] getVehicules() {
		return vehicules;
	}

	public void setVehicules(Vehicule[] vehicules) {
		this.vehicules = vehicules;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public Employe[] getEmployes() {
		return employes;
	}

	public void setEmployes(Employe[] employes) {
		this.employes = employes;
	}
}