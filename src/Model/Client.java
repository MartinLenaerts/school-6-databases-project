package Model;

public class Client extends Personne {

	private Location[] locations;
	private Assurance[] souscriptions;
	private Assurance[] renouvellements;

	public Client(int ID_personne, String nom, String prenom, String email, String telephone, String login, String password, Adresse attribute, Adresse adresse, Location[] locations, Assurance[] souscriptions, Assurance[] renouvellements) {
		super(ID_personne, nom, prenom, email, telephone, login, password, attribute, adresse);
		this.locations = locations;
		this.souscriptions = souscriptions;
		this.renouvellements = renouvellements;
	}

	public Location[] getLocations() {
		return locations;
	}

	public void setLocations(Location[] locations) {
		this.locations = locations;
	}

	public Assurance[] getSouscriptions() {
		return souscriptions;
	}

	public void setSouscriptions(Assurance[] souscriptions) {
		this.souscriptions = souscriptions;
	}

	public Assurance[] getRenouvellements() {
		return renouvellements;
	}

	public void setRenouvellements(Assurance[] renouvellements) {
		this.renouvellements = renouvellements;
	}
}