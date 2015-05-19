package garageWeb.domein;
import java.io.Serializable;
import java.util.ArrayList;

public class Parkeerplaats implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5239331531776470248L;

	private int plaatsen, bezet, dubbel;

	private ArrayList<Reservering> reserveringen = new ArrayList<Reservering>();
	
	public Parkeerplaats(int plaatsen) {
		this.plaatsen = plaatsen;
	}
	
	// Setters
	public void setBezet(int bezet) {
		this.bezet = bezet;
	}
	
	public void setDubbel(int dubbel) {
		this.dubbel = dubbel;
	}

	public void setReservering(Reservering reservering) {
		reserveringen.add(reservering);
	}
	
	// Getters
	public int getBezet() {
		return bezet;
	}
	
	public int getDubbel() {
		return dubbel;
	}

	public ArrayList<Reservering> getReserveringen() {
		return reserveringen;
	}
}
