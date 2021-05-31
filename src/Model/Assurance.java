package Model;

public class Assurance {

	private int ID_ass;
	private int tarif;
	private Location[] locations;

	public Assurance(int ID_ass, int tarif, Location[] locations) {
		this.ID_ass = ID_ass;
		this.tarif = tarif;
		this.locations = locations;
	}


	public int getID_ass() {
		return ID_ass;
	}

	public void setID_ass(int ID_ass) {
		this.ID_ass = ID_ass;
	}

	public int getTarif() {
		return tarif;
	}

	public void setTarif(int tarif) {
		this.tarif = tarif;
	}

	public Location[] getLocations() {
		return locations;
	}

	public void setLocations(Location[] locations) {
		this.locations = locations;
	}
}