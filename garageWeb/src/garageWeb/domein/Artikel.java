package garageWeb.domein;
import java.io.Serializable;

public class Artikel implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4598538340045013902L;
	private String naam, omschrijving;
	private char type;
	private int voorraad;
	private double prijs;
	
	public Artikel(String naam, String omschrijving, char type, int voorraad, double prijs) {
		this.naam = naam;
		this.omschrijving = omschrijving;
		this.type = type;
		this.voorraad = voorraad;
		this.prijs = prijs;
	}
	
	// Setters
	public void setNaam(String naam) {
		this.naam = naam;
	}
	
	public void setOmschrijving(String omschrijving) {
		this.omschrijving = omschrijving;
	}
	
	public void setType(char type) {
		this.type = type;
	}
	
	public void setVoorraad(int voorraad) {
		this.voorraad = voorraad;
	}
	
	public void setPrijs(double prijs) {
		this.prijs = prijs;
	}
	
	// Getters
	public String getNaam() {
		return naam;
	}
	
	public String getOmschrijving() {
		return omschrijving;
	}
	
	public char getType() {
		return type;
	}
	
	public int getVoorraad() {
		return voorraad;
	}
	
	public double getPrijs() {
		return prijs;
	}
}