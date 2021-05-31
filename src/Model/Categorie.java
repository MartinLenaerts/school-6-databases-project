package Model;

public class Categorie {

	private int ID_categorie;
	private String nom;
	private int tarif;
	private int caution;
	private Vehicule[] vehicules;


	public Categorie(int ID_categorie, String nom, int tarif, int caution, Vehicule[] vehicules) {
		this.ID_categorie = ID_categorie;
		this.nom = nom;
		this.tarif = tarif;
		this.caution = caution;
		this.vehicules = vehicules;
	}


	public int getID_categorie() {
		return ID_categorie;
	}

	public void setID_categorie(int ID_categorie) {
		this.ID_categorie = ID_categorie;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getTarif() {
		return tarif;
	}

	public void setTarif(int tarif) {
		this.tarif = tarif;
	}

	public int getCaution() {
		return caution;
	}

	public void setCaution(int caution) {
		this.caution = caution;
	}

	public Vehicule[] getVehicules() {
		return vehicules;
	}

	public void setVehicules(Vehicule[] vehicules) {
		this.vehicules = vehicules;
	}
}