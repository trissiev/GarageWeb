package garageWeb.domein;
import java.io.Serializable;
import java.util.ArrayList;

public class Klant implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String gebruikersnaam, wachtwoord, naam, adres, email;
	
	private ArrayList<Auto> autos = new ArrayList<Auto>();
	
	public Klant(String naam, String adres, String email, String gebruikersnaam, String wachtwoord) {
		this.naam = naam;
		this.adres = adres;
		this.email = email;
		this.setGebruikersnaam(gebruikersnaam);
		this.setWachtwoord(wachtwoord);
	}
	
	// Setters
	public void setNaam(String naam) {
		this.naam = naam;
	}
	
	public void setAdres(String adres) {
		this.naam = adres;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setAuto(Auto auto) {
		autos.add(auto);
	}
	
	// Getters
	public String getNaam() {
		return naam;
	}
	
	public String getAdres() {
		return adres;
	}
	
	public String getEmail() {
		return email;
	}
	
	public ArrayList<Auto> getAutos() {
		return autos;
	}

	public String getGebruikersnaam() {
		return gebruikersnaam;
	}

	public void setGebruikersnaam(String gebruikersnaam) {
		this.gebruikersnaam = gebruikersnaam;
	}

	public String getWachtwoord() {
		return wachtwoord;
	}

	public void setWachtwoord(String wachtwoord) {
		this.wachtwoord = wachtwoord;
	}
	public void verwijderAuto(Auto a){
		autos.remove(a);
	}
}