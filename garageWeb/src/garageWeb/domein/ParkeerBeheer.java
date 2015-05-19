package garageWeb.domein;

import java.io.Serializable;

public class ParkeerBeheer implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7913149617457522977L;
	private String naam, gebruikersnaam, wachtwoord;
	
	public ParkeerBeheer(String naam, String gebruikersnaam, String wachtwoord){
		this.setNaam(naam);
		this.setGebruikersnaam(gebruikersnaam);
		this.setWachtwoord(wachtwoord);
	}

	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
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

}
