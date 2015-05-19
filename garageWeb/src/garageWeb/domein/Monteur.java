package garageWeb.domein;
import java.io.Serializable;

public class Monteur implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5308220307169650709L;
	private String naam, gebruikersnaam, wachtwoord, adres;
	
	public Monteur(String naam,  String adres, String gebruikersnaam, String wachtwoord) {
		this.naam = naam;
		this.adres = adres;
		this.wachtwoord = wachtwoord;
		this.setGebruikersnaam(gebruikersnaam);
	}
	
	// Setters
	public void setNaam(String naam) {
		this.naam = naam;
	}
	
	public void setWachtwoord(String wachtwoord) {
		this.wachtwoord = wachtwoord;
	}
	
	public void setAdres(String adres) { 
		this.adres = adres;
	}
	
	// Getters
	public String getNaam() {
		return naam;
	}
	
	public String getWachtwoord() {
		return wachtwoord;
	}
	
	public String getAdres() {
		return adres;
	}

	public String getGebruikersnaam() {
		return gebruikersnaam;
	}

	public void setGebruikersnaam(String gebruikersnaam) {
		this.gebruikersnaam = gebruikersnaam;
	}
}
