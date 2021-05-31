package Model;

public class Vehicule {

	private int matricule;
	private String marque;
	private String modele;
	private int kilometrage;
	private boolean automatique;
	private boolean climatise;
	private String carburant;
	private String etat_origine;
	private Categorie categorie;
	private Agence agence;
	private Employe[] employes;
	private Location[] locations;


	public Vehicule(int matricule, String marque, String modele, int kilometrage, boolean automatique, boolean climatise, String carburant, String etat_origine, Categorie categorie, Agence agence, Employe[] employes, Location[] locations) {
		this.matricule = matricule;
		this.marque = marque;
		this.modele = modele;
		this.kilometrage = kilometrage;
		this.automatique = automatique;
		this.climatise = climatise;
		this.carburant = carburant;
		this.etat_origine = etat_origine;
		this.categorie = categorie;
		this.agence = agence;
		this.employes = employes;
		this.locations = locations;
	}


	public int getMatricule() {
		return matricule;
	}

	public void setMatricule(int matricule) {
		this.matricule = matricule;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public String getModele() {
		return modele;
	}

	public void setModele(String modele) {
		this.modele = modele;
	}

	public int getKilometrage() {
		return kilometrage;
	}

	public void setKilometrage(int kilometrage) {
		this.kilometrage = kilometrage;
	}

	public boolean isAutomatique() {
		return automatique;
	}

	public void setAutomatique(boolean automatique) {
		this.automatique = automatique;
	}

	public boolean isClimatise() {
		return climatise;
	}

	public void setClimatise(boolean climatise) {
		this.climatise = climatise;
	}

	public String getCarburant() {
		return carburant;
	}

	public void setCarburant(String carburant) {
		this.carburant = carburant;
	}

	public String getEtat_origine() {
		return etat_origine;
	}

	public void setEtat_origine(String etat_origine) {
		this.etat_origine = etat_origine;
	}

	public Categorie getCategorie() {
		return categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

	public Agence getAgence() {
		return agence;
	}

	public void setAgence(Agence agence) {
		this.agence = agence;
	}

	public Employe[] getEmployes() {
		return employes;
	}

	public void setEmployes(Employe[] employes) {
		this.employes = employes;
	}

	public Location[] getLocations() {
		return locations;
	}

	public void setLocations(Location[] locations) {
		this.locations = locations;
	}
}