package Model;

public class Adresse {

    private int ID_adresse;
    private String rue;
    private String ville;
    private int code_postal;
    private Personne[] personnes;
    private Agence[] agences;

    public Adresse(int ID_adresse, String rue, String ville, int code_postal) {
        this.ID_adresse = ID_adresse;
        this.rue = rue;
        this.ville = ville;
        this.code_postal = code_postal;
    }


    public Adresse(int ID_adresse, String rue, String ville, int code_postal, Personne[] personnes, Agence[] agences) {
        this.ID_adresse = ID_adresse;
        this.rue = rue;
        this.ville = ville;
        this.code_postal = code_postal;
        this.personnes = personnes;
        this.agences = agences;
    }

    public int getID_adresse() {
        return ID_adresse;
    }

    public void setID_adresse(int ID_adresse) {
        this.ID_adresse = ID_adresse;
    }

    public String getRue() {
        return rue;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public int getCode_postal() {
        return code_postal;
    }

    public void setCode_postal(int code_postal) {
        this.code_postal = code_postal;
    }

    public Personne[] getPersonnes() {
        return personnes;
    }

    public void setPersonnes(Personne[] personnes) {
        this.personnes = personnes;
    }

    public Agence[] getAgences() {
        return agences;
    }

    public void setAgences(Agence[] agences) {
        this.agences = agences;
    }
}