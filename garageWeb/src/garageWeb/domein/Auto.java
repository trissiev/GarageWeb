package garageWeb.domein;
import java.io.Serializable;
import java.util.ArrayList;

public class Auto implements Serializable {
	private String merk, kenteken;
	
	private ArrayList<Klus> klussen = new ArrayList<Klus>();
	private ArrayList<ReserveerKlus> reserveerKlussen = new ArrayList<ReserveerKlus>();
	
	public Auto(String merk, String kenteken) {
		this.merk = merk;
		this.kenteken = kenteken;
	}
	
	// Setters
	public void setMerk(String merk) {
		this.merk = merk;
	}
	
	public void setKenteken(String kenteken) {
		this.kenteken = kenteken;
	}
	
	public void setKlus(Klus klus) {
		klussen.add(klus);
	}
	
	// Getters
	public String getMerk() {
		return merk;
	}
	
	public String getKenteken() {
		return kenteken;
	}
	
	public ArrayList<Klus> getKlussen() {
		return klussen;
	}
	
	// Custom
	public void removeKlus(Klus klus) {
		klussen.remove(klus);
	}

	public ArrayList<ReserveerKlus> getReserveerKlussen() {
		return reserveerKlussen;
	}

	public void setReserveerKlus(ReserveerKlus reserveerKlus) {
		reserveerKlussen.add(reserveerKlus);
	}
}