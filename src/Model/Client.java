package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Client extends Personne implements BddModel {

    private Location[] locations;
    private Assurance[] souscriptions;
    private Assurance[] renouvellements;
    private Connection connection;

    public Client(int ID_personne) {
        super(ID_personne);
        this.connection = SingletonConnection.getInstance();
    }


    public Client(int ID_personne, String nom, String prenom, String email, String telephone, String login, String password, Adresse adresse) {
        super(ID_personne, nom, prenom, email, telephone, login, password, adresse);
        this.connection = SingletonConnection.getInstance();
    }


    public Client(int ID_personne, String nom, String prenom, String email, String telephone, String login, String password) {
        super(ID_personne, nom, prenom, email, telephone, login, password);
        this.connection = SingletonConnection.getInstance();
    }


    public Client(int ID_personne, String nom, String prenom, String email, String telephone, String login, String password, Adresse adresse, Location[] locations, Assurance[] souscriptions, Assurance[] renouvellements) {
        super(ID_personne, nom, prenom, email, telephone, login, password, adresse);
        this.locations = locations;
        this.souscriptions = souscriptions;
        this.renouvellements = renouvellements;
        this.connection = SingletonConnection.getInstance();
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


    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    @Override
    public boolean add() {
        try {
            String queryAdresse = "INSERT INTO adresse VALUES ( ?,?,?)";
            PreparedStatement stateAdresse = this.connection.prepareStatement(queryAdresse,
                    ResultSet.TYPE_FORWARD_ONLY,
                    ResultSet.CONCUR_UPDATABLE);
            stateAdresse.setString(1, this.getAdresse().getRue());
            stateAdresse.setString(2, this.getAdresse().getVille());
            stateAdresse.setInt(3, this.getAdresse().getCode_postal());
            int adresseId = stateAdresse.executeUpdate();

            String query = "INSERT INTO client VALUES ( ?, ?,?,?,?,?,?)";
            PreparedStatement state = this.connection.prepareStatement(query,
                    ResultSet.TYPE_FORWARD_ONLY,
                    ResultSet.CONCUR_UPDATABLE);
            state.setString(1, this.getNom());
            state.setString(2, this.getPrenom());
            state.setString(3, this.getEmail());
            state.setString(4, this.getTelephone());
            state.setString(5, this.getLogin());
            state.setString(6, this.getPassword());
            state.setInt(7, adresseId);
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean remove() {
        try {
            String query = "DELETE FROM client WHERE idPersonne = ?";
            PreparedStatement state = this.connection.prepareStatement(query,
                    ResultSet.TYPE_FORWARD_ONLY,
                    ResultSet.CONCUR_UPDATABLE);
            state.setInt(1, this.getID_personne());
            state.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean find() {
        try {
            String query = "SELECT *  FROM client c  , adresse a WHERE c.idAdresse = a.idAdresse AND idPersonne = ?";
            PreparedStatement state = this.connection.prepareStatement(query,
                    ResultSet.TYPE_FORWARD_ONLY,
                    ResultSet.CONCUR_UPDATABLE);
            state.setInt(1, this.getID_personne());
            ResultSet result = state.executeQuery();
            if (result.first()) {
                this.setNom(result.getString("nom"));
                this.setPrenom(result.getString("prenom"));
                this.setEmail(result.getString("email"));
                this.setTelephone(result.getString("telepehone"));
                this.setLogin(result.getString("login"));
                this.setPassword(result.getString("password"));
                this.setAdresse(new Adresse(result.getInt("idAdresse"), result.getString("rue"), result.getString("ville"), result.getInt("code_postal")));
                return true;
            } else {
                return false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean update() {
        try {
            String query = "UPDATE client SET nom = ?, prenom = ? , email = ?,telephone = ? , login = ? , password = ? WHERE idPersonne = ?";
            PreparedStatement state = this.connection.prepareStatement(query,
                    ResultSet.TYPE_FORWARD_ONLY,
                    ResultSet.CONCUR_UPDATABLE);
            state.setString(1, this.getNom());
            state.setString(2, this.getPrenom());
            state.setString(3, this.getEmail());
            state.setString(4, this.getTelephone());
            state.setString(5, this.getLogin());
            state.setString(6, this.getPassword());
            state.executeUpdate();


            String queryAdresse = "UPDATE adresse SET rue = ?, ville = ? , code_postal = ? WHERE idAdresse = ?";
            PreparedStatement stateAdresse = this.connection.prepareStatement(queryAdresse,
                    ResultSet.TYPE_FORWARD_ONLY,
                    ResultSet.CONCUR_UPDATABLE);
            stateAdresse.setString(1, this.getAdresse().getRue());
            stateAdresse.setString(2, this.getAdresse().getVille());
            stateAdresse.setInt(3, this.getAdresse().getCode_postal());
            stateAdresse.setInt(3, this.getAdresse().getID_adresse());
            stateAdresse.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }


    public static ArrayList<Object> getAll() {
        try {
            ArrayList<Object> clients = new ArrayList<Object>();
            String query = "SELECT *  FROM client c  , adresse a WHERE c.idAdresse = a.idAdresse ";
            PreparedStatement state = SingletonConnection.getInstance().prepareStatement(query, ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE);
            ResultSet result = state.executeQuery();
            while (result.next()) {
                clients.add(new Client(
                        result.getInt("idPersonne"),
                        result.getString("nom"),
                        result.getString("prenom"),
                        result.getString("email"),
                        result.getString("telephone"),
                        result.getString("login"),
                        result.getString("password"),
                        new Adresse(result.getInt("idAdresse"), result.getString("rue"), result.getString("ville"), result.getInt("code_postal"))));
            }
            return clients;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }


    @Override
    public String toString() {
        return this.getNom() + " " + this.getPrenom();
    }
}