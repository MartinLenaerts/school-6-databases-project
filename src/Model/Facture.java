package Model;

public class Facture {


	private int ID_facture;
	private int penalite;
	private int niveau_carburant;
	private int supplement;
	private String etat_vehicule;
	private Location location;

	public Facture(int ID_facture, int penalite, int niveau_carburant, int supplement, String etat_vehicule, Location location) {
		this.ID_facture = ID_facture;
		this.penalite = penalite;
		this.niveau_carburant = niveau_carburant;
		this.supplement = supplement;
		this.etat_vehicule = etat_vehicule;
		this.location = location;
	}

	public int getID_facture() {
		return ID_facture;
	}

	public void setID_facture(int ID_facture) {
		this.ID_facture = ID_facture;
	}

	public int getPenalite() {
		return penalite;
	}

	public void setPenalite(int penalite) {
		this.penalite = penalite;
	}

	public int getNiveau_carburant() {
		return niveau_carburant;
	}

	public void setNiveau_carburant(int niveau_carburant) {
		this.niveau_carburant = niveau_carburant;
	}

	public int getSupplement() {
		return supplement;
	}

	public void setSupplement(int supplement) {
		this.supplement = supplement;
	}

	public String getEtat_vehicule() {
		return etat_vehicule;
	}

	public void setEtat_vehicule(String etat_vehicule) {
		this.etat_vehicule = etat_vehicule;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}
}