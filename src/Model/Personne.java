package Model;

public class Personne {


	private int ID_personne;
	private String nom;
	private String prenom;
	private String email;
	private String telephone;
	private String login;
	private String password;
	private Adresse attribute;
	private Adresse adresse;


	public Personne(int ID_personne, String nom, String prenom, String email, String telephone, String login, String password, Adresse attribute, Adresse adresse) {
		this.ID_personne = ID_personne;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.telephone = telephone;
		this.login = login;
		this.password = password;
		this.attribute = attribute;
		this.adresse = adresse;
	}


	public int getID_personne() {
		return ID_personne;
	}

	public void setID_personne(int ID_personne) {
		this.ID_personne = ID_personne;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Adresse getAttribute() {
		return attribute;
	}

	public void setAttribute(Adresse attribute) {
		this.attribute = attribute;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}
}